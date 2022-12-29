package com.sampleshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleshop.dto.UserReview;
import com.sampleshop.mapper.UserReviewMapper;

@Service
public class UserReviewService {
	
	@Autowired
	UserReviewMapper mapper;
	
	public List<UserReview> reviewchk(int user_code) throws Exception  {
		return mapper.reviewchk(user_code);
	}
	
	public List<UserReview> reviewchkall() throws Exception  {
		return mapper.reviewchkall();
	}
	
}
