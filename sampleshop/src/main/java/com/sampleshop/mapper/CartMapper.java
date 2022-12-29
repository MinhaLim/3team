package com.sampleshop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sampleshop.dto.Cart;
import com.sampleshop.frame.MyMapper;

@Repository
@Mapper
public interface CartMapper extends MyMapper<Integer, Cart> {

}