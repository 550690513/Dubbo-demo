package com.cheung.dubbo.consumer1.controller;

import com.cheung.dubbo.api.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Cheung
 */
@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;

	@Value("${applicationName}")
	private String applicationName;


	@RequestMapping(value = "/hello")
	@ResponseBody
	public String hello() {
		return this.helloService.sayHello(applicationName);
	}

}
