package com.alibaba.dubbo.demo.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Cheung on 2017/12/22
 */
public class Provider {

	private static final String NAME = "provider";

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
		context.start();
		System.out.println("服务提供方已启动---" + NAME);
		System.in.read();// 为保证服务一直开着，利用输入流的阻塞来模拟
	}

}

