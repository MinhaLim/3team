package com.sampleshop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sampleshop.dto.Category;
import com.sampleshop.frame.MyMapper;

@Repository
@Mapper
public interface CategoryMapper extends MyMapper<Integer, Category> {
	
}
