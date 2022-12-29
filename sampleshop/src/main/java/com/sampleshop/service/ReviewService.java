package com.sampleshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleshop.dto.Item;
import com.sampleshop.dto.Review;
import com.sampleshop.frame.MyService;
import com.sampleshop.mapper.ReviewMapper;

@Service
public class ReviewService implements MyService<Integer, Review> {
	
	@Autowired
	ReviewMapper mapper;

	@Override
	public void register(Review v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Review v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Review get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Review> get() throws Exception {
		return mapper.selectall();
	}
	
	public List<Item> itembyreview(int score) throws Exception {
		return mapper.itembyreview(score);
	}
}
