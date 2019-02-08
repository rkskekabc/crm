package com.rkskekfk.crm.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rkskekfk.crm.domain.members.MembersRepository;
import com.rkskekfk.crm.domain.members.SecurityMember;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
	private MembersRepository membersRepository;

	@Override
	public UserDetails loadUserByUsername(String user_id) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return Optional.ofNullable(membersRepository.findByUserId(user_id))
				.filter(member -> member != null)
				.map(SecurityMember::new)
				.get();
	}
	
}
