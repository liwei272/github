package com.unicom.clgl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class ZdxxService {
	@Autowired
	private ZdxxMapper zdMapper;
	public int insertCxmc(String cxmc) {
		System.out.println(cxmc);
		return zdMapper.InsertCxmc(cxmc);
	}
	
	public int updateCxmc(String cxmc,int id) {
		
		return zdMapper.UpdateCxmc(cxmc,id);
	}
	

	public List<Map<String,Object>> getCxxx(){
		return zdMapper.getCxxx();
	}
	
public int delCxxx(int id) {
		
		return zdMapper.DelCxxx(id);
	}
}
