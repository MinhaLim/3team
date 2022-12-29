package com.sampleshop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sampleshop.dto.Review;
import com.sampleshop.frame.MyMapper;

@Repository
@Mapper
public interface ReviewMapper extends MyMapper<Integer, Review> {

}
