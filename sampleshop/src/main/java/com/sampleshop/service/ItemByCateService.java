package com.sampleshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleshop.dto.Item;
import com.sampleshop.frame.MyService;
import com.sampleshop.mapper.ItemByCateMapper;

@Service
public class ItemByCateService implements MyService<Integer, Item>{
	
	@Autowired
	ItemByCateMapper mapper;

	@Override
	public void register(Item v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Item v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Item get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Item> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
