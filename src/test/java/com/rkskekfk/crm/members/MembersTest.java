package com.rkskekfk.crm.members;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.rkskekfk.crm.domain.members.MembersRepository;
import com.rkskekfk.crm.dto.members.MembersSaveRequestDto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MembersTest {
	@Autowired
	public MembersRepository membersRepository;
	
	@Test
	@Rollback(false)
	@Transactional
	public void saveTest() {
		MembersSaveRequestDto dto = new MembersSaveRequestDto();
		dto.setUser_id("user1");
		dto.setPassword("1234");
		dto.setName("유저1");
		dto.setEmail("test@test.com");
		dto.setBirthday(LocalDate.of(1995, 3, 3));
		dto.setPhone("010-123-4567");
		dto.setRole_name("BASIC");
		membersRepository.save(dto.toEntity());
	}
}
