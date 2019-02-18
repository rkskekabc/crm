package com.rkskekfk.crm.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rkskekfk.crm.domain.gamepossession.GamePossession;
import com.rkskekfk.crm.domain.gamepossession.GamePossessionRepository;
import com.rkskekfk.crm.dto.revenues.RevenueSaveRequestDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GamePossessionService {
	private GamePossessionRepository gamePossessionRepository;
	
	@Transactional
	public Long save(RevenueSaveRequestDto dto) {
		GamePossession entity = GamePossession.builder()
								.memberId(dto.getMember_id())
								.gameId(dto.getGame_id())
								.build();
		return gamePossessionRepository.save(entity).getId();
	}
}
