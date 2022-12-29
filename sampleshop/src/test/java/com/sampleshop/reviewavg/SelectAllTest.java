package com.sampleshop.reviewavg;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.ReviewAvg;
import com.sampleshop.service.ReviewAvgService;

@SpringBootTest
class SelectAllTest {
	
	@Autowired
	ReviewAvgService service;
	
	@Test
	void contextLoads() {
		try {
			List<ReviewAvg> objs = service.getAllSavg();
			for(ReviewAvg a : objs) {
				System.out.println(a);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
