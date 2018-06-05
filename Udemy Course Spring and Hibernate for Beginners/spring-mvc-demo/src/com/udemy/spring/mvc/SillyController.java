package com.udemy.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/silly")
public class SillyController {

	@RequestMapping("/Hello-form")
	public String getForm() {
		return "Hello-form";
	}
	
	@RequestMapping("/processForm")
	public String processHelloForm(HttpServletRequest request,Model model) {
		String name =request.getParameter("studentName");
		
		model.addAttribute("name",name);
		return "hello";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String versionTwoProcessName(HttpServletRequest request,Model model) {
		
		String name=request.getParameter("studentName");
		
		String result="Yo I am"+name.toUpperCase();
		
		model.addAttribute("message",result);
		
		return "helloVersionTwo";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String versionThreeProcessName(@RequestParam("studentName")String name,Model model) {	
				
		String result="Yo I am "+name.toUpperCase()+ " v3 in silly";
		
		model.addAttribute("message",result);
		
		return "helloVersionTwo";
	}
	
	
}
