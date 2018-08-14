package com.unicom.clgl.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicom.clgl.service.ZdxxService;
import com.unicom.clgl.utils.LayTableResponseData;

@RestController
public class ZdxxController {
	@Autowired
	private ZdxxService zdService;
	@Autowired
	private LayTableResponseData data;
	@RequestMapping(value="/insertCxmc")
	public int InsertCxmc(String cxmc) {
		System.out.println(cxmc);
		return zdService.insertCxmc(cxmc);
	}
	@RequestMapping(value="/updateCxmc")
	public int updateCxmc(String cxmc,int id) {
		System.out.println(id);
		System.out.println(cxmc);
		return zdService.updateCxmc(cxmc,id);
	}
	@RequestMapping(value="/getCxxx")
	public List<Map<String,Object>> getCxxx(){
		List<Map<String,Object>> list=zdService.getCxxx();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", list.size());
		map.put("data", list);
		List<Map<String,Object>> list1= new ArrayList<Map<String,Object>>();
		list1.add(map);
		System.out.println(list1.toString());
		return list1;
	}
	@RequestMapping(value="/getCxxxString")
	public String getCxxxString(int page,int limit){
		List<Map<String,Object>> list=zdService.getCxxx();
		int count=list.size();
		int ipage=page;
		int ilimit=limit;
		int start=(ipage-1)*ilimit;
		int end=(ipage*ilimit)>count?count:(ipage*ilimit);
		data.setCount(list.size());
		list=list.subList(start, end);
		data.setCode("0");
		data.setMsg("");
		data.setData(list);

		return data.toJsonString();
	}
	
	@RequestMapping(value="/delCxxx")
	public int delClxx(int id) {
		return zdService.delCxxx(id);
	}
}
