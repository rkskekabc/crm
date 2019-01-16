package com.rkskekfk.crm.domain.members;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MembersRepository extends JpaRepository<Members, Long> {
	public Members findByUserId(String user_id);
}
