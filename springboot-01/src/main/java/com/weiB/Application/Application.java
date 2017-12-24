package com.weiB.Application;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot启动类
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年12月22日 上午9:20:05
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages={"com.weiB.controller",
		    "com.weiB.service"}) // 代表该类是SpringBoot的启动类
public class Application {

	public static void main(String[] args) {
		/** 第一种方式： 运行SpringBoot应用 */
		//SpringApplication.run(Application.class, args);
		
		/** 第二种方式：运行SpringBoot应用(去掉Banner) */
		SpringApplication springApplication = 
				new SpringApplication(Application.class);
		/** 设置关闭横幅模式 */
		springApplication.setBannerMode(Mode.OFF);
		/** 运行 */
		springApplication.run(args);
		
		System.out.println("hello world");
	
	}
}