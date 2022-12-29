package com.sampleshop.order;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Order;
import com.sampleshop.service.OrderService;

@SpringBootTest
class SelectAllTests {

	@Autowired
	OrderService service;
	
	@Test
	void contextLoads() {
		List<Order> objs = null;
		try {
			objs = service.get();
			for(Order obj:objs) {
				System.out.println(obj);
			}
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("fail");
			//e.printStackTrace();
		}
	}

}
