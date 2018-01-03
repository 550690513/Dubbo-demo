package com.alibaba.dubbo.consumer;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Cheung on 2017/12/22
 */
public class Consumer {

	private static final String NAME = "consumer1";

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();

		System.out.println("服务消费方已启动---" + NAME);

		DemoService demoService = context.getBean(DemoService.class);// 获取远程服务代理
		String result = demoService.sayHello(NAME);// 远程调用方法

		System.out.println(result);// 打印结果

	}

}
