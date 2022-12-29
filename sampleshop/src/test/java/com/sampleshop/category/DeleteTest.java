package com.sampleshop.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.service.CategoryService;

@SpringBootTest
class DeleteTest {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(6);
			System.out.println("complete");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
