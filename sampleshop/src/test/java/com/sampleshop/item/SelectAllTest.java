package com.sampleshop.item;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Item;
import com.sampleshop.service.ItemService;

@SpringBootTest
class SelectAllTest {
	
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		try {
			List<Item> objs = service.get();
			for(Item obj:objs) {
				System.out.println(obj);
			}
			System.out.println("complete");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
