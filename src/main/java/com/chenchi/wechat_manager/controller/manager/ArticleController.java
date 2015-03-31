package com.chenchi.wechat_manager.controller.manager;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chenchi.wechat_manager.service.ArticleService;

/**
 * 
 * @Description: 文章管理
 * @see: ArticleController
 * @version 2015年3月29日 下午8:44:03
 * @author chenchi
 */
@Controller
@RequestMapping("/manager/")
public class ArticleController {
	@Resource
	public ArticleService articleService;

	@RequestMapping("queryArticles")
	public String queryArticle(HttpServletRequest request) {
		return "manager/queryArticles";
	}
}
