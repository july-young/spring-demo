package com.july.demo;

import com.july.demo.entity.Person;
import com.july.demo.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: july
 * @date: 2019/11/22 23:02
 * @description:
 */
public class Test {
	public static void main(String[] args)throws BeansException {
		//查询类路径 加载配置文件
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		//根据id获取bean
		//Spring就是一个大工厂（容器）专门生成bean bean就是对象
		UserService userService = applicationContext.getBean(UserService.class);
		userService.addUser("张三",18);
		Person person = (Person) applicationContext.getBean("Person");
		//输出获取到的对象
		System.out.println("person = " + person);
	}
}
