package com.sampleshop.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Cart;
import com.sampleshop.service.CartCheckService;

@SpringBootTest
class CartCheckAllTest {
	
	@Autowired
	CartCheckService service;
	
	@Test
	void contextLoads() {
		try {
			List<Cart> objs = service.cartcheckall();
			for (Cart obj:objs) {
				System.out.println(obj);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
