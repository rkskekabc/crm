package com.rkskekfk.crm.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rkskekfk.crm.dto.buy.BuyGameRequestDto;
import com.rkskekfk.crm.service.BuyService;
import com.rkskekfk.crm.service.GamesService;
import com.rkskekfk.crm.service.RevenuesService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class WebController {
	private GamesService gamesService;
	private RevenuesService revenuesService;
	private BuyService buyService;
	
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
	
	@GetMapping("/revenueList")
	public String revenueList(Model model) {
		model.addAttribute("revenues", revenuesService.findAllDesc());
		return "revenues/list";
	}
	
	@PostMapping("/buyGame")
	public String buyGame(@RequestBody BuyGameRequestDto dto) {
		return buyService.buyGame(dto);
	}
}
