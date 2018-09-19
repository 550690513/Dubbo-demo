package com.cheung.dubbo.provider.service.impl;

import com.cheung.dubbo.api.HelloService;
import org.springframework.stereotype.Service;

/**
 * HelloService公共接口的实现类
 *
 * @author Cheung
 * @date 2017/12/22
 */
@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
