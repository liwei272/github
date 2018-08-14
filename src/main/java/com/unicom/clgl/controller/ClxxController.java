package com.unicom.clgl.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.unicom.clgl.service.ClxxService;

@RestController
@RequestMapping(value="/clxx")
public class ClxxController {
	@Autowired
	private ClxxService clxxService;
	
	@RequestMapping(value="/getAllClxx")
	public List<Map<String,String>> getAllClxx(){
		List<Map<String,String>> list=clxxService.getAllCxx();
		return list;
	}
}
