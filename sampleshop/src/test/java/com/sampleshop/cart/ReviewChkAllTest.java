package com.sampleshop.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.UserReview;
import com.sampleshop.service.UserReviewService;

@SpringBootTest
class ReviewChkAllTest {
	
	@Autowired
	UserReviewService service;
	
	@Test
	void contextLoads() {
		try {
			List<UserReview> objs = service.reviewchkall();
			for (UserReview obj:objs) {
				System.out.println(obj);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
