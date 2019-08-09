package com.weiwei.typee.service;

import java.util.List;

import com.weiwei.typee.domain.Typee;

public interface TypeeService {
	List<Typee> list(String zname);
	
	void add(Typee typee);
	
	List getTypee();
	
	void del(String tid);
}
