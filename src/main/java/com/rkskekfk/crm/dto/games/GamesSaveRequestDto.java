package com.rkskekfk.crm.dto.games;

import java.time.LocalDate;

import com.rkskekfk.crm.domain.games.Games;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GamesSaveRequestDto {
	private String name;
	private String genre;
	private int sell_amount;
	private int price;
	private Long revenue;
	private LocalDate release_date;
	
	public Games toEntity() {
		return Games.builder()
				.name(name)
				.genre(genre)
				.sell_amount(sell_amount)
				.price(price)
				.revenue(revenue)
				.release_date(release_date)
				.build();
	}
}
