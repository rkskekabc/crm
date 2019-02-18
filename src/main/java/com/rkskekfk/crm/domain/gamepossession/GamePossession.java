package com.rkskekfk.crm.domain.gamepossession;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rkskekfk.crm.domain.BaseTimeEntity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name="game_possession")
@ToString
public class GamePossession extends BaseTimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="member_id")
	private Long memberId;

	@Column(name="game_id")
	private Long gameId;
	
	@Builder
	public GamePossession(Long memberId, Long gameId) {
		this.memberId = memberId;
		this.gameId = gameId;
	}
}
