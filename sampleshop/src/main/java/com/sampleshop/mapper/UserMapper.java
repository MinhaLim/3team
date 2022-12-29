package com.sampleshop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sampleshop.dto.User;
import com.sampleshop.frame.MyMapper;

@Repository
@Mapper
public interface UserMapper extends MyMapper<Integer, User>{
	
}
