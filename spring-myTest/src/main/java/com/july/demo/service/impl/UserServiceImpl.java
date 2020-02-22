package com.july.demo.service.impl;

import com.july.demo.service.RoleService;
import com.july.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: july
 * @date: 2020/2/22 00:16
 * @description:
 */
@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private RoleService roleService;
	@Override
	public void addUser(String name, int age) {
		String role = " ";//roleService.find(1);
		System.out.println("添加用户=>name:"+name+",age: "+age+",role:"+role);
	}

	@Override
	public void check() {
		System.out.println("user#check");
	}

	@Override
	public void delUser(String name) {
		System.out.println("删除用户=>name:"+name);
	}
}
