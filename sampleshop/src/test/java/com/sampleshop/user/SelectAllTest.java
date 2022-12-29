package com.sampleshop.user;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sampleshop.dto.User;
import com.sampleshop.service.UserService;

@SpringBootTest
class SelectAllTest {
	
	@Autowired
	UserService service;
	
	@Test
	void contextLoads() {
		try {
			List<User> objs = service.get();
			for(User u : objs) {
				System.out.println(u);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
