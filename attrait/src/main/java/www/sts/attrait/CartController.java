package www.sts.attrait;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import www.model.cart.ICartService;

@Controller
public class CartController {
	
	@Autowired
	ICartService cart_service;
	
	@RequestMapping("/cart/list")
	public ModelAndView list(HttpSession session) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/cart/list");
		
		Map<String, String> map = new HashMap<String, String>();
		//map.put("u_id", (String)session.getAttribute("id"));
		map.put("u_id", "user1");
		
		mv.addObject("cart_list", cart_service.list(map));
		
		return mv;
	}
}
