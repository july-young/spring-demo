package com.july.demo.aop;

/**
 * @author: july
 * @date: 2020/2/22 13:32
 * @description:
 */
public class Logger {

	public void recordBefore(){
		System.out.println("recordBefore");
	}

	public void recordAfter(){
		System.out.println("recordAfter");
	}

}
