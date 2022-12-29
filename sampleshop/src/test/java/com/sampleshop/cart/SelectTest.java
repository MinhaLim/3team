package com.sampleshop.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Cart;
import com.sampleshop.service.CartService;

@SpringBootTest
class SelectTest {
	
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		try {
			Cart obj = service.get(3);
			System.out.println(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
