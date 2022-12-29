package com.sampleshop.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Category;
import com.sampleshop.service.CategoryService;

@SpringBootTest
class SelectTest {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		try {
			Category obj = null;
			obj = service.get(1);
			System.out.println(obj);
			System.out.println("complete");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
