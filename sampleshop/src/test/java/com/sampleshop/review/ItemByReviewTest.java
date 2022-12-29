package com.sampleshop.review;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Item;
import com.sampleshop.dto.Review;
import com.sampleshop.service.ReviewService;

@SpringBootTest
class ItemByReviewTest {
	
	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		List<Item> objs = null;
		try {
			objs = service.itembyreview(4);
			for(Item obj:objs) {
				System.out.println(obj);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
