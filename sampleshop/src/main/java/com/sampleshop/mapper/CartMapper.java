package com.sampleshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sampleshop.dto.Cart;
import com.sampleshop.frame.MyMapper;

@Repository
@Mapper
public interface CartMapper extends MyMapper<Integer, Cart> {
	public List<Cart> cartcheck(int user_code) throws Exception;
	public List<Cart> cartcheckall() throws Exception;
}
