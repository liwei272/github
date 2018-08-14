package com.unicom.clgl.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ClxxService {
	@Autowired
	private ClxxMapper clxxMapper;
	
	public List<Map<String,String>> getAllCxx(){
		return clxxMapper.getAllCxx();
	};
}
