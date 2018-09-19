package com.cheung.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 服务提供方
 *
 * @author Cheung
 * @date 2017/12/22
 */
public class ProviderTest {

	private static final String NAME = "provider";

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-config.xml");
		context.start();
		System.out.println("服务提供方已启动---" + NAME);

		// 为保证服务一直开着，利用输入流的阻塞来模拟
		System.in.read();
	}

}

