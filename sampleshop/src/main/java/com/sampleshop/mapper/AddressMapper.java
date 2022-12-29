package com.sampleshop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sampleshop.dto.Address;
import com.sampleshop.frame.MyMapper;

@Repository
@Mapper
public interface AddressMapper extends MyMapper<Integer, Address>{

}
