package com.sampleshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sampleshop.dto.UserReview;

@Repository
@Mapper
public interface UserReviewMapper {
	public List<UserReview> reviewchk(int user_code) throws Exception;
	public List<UserReview> reviewchkall() throws Exception;
}
