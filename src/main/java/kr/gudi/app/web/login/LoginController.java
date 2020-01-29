package kr.gudi.app.web.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired private LoginService loginService;
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {return "login";}
	
	@RequestMapping(value = "security/success", method = RequestMethod.POST)
	public String success() {return "redirect:/";}
	
	@RequestMapping(value = "security/error", method = RequestMethod.POST)
	public String error() {return "redirect:/login";}
	
}
