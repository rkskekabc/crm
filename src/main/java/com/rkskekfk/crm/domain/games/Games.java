package com.rkskekfk.crm.domain.games;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.rkskekfk.crm.domain.BaseTimeEntity;
import com.rkskekfk.crm.domain.revenue.Revenues;
import com.rkskekfk.crm.dto.games.GamesSaveRequestDto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "games")
public class Games extends BaseTimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String genre;
	
	private int sell_amount;
	
	private int price;
	
	private Long revenue;
	
	private LocalDate release_date;
	
	private String description;
	
	@OneToMany(mappedBy = "games")
	private List<Revenues> revenues = new ArrayList<Revenues>();
	
	@Builder
	private Games(String name, String genre, int sell_amount, int price, Long revenue, LocalDate release_date, String description, List<Revenues> revenues) {
		this.name = name;
		this.genre = genre;
		this.sell_amount = sell_amount;
		this.price = price;
		this.revenue = revenue;
		this.release_date = release_date;
		this.description = description;
		this.revenues = revenues;
	}
	
	public static Games of(GamesSaveRequestDto dto) {
		return Games.builder()
				.name(dto.getName())
				.genre(dto.getGenre())
				.price(dto.getPrice())
				.release_date(dto.getRelease_date())
				.description(dto.getDescription())
				.build();
	}
}
