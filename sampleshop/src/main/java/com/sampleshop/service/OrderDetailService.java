package com.sampleshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleshop.dto.Order;
import com.sampleshop.dto.OrderDetail;
import com.sampleshop.frame.MyService;
import com.sampleshop.mapper.OrderDetailMapper;
@Service
public class OrderDetailService implements MyService<Integer, OrderDetail>{

	@Autowired
	OrderDetailMapper mapper;
	
	@Override
	public void register(OrderDetail v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(OrderDetail v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public OrderDetail get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<OrderDetail> get() throws Exception {
		return mapper.selectall();
	}
	
	// 주문 총 가격 select
	public Order tot_price(Order v) throws Exception {
		return mapper.tot_price(v);
	}

}
