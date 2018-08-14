package com.unicom.clgl.service;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface ZdxxMapper {
	@Insert("insert into zdcx(cxmc) values(#{cxmc})")
	int InsertCxmc(String cxmc);
	
	@Update("update zdcx set cxmc=#{arg0} where id=#{arg1}")
	int UpdateCxmc(String cxmc,int id);
	
	@Select("select id,cxmc from zdcx where zt=0")
	List<Map<String,Object>> getCxxx();
	
	@Update("update  zdcx set zt=1 where id=#{id}")
	int DelCxxx(int id);
}
