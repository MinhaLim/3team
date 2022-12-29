package com.sampleshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleshop.dto.Item;
import com.sampleshop.mapper.ItemByCateMapper;

@Service
public class ItemByCateService {
	
	@Autowired
	ItemByCateMapper mapper;
	public List<Item> getsItem(Integer k) throws Exception {
		return mapper.getsItem(k);
	}
	
}
