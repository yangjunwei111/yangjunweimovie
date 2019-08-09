package com.weiwei.typee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weiwei.typee.dao.TypeeMapper;
import com.weiwei.typee.domain.Typee;
import com.weiwei.typee.service.TypeeService;
@Service
public class TypeeServiceImpl implements TypeeService {
	@Autowired
	private TypeeMapper mapper;
	@Override
	public List<Typee> list(String zname) {
		// TODO Auto-generated method stub
		return mapper.list(zname);
	}
	@Override
	public void add(Typee typee) {
		// TODO Auto-generated method stub
		mapper.add(typee);
	}
	@Override
	public List getTypee() {
		// TODO Auto-generated method stub
		return mapper.getTypee();
	}
	@Override
	public void del(String tid) {
		// TODO Auto-generated method stub
		mapper.del(tid);
	}

}
