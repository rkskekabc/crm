package com.rkskekfk.crm.revenue;

import java.time.LocalDate;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.rkskekfk.crm.domain.revenue.Revenues;
import com.rkskekfk.crm.domain.revenue.RevenuesRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RevenueTest {
	@Autowired
	public RevenuesRepository revenueRepo;
	
	@Test
	@After
	@Transactional
	public void dbTest() {
		System.out.println(revenueRepo.findAllByOrderByIdDesc().stream().collect(Collectors.toList()));
	}
	
	@Test
	@Rollback(false)
	@Transactional
	public void saveTest() {
		revenueRepo.save(new Revenues(1L, LocalDate.now(), 30000));
	}
}
