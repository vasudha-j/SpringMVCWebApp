package com.vasudha.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author VJ
 *
 */
public class HelloWorldController extends AbstractController {
	
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView modelAndView = new ModelAndView("Hello Page");
		
		modelAndView.addObject("welcomeMessage", "Hi! Welcome! ");
	 
		return modelAndView;
 }
	

}
