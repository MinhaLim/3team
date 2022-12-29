package com.sampleshop.review;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Review;
import com.sampleshop.service.ReviewService;

@SpringBootTest
class SelectTest {
	
	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		try {
			Review obj = service.get(3);
			System.out.println(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
