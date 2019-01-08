package com.rkskekfk.crm.domain.revenue;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.rkskekfk.crm.domain.BaseTimeEntity;
import com.rkskekfk.crm.domain.games.Games;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "revenues")
public class Revenues extends BaseTimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Games games;
	
	@Column(name = "sell_date")
	private LocalDate sell_date;
	
	@Column(name = "sell_price")
	private int sell_price;
	
	@Builder
	public Revenues(Games games, LocalDate sell_date, int sell_price) {
		this.games = games;
		this.sell_date = sell_date;
		this.sell_price = sell_price;
	}
}
