package com.itheima.e3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.e3.pojo.TbItem;
import com.itheima.e3.service.ItemService;

@Controller
public class itemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping("selectById/{id}")
	@ResponseBody
	public TbItem selectItemById(@PathVariable long id){
		TbItem item = itemService.selecttBItemByid(id);
		return item;
	}
}
