package com.sampleshop.review;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Review;
import com.sampleshop.service.ReviewService;

@SpringBootTest
class SelectAllTest {
	
	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		try {
			List<Review> objs = service.get();
			for(Review a : objs) {
				System.out.println(a);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
