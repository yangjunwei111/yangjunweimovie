package com.weiwei.typee.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weiwei.typee.domain.Typee;
import com.weiwei.typee.domain.Zw;
import com.weiwei.typee.service.TypeeService;
import com.weiwei.typee.utils.PageUtils;

@Controller
public class TypeeController {
@Autowired
private TypeeService service;
/**
 * 
    * @Title: list
    * @Description: 模糊+分页+全查
    * @param @param model
    * @param @param zname
    * @param @param pageNum
    * @param @return    参数
    * @return String    返回类型
    * @throws
 */
@RequestMapping("list")
public String list(Model model,@RequestParam(defaultValue="")String zname,
		@RequestParam(defaultValue="1")int pageNum) {
	PageHelper.startPage(pageNum, 2);
	List<Typee> list = service.list(zname);
	PageInfo info = new PageInfo(list);
	model.addAttribute("list", list);
	model.addAttribute("zname", zname);
	PageUtils.fenye(model, info, "&zname="+zname);
	return "list";
}
/**
 * 
    * @Title: toadd
    * @Description: 去添加
    * @param @param model
    * @param @return    参数
    * @return String    返回类型
    * @throws
 */
@RequestMapping("toadd")
public String toadd(Model model) {
	List list = service.getTypee();
	model.addAttribute("list", list);
	model.addAttribute("zw", new Zw());
	return "add";
}
/**
 * 去修改
    * @Title: toUpdate
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param model
    * @param @return    参数
    * @return String    返回类型
    * @throws
 */
@RequestMapping("toUpdate")
public String toUpdate(Model model) {
	List list = service.getTypee();
	model.addAttribute("list", list);
	model.addAttribute("zw", new Zw());
	return "update";
}
/**
 * 
    * @Title: add
    * @Description: 添加
    * @param @param typee
    * @param @return    参数
    * @return String    返回类型
    * @throws
 */
@RequestMapping("add")
public String add(Typee typee) {
	service.add(typee);
	return "redirect:/list";
}
/**
 * 
    * @Title: del
    * @Description: 删除
    * @param @param tid
    * @param @return    参数
    * @return boolean    返回类型
    * @throws
 */
@RequestMapping("del")
@ResponseBody
public boolean del(String tid) {
	try {
		service.del(tid);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
		// TODO: handle exception
	}
}
@RequestMapping("toCha")
public String toCha() {
	return "cha";
}
}
