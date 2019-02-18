package com.rkskekfk.crm.dto.revenues;

import java.time.LocalDate;

import com.rkskekfk.crm.domain.revenue.Revenues;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RevenueSaveRequestDto {
	private Long member_id;
	private Long game_id;
	private LocalDate sell_date;
	private int sell_price;

	public Revenues toEntity() {
		return Revenues.builder()
				.game_id(game_id)
				.sell_date(sell_date)
				.sell_price(sell_price)
				.build();
	}
}
