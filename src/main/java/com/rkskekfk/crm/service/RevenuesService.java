package com.rkskekfk.crm.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rkskekfk.crm.domain.revenue.RevenuesRepository;
import com.rkskekfk.crm.dto.revenues.RevenuesListResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Service
@AllArgsConstructor
@Getter
public class RevenuesService {
	private RevenuesRepository revenuesRepository;
	
	@Transactional(readOnly = true)
	public List<RevenuesListResponseDto> findAllDesc(){
		return revenuesRepository.findAllByOrderByIdDesc()
                .map(RevenuesListResponseDto::new)
                .collect(Collectors.toList());
	}
}
