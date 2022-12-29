package com.sampleshop.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.OrderDetail;
import com.sampleshop.service.OrderDetailService;

@SpringBootTest
class SelectTests {

	@Autowired
	OrderDetailService service;
	
	@Test
	void contextLoads() {
		OrderDetail obj = null;
		try {
			obj=service.get(1);
			System.out.println(obj);
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("fail");
			//e.printStackTrace();
		}
	}

}
