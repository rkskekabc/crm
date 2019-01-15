package com.rkskekfk.crm.domain.members;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.rkskekfk.crm.domain.BaseTimeEntity;
import com.rkskekfk.crm.domain.memberroles.MemberRoles;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@ToString
public class Members extends BaseTimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String user_id;
	
	private String password;
	
	private String name;
	
	private LocalDate birthday;
	
	private String email;
	
	private String phone;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "member_id")
	private List<MemberRoles> member_roles = new ArrayList<MemberRoles>();
	
	@Builder
	public Members(String user_id, String password, String name, LocalDate birthday, String email, String phone, List<MemberRoles> member_roles) {
		this.user_id = user_id;
		this.password = password;
		this.name = name;
		this.birthday = birthday;
		this.email = email;
		this.phone = phone;
		this.member_roles = member_roles;
	}
}
