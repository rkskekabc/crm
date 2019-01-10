package com.rkskekfk.crm.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rkskekfk.crm.domain.games.Games;
import com.rkskekfk.crm.domain.games.GamesRepository;
import com.rkskekfk.crm.domain.revenue.Revenues;
import com.rkskekfk.crm.domain.revenue.RevenuesRepository;
import com.rkskekfk.crm.dto.buy.BuyGameRequestDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BuyService {
	private GamesRepository gamesRepository;
	private RevenuesRepository revenuesRepository;
	
	@Transactional
	public String buyGame(BuyGameRequestDto dto) {
		try {
			Games game = gamesRepository.findById(dto.getGameId()).get();
			int price = game.getPrice();
			revenuesRepository.save(Revenues.builder()
										.games(game)
										.sell_date(LocalDate.now())
										.sell_price(game.getPrice())
										.build());
			
			game.addRevenue(price);
			gamesRepository.save(game);
			
			return "success";
		} catch(Exception e) {
			return "fail";
		}
	}
}
