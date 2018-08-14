package com.unicom.clgl.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ClxxMapper {
	@Select("select clpp,clxh from clxx")
	List<Map<String,String>> getAllCxx();
}
