package com.zheng.cms.rpc.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by ZhangShuzheng on 2017/2/3.
 */
public class ZhengCmsRpcServiceApplication {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("classpath*:applicationContext*.xml");
		System.out.println(">>>>> zheng-cms-rpc-service 启动完成 <<<<<");
	}

}
