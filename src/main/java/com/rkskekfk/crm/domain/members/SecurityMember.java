package com.rkskekfk.crm.domain.members;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.rkskekfk.crm.domain.gamepossession.GamePossession;
import com.rkskekfk.crm.domain.memberroles.MemberRoles;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SecurityMember extends User {
	private static final String ROLE_PREFIX = "ROLE_";
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private LocalDate birthday;
	private String email;
	private String phone;
	private List<GamePossession> possessed_game;
	
	public SecurityMember(Members members) {
		super(members.getUserId(), members.getPassword(), makeGrantedAuthority(members.getMember_roles()));
		this.id = members.getId();
		this.name = members.getName();
		this.birthday = members.getBirthday();
		this.email = members.getEmail();
		this.phone = members.getPhone();
		this.possessed_game = members.getPossessed_game();
	}
	
	private static List<GrantedAuthority> makeGrantedAuthority(List<MemberRoles> roles){
		List<GrantedAuthority> list = new ArrayList<>();
		roles.forEach(role -> list.add(new SimpleGrantedAuthority(ROLE_PREFIX + role.getRole_name())));
		return list;
	}
}
