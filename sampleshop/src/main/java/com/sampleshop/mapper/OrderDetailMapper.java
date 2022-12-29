package com.sampleshop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sampleshop.dto.Order;
import com.sampleshop.dto.OrderDetail;
import com.sampleshop.frame.MyMapper;
@Repository
@Mapper
public interface OrderDetailMapper extends MyMapper<Integer, OrderDetail>{
	// 주문 총 가격 select
	public Order tot_price(Order V) throws Exception;
}
