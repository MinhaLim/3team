package com.sampleshop.orderdetail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.OrderDetail;
import com.sampleshop.service.OrderDetailService;

@SpringBootTest
class SelectAllTests {

	@Autowired
	OrderDetailService service;
	
	@Test
	void contextLoads() {
		List<OrderDetail> objs = null;
		try {
			objs = service.get();
			for(OrderDetail obj:objs) {
				System.out.println(obj);
			}
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("fail");
			//e.printStackTrace();
		}
	}

}
