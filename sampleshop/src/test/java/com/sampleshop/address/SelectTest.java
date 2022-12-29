package com.sampleshop.address;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Address;
import com.sampleshop.service.AddressService;

@SpringBootTest
class SelectTest {
	
	@Autowired
	AddressService service;
	
	@Test
	void contextLoads() {
		try {
			Address obj = service.get(2);
			System.out.println(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
