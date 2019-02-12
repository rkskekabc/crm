package com.rkskekfk.crm.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rkskekfk.crm.domain.members.MembersRepository;
import com.rkskekfk.crm.dto.members.MembersSaveRequestDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MembersService {
	private MembersRepository membersRepository;
	
	@Transactional
	public Long save(MembersSaveRequestDto dto) {
		Long id = membersRepository.save(dto.toEntity()).getId();
		return id;
	}
}
