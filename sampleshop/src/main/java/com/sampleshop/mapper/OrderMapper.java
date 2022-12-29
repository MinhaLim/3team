package com.sampleshop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sampleshop.dto.Order;
import com.sampleshop.frame.MyMapper;

@Repository
@Mapper
public interface OrderMapper extends MyMapper<Integer, Order> {

}
