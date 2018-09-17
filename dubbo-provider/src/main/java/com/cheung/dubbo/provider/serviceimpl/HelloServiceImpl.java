package com.cheung.dubbo.provider.serviceimpl;

import com.cheung.dubbo.api.HelloService;

/**
 * 公共接口的实现类
 *
 * @author Cheung
 * @date 2017/12/22
 */
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
