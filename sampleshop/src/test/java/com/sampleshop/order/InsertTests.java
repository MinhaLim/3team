package com.sampleshop.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Order;
import com.sampleshop.service.OrderService;

@SpringBootTest
class InsertTests {

	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		Order order = new Order(0, 4, 0,"card", null, 4);
		try {
			service.register(order);
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("fail");
			//e.printStackTrace();
		}
	}

}
