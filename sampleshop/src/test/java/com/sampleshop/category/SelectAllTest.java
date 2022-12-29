package com.sampleshop.category;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Category;
import com.sampleshop.service.CategoryService;

@SpringBootTest
class SelectAllTest {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		try {
			List<Category> objs = service.get();
			for(Category obj:objs) {
				System.out.println(obj);
			}
			System.out.println("complete");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
