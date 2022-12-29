package com.sampleshop.address;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.Address;
import com.sampleshop.service.AddressService;

@SpringBootTest
class SelectAllTest {
	
	@Autowired
	AddressService service;
	
	@Test
	void contextLoads() {
		try {
			List<Address> objs = service.get();
			for(Address a : objs) {
				System.out.println(a);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}

}
