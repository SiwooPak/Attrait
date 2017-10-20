package www.sts.attrait;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;

import www.model.user.IUserDAO;

@Controller
public class UserController {

	@Autowired
	private IUserDAO user_dao;
	
	@RequestMapping(value="/user/login", method=RequestMethod.GET)
	public String login() {
		return "/user/login";
	}
	@RequestMapping(value="/user/login", method=RequestMethod.POST)
	public ModelAndView login(String id,String pw, HttpSession session,ServletResponse response  ) throws IOException {
		ModelAndView mv = new ModelAndView();
		
		Map map = new HashMap();
		map.put("u_id", id);
		map.put("pw", pw);
		String auth = user_dao.login(map);
		
		if(auth!=null && !auth.equals("")) {
			session.setAttribute("id", id);
			session.setAttribute("auth", auth);
			
			mv.setViewName("redirect:/");
		}else {
			response.setContentType("text/html; charset=UTF-8");

            PrintWriter out = response.getWriter();

            out.println("<script type='text/javascript'>alert('로그인이 실패하였습니다.\\n다시 시도해주세요');location.href='/attrait/user/login?banner=Login'; </script>");   
            
            out.flush();
		}
		return mv;
	}
	
	@RequestMapping("/user/logout")
	public void logout(HttpSession session,ServletResponse response) throws IOException {
		session.invalidate();
		response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<script type='text/javascript'>alert('로그아웃이 완료되었습니다.');location.href='/attrait/'; </script>");  
        
        out.flush();
	}
}
