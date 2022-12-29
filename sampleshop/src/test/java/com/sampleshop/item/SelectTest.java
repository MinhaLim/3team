package com.sampleshop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Item;
import com.sampleshop.service.ItemService;

@SpringBootTest
class SelectTest {
	
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		try {
			Item obj = null;
			obj = service.get(3);
			System.out.println(obj);
			System.out.println("complete");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
