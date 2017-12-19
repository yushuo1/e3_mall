package com.itheima.e3.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.e3.mapper.TbItemMapper;
import com.itheima.e3.pojo.TbItem;
import com.itheima.e3.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	public TbItem selecttBItemByid(long id) {
		TbItem item = itemMapper.selectByPrimaryKey(id);
		return item;
	}


}
