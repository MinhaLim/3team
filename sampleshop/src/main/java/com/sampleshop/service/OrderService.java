package com.sampleshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleshop.dto.Order;
import com.sampleshop.frame.MyService;
import com.sampleshop.mapper.OrderDetailMapper;
import com.sampleshop.mapper.OrderMapper;
@Service
public class OrderService implements MyService<Integer, Order>{
	
	@Autowired
	OrderMapper mapper;
	
	@Autowired
	OrderDetailMapper detailmapper;
	
	@Override
	public void register(Order v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Order v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Order get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Order> get() throws Exception {
		return mapper.selectall();
	}
	
	// 주문 총 가격 update
	public void tot_price(Order v) throws Exception {
		mapper.tot_price(detailmapper.tot_price(v));
	}

}
