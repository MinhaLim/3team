package com.sampleshop.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.OrderDetail;
import com.sampleshop.service.OrderDetailService;

@SpringBootTest
class UpdateTests {

	@Autowired
	OrderDetailService service;
	
	@Test
	void contextLoads() {
		OrderDetail orderdetail = new OrderDetail(2, 1, 2, 2);
		try {
			service.modify(orderdetail);
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("fail");
			//e.printStackTrace();
		}
	}

}
