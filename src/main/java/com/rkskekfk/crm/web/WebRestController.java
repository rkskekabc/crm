package com.rkskekfk.crm.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rkskekfk.crm.dto.games.GamesSaveRequestDto;
import com.rkskekfk.crm.dto.members.MembersSaveRequestDto;
import com.rkskekfk.crm.dto.revenues.RevenueSaveRequestDto;
import com.rkskekfk.crm.service.GamesService;
import com.rkskekfk.crm.service.MembersService;
import com.rkskekfk.crm.service.RevenuesService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {
	private GamesService gamesService;
	private RevenuesService revenuesService;
	private MembersService membersService;
	
	@PostMapping("/games")
	public Long saveGames(@RequestBody GamesSaveRequestDto dto) {
		return gamesService.save(dto);
	}
	
	@PostMapping("/revenues")
	public Long saveRevenues(@RequestBody RevenueSaveRequestDto dto) {
		return revenuesService.save(dto);
	}
	
	@PostMapping("/register")
	public Long doRegister(@RequestBody MembersSaveRequestDto dto) {
		return membersService.save(dto);
	}
}
