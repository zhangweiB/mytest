package com.weiB.service.impl;

import org.springframework.stereotype.Service;

import com.weiB.service.UserService;

/**
 * UserServiceImpl
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年12月22日 上午9:54:16
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public void say() {
		System.out.println("===============");
	}

}
