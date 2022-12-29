package com.sampleshop.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Order;
import com.sampleshop.service.OrderService;

@SpringBootTest
class TotalPriceTest {

	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		Order order = new Order();
		order.setOrder_code(1);
		try {
			service.tot_price(order);
			System.out.println("ok");
			service.get(1);
		} catch (Exception e) {
			System.out.println("fail");
			e.printStackTrace();
		}
	}

}
