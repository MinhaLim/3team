package com.sampleshop.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Cart;
import com.sampleshop.service.CartService;

@SpringBootTest
class SelectAllTest {
	
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		try {
			List<Cart> objs = service.get();
			for(Cart a : objs) {
				System.out.println(a);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
