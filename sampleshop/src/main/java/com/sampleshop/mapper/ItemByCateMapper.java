package com.sampleshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sampleshop.dto.Item;
import com.sampleshop.frame.MyMapper;

@Repository
@Mapper
public interface ItemByCateMapper {
	public List<Item> getsItem(Integer k) throws Exception;
}
