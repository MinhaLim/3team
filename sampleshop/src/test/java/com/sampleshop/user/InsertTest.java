package com.sampleshop.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.User;
import com.sampleshop.service.UserService;

@SpringBootTest
class InsertTest {
	
	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		User user = new User(0, "user04", "pwd04", "david", "010-1111-1111", "david@yahoo.co.kr", 3);
		try {
			service.register(user);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
