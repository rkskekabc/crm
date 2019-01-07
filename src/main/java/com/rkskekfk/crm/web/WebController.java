package com.rkskekfk.crm.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rkskekfk.crm.service.GamesService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class WebController {
	private GamesService gamesService;
	
	@GetMapping("/")
	public String main() {
		return "main";
	}
	
	@GetMapping("/gameList")
	public String gameList(Model model) {
		model.addAttribute("games", gamesService.findAllDesc());
		return "games/list";
	}
	
	@GetMapping("/gameList/{id}")
	public String selectGame(@PathVariable("id") Long id, Model model) {
		model.addAttribute("game", gamesService.findOne(id));
		return "games/detail";
	}
}
