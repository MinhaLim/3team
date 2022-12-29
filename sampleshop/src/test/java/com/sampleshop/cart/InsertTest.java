package com.sampleshop.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Cart;
import com.sampleshop.service.CartService;

@SpringBootTest
class InsertTest {
	
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		Cart cart = new Cart(0, 2, 2, 1);
		try {
			service.register(cart);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
