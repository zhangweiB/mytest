package com.weiB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weiB.service.UserService;

/**
 * HelloController
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年12月22日 上午9:42:19
 * @version 1.0
 */
@RestController
public class HelloController {
	@Autowired
	private UserService userService;
	/** 定义environment封装属性文件中的所有属性 */
	@Autowired
	private Environment environment;
	/** 单个注入属性文件中的属性 */
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;
	
	@GetMapping("/hello")
	public String hello(){
		System.out.println("name:" + environment.getProperty("name"));
		System.out.println("url:" + environment.getProperty("url"));
		System.out.println(name + "-->" + url);
		userService.say();
		return "Spring Boot 88!";
	}
}