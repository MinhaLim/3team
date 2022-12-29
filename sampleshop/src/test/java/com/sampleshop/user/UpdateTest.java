package com.sampleshop.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.User;
import com.sampleshop.service.UserService;

@SpringBootTest
class UpdateTest {
	
	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		User user = new User(2, "user02", "pwd022", "sarah", "010-1313-2424", "sarah@gmail.com", 2);
		try {
			service.modify(user);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
