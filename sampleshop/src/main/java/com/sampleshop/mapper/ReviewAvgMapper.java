package com.sampleshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sampleshop.dto.ReviewAvg;

@Repository
@Mapper
public interface ReviewAvgMapper{
	public ReviewAvg getSavg(Integer k) throws Exception;
	public List<ReviewAvg> getAllSavg() throws Exception;
}
