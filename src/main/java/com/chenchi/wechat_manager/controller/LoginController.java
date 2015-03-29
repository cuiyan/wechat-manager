package com.chenchi.wechat_manager.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.chenchi.wechat_manager.bean.ManagerBean;
import com.chenchi.wechat_manager.controller.result.LoginResultBean;
import com.chenchi.wechat_manager.enums.ResultType;
import com.chenchi.wechat_manager.exception.ManagerException;
import com.chenchi.wechat_manager.service.ManagerService;

/**
 * @Description: 管理员登录、账户操作
 * @see: ManagerController 此处填写需要参考的类
 * @version 2015年1月19日 上午10:52:56
 * @author chenchi
 */
@Controller
@RequestMapping("/")
public class LoginController {

	@Resource
	private ManagerService managerService;

	/**
	 * @Description 管理员登录
	 * @return
	 * @see 需要参考的类或方法
	 */
	@RequestMapping("manager-login")
	public String managerLogin() {
		return "manager/login";
	};

	/**
	 * @Description 登录验证
	 * @param userName
	 * @param userPwd
	 * @return
	 * @see 需要参考的类或方法
	 */
	@RequestMapping("manager-logindo")
	public @ResponseBody String managerLoginDo(String userName, String userPwd, HttpSession session) {

		LoginResultBean result = new LoginResultBean();
		ManagerBean manager = new ManagerBean();

		if (userName == null || "".equals(userName)) {
			result.setType(ResultType.ERROR);
			result.setReason("用户名不能为空");
			return JSON.toJSONString(result);
		}

		if (userPwd == null || "".equals(userPwd)) {
			result.setType(ResultType.ERROR);
			result.setReason("密码不能为空");
			return JSON.toJSONString(result);
		}

		try {
			manager = managerService.loginCheck(userName, userPwd);
			session.setAttribute("manager", manager);

		} catch (ManagerException e) {
			result.setType(ResultType.ERROR);
			result.setReason(e.getMessage());
			return JSON.toJSONString(result);
		}

		result.setType(ResultType.SUCCESS);
		result.setReason(manager.getLoginKey());
		return JSON.toJSONString(result);
	}
}
