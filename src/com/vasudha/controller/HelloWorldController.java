package com.vasudha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;

/**
 * @author VJ
 *
 */

@Controller
public class HelloWorldController {
	
	@RequestMapping("/welcome/country/{countryName}")
	public ModelAndView helloWorld(@PathVariable("countryName") String countryName){
		ModelAndView model = new ModelAndView("HelloPage");

		model.addObject("msg", "hi"+countryName);
		return model;
		
	}
	
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) { 
	        configurer.enable();
	}
	
}
