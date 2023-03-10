package com.sampleshop.itembycate;

import java.util.List;

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
			List<Item> objs = service.getsItem(5);
			for(Item obj:objs) {
				System.out.println(obj);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
