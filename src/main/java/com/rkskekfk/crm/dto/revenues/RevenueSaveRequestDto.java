package com.rkskekfk.crm.dto.revenues;

import java.time.LocalDate;

import com.rkskekfk.crm.domain.games.Games;
import com.rkskekfk.crm.domain.revenue.Revenues;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RevenueSaveRequestDto {
	private Games games;
	private LocalDate sellDate;
	private int sellAmount;
	private int sellPrice;

	public Revenues toEntity() {
		return Revenues.builder()
				.games(games)
				.sellDate(sellDate)
				.sellAmount(sellAmount)
				.sellPrice(sellPrice)
				.build();
	}
}
