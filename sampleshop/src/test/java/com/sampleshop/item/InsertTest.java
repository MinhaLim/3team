package com.sampleshop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Item;
import com.sampleshop.service.ItemService;

@SpringBootTest
class InsertTest {
	
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		Item item = new Item(0, 5, "엘 지퍼 코트 그레이", 386000, "컬러 지퍼로 포인트를 준 울 90% 더블 코트", 15, null);
		try {
			service.register(item);
			System.out.println("complete");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
