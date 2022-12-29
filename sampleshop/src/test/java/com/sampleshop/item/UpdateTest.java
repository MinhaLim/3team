package com.sampleshop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Item;
import com.sampleshop.service.ItemService;

@SpringBootTest
class UpdateTest {
	
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		Item item = new Item(4, 5, "엘 지퍼 코트 스카이블루", 333800, "컬러 지퍼로 포인트를 준 울 90% 더블 코트, 색상이 추가되었습니다.", 10, null);
		try {
			service.modify(item);
			System.out.println("complete");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
