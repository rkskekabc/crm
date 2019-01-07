package com.rkskekfk.crm.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rkskekfk.crm.dto.games.GamesSaveRequestDto;
import com.rkskekfk.crm.service.GamesService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {
	private GamesService gamesService;
	
	@PostMapping("/games")
	public Long saveGames(@RequestBody GamesSaveRequestDto dto) {
		return gamesService.save(dto);
	}
}
