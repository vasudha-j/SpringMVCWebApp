package com.vasudha.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;


/**
 * @author VJ
 *
 */

@Controller
public class HelloWorldController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld( ){
		ModelAndView model = new ModelAndView("HelloPage");

		model.addObject("f1", "Spring is light weight and It minimally invasive development with POJO");
		model.addObject("f2", "Spring achieves the loose coupling through dependency injection and interface based programming.");
		model.addObject("f3", "Declarative programming through aspects and common conventions.");
		model.addObject("f4", "Boilerplate reduction through aspects and templates.");
//		model.addObject("f5", "hi");
//		model.addObject("f6", "hi");
//		model.addObject("f7", "hi");

		return model;
		
	}
	
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) { 
	        configurer.enable();
	}
	
	@RequestMapping(value="/form2.html" , method = RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		
		ModelAndView model = new ModelAndView("form2");
		return model;
		
	}
	
	@RequestMapping(value="/form1.html" , method = RequestMethod.POST)
	public ModelAndView updateRecords(@RequestParam("name") String name, @RequestParam("place") String place){
		
		ModelAndView model = new ModelAndView("form1");

		model.addObject("name", "Updated name as  : "+ name + ", and place as : " + place);
		return model;
		
	}
	
//	@RequestMapping(value="/form2.html" , method = RequestMethod.POST)
//	public ModelAndView updateRecordsWithMap(@RequestParam Map<String,String> reqPar){
//		String name = reqPar.get("name");
//		String place = reqPar.get("place");
//		
//		ModelAndView model = new ModelAndView("AdmissionSuccess");
//
//		model.addObject("msg", "Updated name as  : "+ name + ", and place as : " + place);
//		return model;
//		
//	}
	
//	@RequestMapping(value="/form2.html" , method = RequestMethod.POST)
//	public ModelAndView getRecords(@RequestParam("name") String name, @RequestParam("place") String place){
//		
//		ModelAndView model = new ModelAndView("AdmissionSuccess");
//
//		model.addObject("msg", "Records Name "+ name + ", Place : " + place);
//		return model;
		
//	}
	
}
