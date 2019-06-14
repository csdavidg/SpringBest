package com.david.springboot.demo.mycoolapspringboot.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@Value("${team.name}")
	private String team;
	
	@Value("${coach.name}")
	private String name;
	
	@GetMapping("/")
	public String helloWorld() {
		return name + "  Hello date and time on server is: " + LocalDate.now() + LocalTime.now();
	}
	
	@GetMapping("/workout")
	public String workOut() {
		return team + "  You have to workout at : " + LocalDate.now() + LocalTime.now();
	}

}
