package com.rkskekfk.crm.dto.games;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import com.rkskekfk.crm.domain.games.Games;

import lombok.Getter;

@Getter
public class GameResponseDto {
	private Long id;
	private String name;
	private String genre;
	private int price;
	private String release_date;
	private String description;
	
	public GameResponseDto(Games entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.genre = entity.getGenre();
		this.price = entity.getPrice();
		this.release_date = toStringDate(entity.getRelease_date());
		this.description = entity.getDescription();
	}
	
    private String toStringDate(LocalDate localDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return Optional.ofNullable(localDate)
                .map(formatter::format)
                .orElse("");
    }
}
