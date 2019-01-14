package com.rkskekfk.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rkskekfk.crm.service.RevenuesService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class RevenuesController {
	private RevenuesService revenuesService;
	
	@GetMapping("/revenueList")
	public String revenueList(Model model) {
		model.addAttribute("revenueList", revenuesService.findAllDesc());
		return "revenues/list";
	}
}
