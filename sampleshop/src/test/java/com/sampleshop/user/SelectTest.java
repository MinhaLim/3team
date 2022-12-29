package com.sampleshop.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.User;
import com.sampleshop.service.UserService;

@SpringBootTest
class SelectTest {
	
	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		try {
			User obj = service.get(3);
			System.out.println(obj);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
