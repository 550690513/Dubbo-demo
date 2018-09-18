package com.cheung.dubbo.consumer2;

import com.cheung.dubbo.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务调用方2
 *
 * @author Cheung
 * @date 2017/12/22
 */
public class Consumer2 {

	private static final String NAME = "consumer2";

	public static void main(String[] args) throws InterruptedException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer2.xml");
		context.start();

		System.out.println("服务消费方已启动---" + NAME);

		System.out.println("======开始调用======");

		// 获取远程服务代理
		HelloService helloService = context.getBean(HelloService.class);

		// 调用100次
		for (int i = 0; i < 100; i++) {
			System.out.println("Consumer2-->" + i);
			// 远程调用方法
			String result = helloService.sayHello(NAME);
			// 打印结果
			System.out.println(result);
			// 每调用一次，暂停1s
			Thread.sleep(1000);
		}

	}

}
