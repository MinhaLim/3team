package com.sampleshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sampleshop.dto.Item;
import com.sampleshop.dto.Review;
import com.sampleshop.frame.MyMapper;

@Repository
@Mapper
public interface ReviewMapper extends MyMapper<Integer, Review> {
	public List<Item> itembyreview(int score) throws Exception;
}
