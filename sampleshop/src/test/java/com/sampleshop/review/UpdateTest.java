package com.sampleshop.review;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Review;
import com.sampleshop.service.ReviewService;

@SpringBootTest
class UpdateTest {
	
	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		Review review = new Review(2, 2, 4, "좋습니다", null);
		try {
			service.modify(review);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
