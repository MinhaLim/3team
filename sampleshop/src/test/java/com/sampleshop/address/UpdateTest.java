package com.sampleshop.address;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Address;
import com.sampleshop.service.AddressService;

@SpringBootTest
class UpdateTest {
	
	@Autowired
	AddressService service;
	
	@Test
	void contextLoads() {
		Address addr = new Address(2, "67890", "부산시", "괴정구", "대티로", null);
		try {
			service.modify(addr);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
