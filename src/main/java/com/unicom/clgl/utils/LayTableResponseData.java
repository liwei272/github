package com.unicom.clgl.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Component;

@Component
public class LayTableResponseData {
	private int count=0;
	private String code="0";
	private List<Map<String,Object>> data;
	private String msg="";
	
	public LayTableResponseData() {
		System.out.println("Laytable");
		count=0;
		code="0";
		data=null;
		msg="";
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<Map<String, Object>> getData() {
		return data;
	}
	public void setData(List<Map<String, Object>> data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String toJsonString() {
		if (data==null) {data=new ArrayList<Map<String,Object>>();};
		Iterator<Map<String,Object>> it=data.iterator();
		StringBuffer sb=new StringBuffer();
		sb.append("{");
		sb.append("\"code\":"+getCode()+",");
		sb.append("\"msg\":\""+getMsg()+"\",");
		sb.append("\"count\":"+getCount()+",");
		sb.append("\"data\":[");
		while (it.hasNext()) {
			Map<String,Object> o=(Map<String, Object>) it.next();
			sb.append("{");
			for (Entry<String, Object> entry : o.entrySet()) {
				
			    sb.append("\""+entry.getKey()+"\":\"");
			    
			    sb.append(entry.getValue()+"\",");
				
			};
			sb=sb.delete(sb.length()-1, sb.length());
			sb.append("},");
		};
		sb=sb.delete(sb.length()-1, sb.length());
		sb.append("]}");
		return sb.toString();
		
	}
	
}
