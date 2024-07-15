package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

@Controller
public class StudentOperationsController {


	@GetMapping("/")
	public String showHomePage() {
		
		return "welcome";
	}
	
	@GetMapping("/register")
	public String LaunchFormPage() {
		
		return "student_register";
	}
	
	
	@PostMapping("/register")
	public String registerStuden(@ModelAttribute("st") Student st, Map<String,Object> map)
	{
	
		System.out.println("StudentOperationsController.registerStuden()"+map.getClass());
		System.out.println("StudentOperationsController.registerStuden()"+st.getClass());
		
		map.put("model",st);
		
		return "show_results";
	}
}
