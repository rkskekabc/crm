package com.rkskekfk.crm.domain.games;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Games, Long> {
	Stream<Games> findAllByOrderByIdDesc();
}
