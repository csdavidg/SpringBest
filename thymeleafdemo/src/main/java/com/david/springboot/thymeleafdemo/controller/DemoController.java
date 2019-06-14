package com.david.springboot.thymeleafdemo.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/hello")
	public String helloWorld(Model model) {
		model.addAttribute("date", LocalDate.now());
		return "hello";
	}

}
