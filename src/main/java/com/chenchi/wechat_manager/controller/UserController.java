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

	/**
	 * @Description 关于我们
	 * @return
	 * @see 需要参考的类或方法
	 */
	@RequestMapping("aboutus")
	public String aboutUs() {
		return "/user/aboutUs";
	}

	/**
	 * @Description 教育理念
	 * @return
	 * @see 需要参考的类或方法
	 */
	@RequestMapping("education")
	public String education() {
		return "/user/education";
	}

	/**
	 * @Description 课程列表
	 * @return
	 * @see 需要参考的类或方法
	 */
	@RequestMapping("timetable")
	public String timetable() {
		return "/user/timetable";
	}
}
