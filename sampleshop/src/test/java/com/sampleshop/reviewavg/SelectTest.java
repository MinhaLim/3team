package com.sampleshop.reviewavg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Review;
import com.sampleshop.dto.ReviewAvg;
import com.sampleshop.service.ReviewAvgService;

@SpringBootTest
class SelectTest {
	
	@Autowired
	ReviewAvgService service;
	
	@Test
	void contextLoads() {
		try {
			ReviewAvg obj = service.getSavg(1);
			System.out.println(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
