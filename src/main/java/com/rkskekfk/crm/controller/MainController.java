package com.rkskekfk.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rkskekfk.crm.dto.members.MembersSaveRequestDto;
import com.rkskekfk.crm.service.MembersService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class MainController {
	private MembersService membersService;
	
	@GetMapping("/")
	public String main() {
		return "main";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/register")
	public Long doRegister(@RequestBody MembersSaveRequestDto dto) {
		return membersService.save(dto);
	}
}
