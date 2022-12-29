package com.sampleshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleshop.dto.Cart;
import com.sampleshop.mapper.CartMapper;

@Service
public class CartCheckService {
	
	@Autowired
	CartMapper mapper;
	
	public List<Cart> cartcheck(int user_code) throws Exception  {
		return mapper.cartcheck(user_code);
	}
	
	public List<Cart> cartcheckall() throws Exception  {
		return mapper.cartcheckall();
	}
	
}
