package com.vasudha.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
		
		
		String f1 = "a";
		String f2 =  "a";
		String f3 =  "a";
		String f4 =  "a";
		String f5 =  "a";
		String f6 =  "a";
		Map<POJO, String> rows = new HashMap<POJO, String>();
		
		String f7 = "";
		
		int i = 1;
		
		while(i < 5){
			POJO val = new POJO();
			val.setValue(i);
			String rowNumber = String.valueOf(val.getValue());
			rows.put(val, rowNumber);
			
			i++;
		}
		
		
		
		for(Entry<POJO, String> entry : rows.entrySet()) {
		   
		    String value = entry.getValue();
		    f7 = f7 + "<td>" + value + "</td>";
		}
	

		model.addObject("f1", f1);
		model.addObject("f2", f2);
		model.addObject("f3", f3);
		model.addObject("f4", f4);
		model.addObject("rows",  f7);

		System.out.println("rows value ois " + f7);
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
