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
	private int price;
	private LocalDate release_date;
	private String description;
	
	public Games toEntity() {
		return Games.builder()
				.name(name)
				.genre(genre)
				.price(price)
				.release_date(release_date)
				.description(description)
				.build();
	}
}
