package com.sampleshop.review;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.service.ReviewService;

@SpringBootTest
class DeleteTest {
	
	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(4);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
