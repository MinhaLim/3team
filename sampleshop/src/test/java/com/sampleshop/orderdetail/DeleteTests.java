package com.sampleshop.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.service.OrderDetailService;

@SpringBootTest
class DeleteTests {

	@Autowired
	OrderDetailService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(4);
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("fail");
			//e.printStackTrace();
		}
	}

}
