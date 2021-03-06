package com.chenchi.wechat_manager.controller.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenchi.wechat_manager.entity.Article;
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

	@RequestMapping("managerArticles")
	public String managerArticles(HttpServletRequest request) {
		return "manager/queryArticles";
	}
	/**
	 * 查询文章列别
	 * @return
	 */
	@RequestMapping("queryArticles")
	@ResponseBody
	public List<Article> queryArticles(){
	    List<Article> list = articleService.getList();
	    return list;
	}
	@RequestMapping("saveArticle")
	@ResponseBody
	public Map<String,Object> saveArticle(HttpServletRequest request,Article article){
	    Map<String,Object> map = new HashMap<String, Object>();
	    String author = (String) request.getSession().getAttribute("userName");
	    article.setAuthor(author);
	    articleService.saveArticle(article);
	    map.put("errorMsg", false);
	    return map;
	}
}
