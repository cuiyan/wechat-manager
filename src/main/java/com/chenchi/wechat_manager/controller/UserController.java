package com.chenchi.wechat_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/")
public class UserController {

	/**
	 * 微站首页
	 * 
	 * @return
	 */
	@RequestMapping("index")
	public String index() {
		return "/user/index";
	}

	@RequestMapping("aboutus")
	public String aboutUs() {
		return "/user/aboutUs";
	}
}
