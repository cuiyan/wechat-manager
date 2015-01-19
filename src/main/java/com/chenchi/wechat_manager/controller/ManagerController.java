package com.chenchi.wechat_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 管理员登录、账户操作
 * @see: ManagerController 此处填写需要参考的类
 * @version 2015年1月19日 上午10:52:56
 * @author chenchi
 */
@Controller
@RequestMapping("/")
public class ManagerController {

	@RequestMapping("manager-login")
	public String managerLogin() {
		return "manager/login";
	};
}
