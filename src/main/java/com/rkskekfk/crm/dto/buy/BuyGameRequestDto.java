package com.rkskekfk.crm.dto.buy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BuyGameRequestDto {
	public Long gameId;
	public Long couponId;
}
