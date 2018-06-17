package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/index","/home"})
	public ModelAndView index(){
		
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting", "Welcome to the hello world");
		return mv;
	}
	

	
}
