package com.rkskekfk.crm.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rkskekfk.crm.domain.games.Games;
import com.rkskekfk.crm.domain.games.GamesRepository;
import com.rkskekfk.crm.domain.revenue.RevenuesRepository;
import com.rkskekfk.crm.dto.revenues.RevenueSaveRequestDto;
import com.rkskekfk.crm.dto.revenues.RevenuesListResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Service
@AllArgsConstructor
@Getter
public class RevenuesService {
	private RevenuesRepository revenuesRepository;
	private GamesRepository gamesRepository;
	
	@Transactional(readOnly = true)
	public List<RevenuesListResponseDto> findAllDesc(){
		return revenuesRepository.findAllByOrderByIdDesc()
                .map(RevenuesListResponseDto::new)
                .collect(Collectors.toList());
	}
	
	@Transactional
	public Long save(RevenueSaveRequestDto dto) {
		dto.setGames(gamesRepository.findById(dto.getGame_id()).get());
		return revenuesRepository.save(dto.toEntity()).getId();
	}
}
