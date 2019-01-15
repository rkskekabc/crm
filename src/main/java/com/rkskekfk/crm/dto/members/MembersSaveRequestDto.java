package com.rkskekfk.crm.dto.members;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.rkskekfk.crm.domain.memberroles.MemberRoles;
import com.rkskekfk.crm.domain.members.Members;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MembersSaveRequestDto {
	private String user_id;
	private String password;
	private String name;
	private LocalDate birthday;
	private String email;
	private String phone;
	private String role_name;
	
	public Members toEntity() {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		MemberRoles role = MemberRoles.builder()
							.role_name(role_name)
							.build();
		return Members.builder()
				.user_id(user_id)
				.password(passwordEncoder.encode(password))
				.name(name)
				.birthday(birthday)
				.email(email)
				.phone(phone)
				.member_roles(Stream.of(role).collect(Collectors.toList()))
				.build();
	}
}
