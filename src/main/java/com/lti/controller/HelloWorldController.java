package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloWorldController {
	
	@RequestMapping("/welcome")
public ModelAndView helloWorld()
{
	String msg="<br><div style='text-align:center;'>" + 
      "<h3>********Hello World from Spring MVC</h3>"
			+ "This message is coming from HelloWorldController.java*****</div><br><br>";
	//return new ModelAndView("welcome","message",msg);
	ModelAndView mv= new ModelAndView("welcome");
	mv.addObject("message",msg);
	mv.addObject("test","Created By Paithiyam");
	return mv;
	
	
}
}
