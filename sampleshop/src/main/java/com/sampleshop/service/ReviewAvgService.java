package com.sampleshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleshop.dto.ReviewAvg;
import com.sampleshop.mapper.ReviewAvgMapper;

@Service
public class ReviewAvgService{

	@Autowired
	ReviewAvgMapper mapper;
	public ReviewAvg getSavg(Integer k) throws Exception{
		return mapper.getSavg(k);
	}
	public List<ReviewAvg> getAllSavg() throws Exception{
		return mapper.getAllSavg();
	}
}
