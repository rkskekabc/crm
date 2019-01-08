package com.rkskekfk.crm.domain.revenue;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RevenuesRepository extends JpaRepository<Revenues, Long> {
	Stream<Revenues> findAllByOrderByIdDesc();
}
