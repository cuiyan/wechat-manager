package com.chenchi.wechat_manager.service.quartz;

import java.util.Date;

import org.springframework.stereotype.Service;

/**
 * @Description: 微信相关定时程序
 * @see: WechatQuartzServiceImpl 此处填写需要参考的类
 * @version 2015年1月22日 下午5:33:37
 * @author chenchi
 */
@Service
public class WechatQuartzServiceImpl {
	public void getAcceessToken() throws InterruptedException {

		System.out.println(new Date());
	}
}
