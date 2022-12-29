package com.sampleshop.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Category;
import com.sampleshop.service.CategoryService;

@SpringBootTest
class UpdateTest {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		Category category = new Category(4, "가디건", 2);
		try {
			service.modify(category);
			System.out.println("complete");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
