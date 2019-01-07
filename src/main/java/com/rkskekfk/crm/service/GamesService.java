package com.rkskekfk.crm.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rkskekfk.crm.domain.games.GamesRepository;
import com.rkskekfk.crm.dto.games.GameResponseDto;
import com.rkskekfk.crm.dto.games.GamesListResponseDto;
import com.rkskekfk.crm.dto.games.GamesSaveRequestDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GamesService {
	private GamesRepository gamesRepository;
	
	@Transactional
	public Long save(GamesSaveRequestDto dto) {
		return gamesRepository.save(dto.toEntity()).getId();
	}
	
	@Transactional(readOnly = true)
    public List<GamesListResponseDto> findAllDesc() {
        return gamesRepository.findAllByOrderByIdDesc()
                .map(GamesListResponseDto::new)
                .collect(Collectors.toList());
    }
	
	@Transactional(readOnly = true)
	public GameResponseDto findOne(Long id) {
		return new GameResponseDto(gamesRepository.findById(id).get());
	}
}
