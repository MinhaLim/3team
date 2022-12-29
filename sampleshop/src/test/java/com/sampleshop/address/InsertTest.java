package com.sampleshop.address;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Address;
import com.sampleshop.service.AddressService;

@SpringBootTest
class InsertTest {
	
	@Autowired
	AddressService service;
	
	@Test
	void contextLoads() {
		Address addr = new Address(0, "24680", "서울시", "강남구", "테헤란로", null);
		try {
			service.register(addr);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
