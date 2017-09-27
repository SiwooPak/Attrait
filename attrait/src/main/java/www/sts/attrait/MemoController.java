package www.sts.attrait;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import www.model.memo.*;
import www.utility.attrait.Utility;

@Controller
public class MemoController {
	
		@Autowired
		private MemoDAO mdao;
		
		@Autowired
		private MemoService service;
		
		
		@RequestMapping(value="/memo/delete", method=RequestMethod.GET)
		public String delete(int memono, Model model) {
			
			boolean flag = mdao.getRefnum(memono);
			model.addAttribute("flag", flag);
			
			return "memo/deleteForm";
		}
		@RequestMapping(value="/memo/delete", method=RequestMethod.POST)
		public String delete(int memono, String passwd, Model model, String col, String word, int nowPage) {
			
			
			Map map2 = new HashMap();	
			map2.put("col", col);
			map2.put("word", word);
			
			int total = mdao.total(map2);
			int totalPage = (int)(Math.ceil((double)total/5));
			
			if(mdao.delete(memono)) {
			if(nowPage != 1 && nowPage == totalPage && total %5 == 1) {
					nowPage = nowPage -1;
				}
			
			model.addAttribute("col", col);
			model.addAttribute("word", word);
			model.addAttribute("nowPage", nowPage);
			
				return "redirect:./list";
			}else {
				return "error/error";
			}
			
		}
		
		@RequestMapping(value="/memo/reply",method=RequestMethod.GET)
		public String reply(int memono, Model model) {
			
			model.addAttribute("dto", mdao.replyRead(memono));
			
			return "memo/replyForm";
		}
		
		@RequestMapping(value="/memo/reply",method=RequestMethod.POST)
		public String reply(MemoDTO dto, Model model, String col, String word, String nowPage) {
			
			boolean flag = service.reply(dto);
			if(flag) {
				model.addAttribute("col", col);
				model.addAttribute("word", word);
				model.addAttribute("nowPage", nowPage);
				
				return "redirect:list";
			}else {
				return "error/error";
			}
		}
		
		@RequestMapping(value="/memo/create", method=RequestMethod.GET)
		public String create() {
			
			return "/memo/create";
		}
		
		@RequestMapping(value="/memo/create", method=RequestMethod.POST)
		public String create(MemoDTO dto) {
			
			boolean flag = mdao.create(dto);
			
			if(flag) {
				return "redirect:list";
			}else {
				return "error/error";
			}
		}
		
		@RequestMapping(value="/memo/update", method=RequestMethod.GET)
		public String update(int memono, Model model) {
			
			model.addAttribute("dto", mdao.read(memono));
			
			return "memo/updateForm";
		}
		
		@RequestMapping(value="/memo/update", method=RequestMethod.POST)
		public String update(MemoDTO dto, Model model, String col, String word, String nowPage) {
			int memono = dto.getMemono();
			boolean flag = mdao.update(memono);
			if(flag) {
				model.addAttribute("col", col);
				model.addAttribute("word", word);
				model.addAttribute("nowPage", nowPage);
				
				return "redirect:list";
			}else {
				return "error/error";
			}
			
		}
		
		@RequestMapping("/memo/read")
		public String read(int memono, Model model) {
			
			mdao.upviewcnt(memono);
			MemoDTO dto = mdao.read(memono);
			String content = dto.getContent();
			content = content.replaceAll("\r\n", "<br>");
			dto.setContent(content);
			
			model.addAttribute("dto", dto);
			
			return "memo/read";
			
		}
		
		@RequestMapping(value="/memo/list")
		public String list(HttpServletRequest request, Model model) {
			String col = Utility.checkNull(request.getParameter("col"));
			String word = Utility.checkNull(request.getParameter("word")); 
			
			if(col.equals("total")){ 
				word = ""; 
			}
			
			int nowPage = 1; 
			int recordPerPage = 5;

			if(request.getParameter("nowPage")!=null){
				nowPage = Integer.parseInt(request.getParameter("nowPage"));
			}
	
			int sno = ((nowPage-1)*recordPerPage) + 1;
			int eno = nowPage * recordPerPage;
			
			Map map = new HashMap();
			map.put("col", col);
			map.put("word", word);
			map.put("sno", sno);
			map.put("eno", eno);
			
			int totalRecord = mdao.total(map); 
			List<MemoDTO> list = mdao.list(map);	
			String paging = Utility.paging("list", totalRecord, nowPage, recordPerPage, col, word);
			
			request.setAttribute("list", list);
			request.setAttribute("col", col);
			request.setAttribute("word", word);
			request.setAttribute("nowPage", nowPage);
			request.setAttribute("paging", paging);
			
			return "/memo/list";
		}
	}
