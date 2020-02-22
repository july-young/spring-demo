package com.july.demo.service.impl;

import com.july.demo.service.RoleService;
import com.july.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: july
 * @date: 2020/2/22 00:18
 * @description:
 */
@Service
public class RoleServiceImpl implements RoleService {


	@Autowired
	private UserService userService;
	@Override
	public String find(Integer id) {

		userService.check();
		return "角色"+id;
	}
}
