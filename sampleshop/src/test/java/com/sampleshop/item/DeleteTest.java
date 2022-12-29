package com.sampleshop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.service.ItemService;

@SpringBootTest
class DeleteTest {
	
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(3);
			System.out.println("complete");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
