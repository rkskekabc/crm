package com.rkskekfk.crm.domain.revenue;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RevenuesRepository extends JpaRepository<Revenues, Long> {
	List<Revenues> findAllByOrderByIdDesc();
}
