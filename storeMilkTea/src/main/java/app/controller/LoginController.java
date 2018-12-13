package app.controller;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController extends BaseController {
	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(value = "error", required = false) String error, Locale locale){
		logger.info("Login page");
		ModelAndView model = new ModelAndView("login");
		
		return  model;
	}
	@RequestMapping("/logout")
	public ModelAndView logout(Locale locale) {
		ModelAndView model = new ModelAndView("login");
		
		return model;
	}
}
