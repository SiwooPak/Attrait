package www.sts.attrait;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import www.model.sale.ISaleDAO;
import www.model.sale.SaleDTO;
import www.utility.attrait.Utility;

@RequestMapping("/admin/sale")
@Controller
public class SaleController {
	@Autowired
	private ISaleDAO dao;
	
	@RequestMapping(value="/list")
	public String List(HttpServletRequest request, Model model) throws Exception {
				
		int nowPage = 1; 
		int recordPerPage = 20;

		if(request.getParameter("nowPage")!=null){
			nowPage = Integer.parseInt(request.getParameter("nowPage"));
		}

		int sno = ((nowPage-1)*recordPerPage) + 1;
		int eno = nowPage * recordPerPage;
		
		Map map = new HashMap();
		map.put("sno", sno);
		map.put("eno", eno);
		map.put("col", request.getParameter("col"));
		map.put("to_date", request.getParameter("to_date"));
		map.put("from_date", request.getParameter("from_date"));
		
		int totalRecord = dao.total(map); 
		List<SaleDTO> list = dao.list(map);	
		String paging = Utility.spaging("/admin/sale/sale_view", totalRecord, nowPage, recordPerPage);
		
		request.setAttribute("list", list);
		request.setAttribute("nowPage", nowPage);
		request.setAttribute("paging", paging);
		
		return "/admin/sale/sale_view";
	}
	
	@RequestMapping(value="/exportToExcel", method=RequestMethod.POST)
	public ModelAndView toExcel(HttpServletRequest request) throws Exception{
		ModelAndView mov = new ModelAndView();
		Calendar now = new GregorianCalendar();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int MILLISECOND = now.get(Calendar.MILLISECOND);
		StringBuffer str = new StringBuffer();
		str.append(year).append(month).append(day).append(hour).append(minute).append(second).append(MILLISECOND);
		mov.addObject("list", request.getParameter("result_list"));
		mov.addObject("filename", str);
		mov.setViewName("/admin/sale/exportToExcel");
		return mov;
	}
	
	@RequestMapping(value="/day")
	public String dayList(HttpServletRequest request, Model model) throws Exception {
				
		int nowPage = 1; 
		int recordPerPage = 20;

		if(request.getParameter("nowPage")!=null){
			nowPage = Integer.parseInt(request.getParameter("nowPage"));
		}

		int sno = ((nowPage-1)*recordPerPage) + 1;
		int eno = nowPage * recordPerPage;
		
		Map map = new HashMap();
		map.put("sno", sno);
		map.put("eno", eno);
		map.put("sdate", request.getParameter("sdate"));
		map.put("sales_start", request.getParameter("sales_start"));
		map.put("sales_end", request.getParameter("sales_end"));
		
		int totalRecord = dao.total(map); 
		//List<SaleDTO> list = dao.list();	
		String paging = Utility.spaging("list", totalRecord, nowPage, recordPerPage);
		
		//request.setAttribute("list", list);
		request.setAttribute("nowPage", nowPage);
		request.setAttribute("paging", paging);
		
		return "/admin/sale/sale_day";
	}
	
	
	@RequestMapping(value="/month")
	public String monList(HttpServletRequest request, Model model) throws Exception {
				
		int nowPage = 1; 
		int recordPerPage = 20;

		if(request.getParameter("nowPage")!=null){
			nowPage = Integer.parseInt(request.getParameter("nowPage"));
		}

		int sno = ((nowPage-1)*recordPerPage) + 1;
		int eno = nowPage * recordPerPage;
		
		Map map = new HashMap();
		map.put("sno", sno);
		map.put("eno", eno);
		map.put("sdate", request.getParameter("sdate"));
		map.put("sales_start", request.getParameter("sales_start"));
		map.put("sales_end", request.getParameter("sales_end"));
		
		int totalRecord = dao.total(map); 
		//List<SaleDTO> list = dao.list();	
		String paging = Utility.spaging("list", totalRecord, nowPage, recordPerPage);
		
		//request.setAttribute("list", list);
		request.setAttribute("nowPage", nowPage);
		request.setAttribute("paging", paging);
		
		return "/admin/sale/sale_month";
	}
	
	@RequestMapping(value="/pdt")
	public String pdtList(HttpServletRequest request, Model model) throws Exception {
				
		int nowPage = 1; 
		int recordPerPage = 20;

		if(request.getParameter("nowPage")!=null){
			nowPage = Integer.parseInt(request.getParameter("nowPage"));
		}

		int sno = ((nowPage-1)*recordPerPage) + 1;
		int eno = nowPage * recordPerPage;
		
		Map map = new HashMap();
		map.put("sno", sno);
		map.put("eno", eno);
		map.put("sdate", request.getParameter("sdate"));
		map.put("sales_start", request.getParameter("sales_start"));
		map.put("sales_end", request.getParameter("sales_end"));
		
		int totalRecord = dao.total(map); 
		//List<SaleDTO> list = dao.list();	
		String paging = Utility.spaging("list", totalRecord, nowPage, recordPerPage);
		
		//request.setAttribute("list", list);
		request.setAttribute("nowPage", nowPage);
		request.setAttribute("paging", paging);
		
		return "/admin/sale/sale_pdt";
	}
	
	@RequestMapping(value="/test")
	public String graphTest() throws Exception {
				
		return "/admin/sale/graphTest";
	}
}