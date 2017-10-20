package www.sts.attrait;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AdminHomeController {
	
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public String home() {
		
		System.out.println("Controller 출력");
		
		return "/admin/home";
	}
}
