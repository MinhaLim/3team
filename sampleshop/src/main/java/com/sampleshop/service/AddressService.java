package com.sampleshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleshop.dto.Address;
import com.sampleshop.frame.MyService;
import com.sampleshop.mapper.AddressMapper;

@Service
public class AddressService implements MyService<Integer, Address>{
	
	@Autowired
	AddressMapper mapper;
	
	@Override
	public void register(Address v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(Address v) throws Exception {
		mapper.update(v);
	}

	@Override
	public Address get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Address> get() throws Exception {
		return mapper.selectall();
	}

}
