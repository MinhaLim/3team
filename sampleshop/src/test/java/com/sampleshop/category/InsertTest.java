package com.sampleshop.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Category;
import com.sampleshop.service.CategoryService;

@SpringBootTest
class InsertTest {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		Category category = new Category(0, "반소매 티셔츠", 1);
		try {
			service.register(category);
			System.out.println("complete");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("fail");
		}
	
	}

}
