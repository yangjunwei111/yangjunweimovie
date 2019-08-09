package com.weiwei.typee.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.weiwei.typee.domain.Typee;

public interface TypeeMapper {

	List<Typee> list(@Param("zname")String zname);
	
	void add(Typee typee);
	
	List getTypee();
	
	void del(String tid);
}
