package com.sampleshop.review;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Review;
import com.sampleshop.service.ReviewService;

@SpringBootTest
class InsertTest {
	
	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		Review review = new Review(0, 1, 3, 5, "좋아요", "", null);
		try {
			service.register(review);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
