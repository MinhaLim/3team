package com.sampleshop.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.service.UserService;

@SpringBootTest
class DeleteTest {
	
	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(2);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
