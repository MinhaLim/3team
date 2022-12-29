package com.sampleshop.itembycate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Item;
import com.sampleshop.service.ItemByCateService;

@SpringBootTest
class SelectTest {
	
	@Autowired
	ItemByCateService service;
	
	@Test
	void contextLoads() {
		try {
			Item obj = null;
			obj = service.get(2);
			System.out.println(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
