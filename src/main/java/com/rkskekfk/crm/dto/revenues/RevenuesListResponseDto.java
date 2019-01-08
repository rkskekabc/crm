package com.rkskekfk.crm.dto.revenues;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import com.rkskekfk.crm.domain.games.Games;
import com.rkskekfk.crm.domain.revenue.Revenues;

import lombok.Getter;

@Getter
public class RevenuesListResponseDto {
	private Games games;
	private String sell_date;
	private int sell_price;
	
	public RevenuesListResponseDto(Revenues entity) {
		this.games = entity.getGames();
		this.sell_date = toStringDate(entity.getSell_date());
		this.sell_price = entity.getSell_price();
	}
	
    private String toStringDate(LocalDate localDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return Optional.ofNullable(localDate)
                .map(formatter::format)
                .orElse("");
    }
}
