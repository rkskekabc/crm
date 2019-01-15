package com.rkskekfk.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class MainController {
	
	@GetMapping("/")
	public String main() {
		return "main";
	}
}