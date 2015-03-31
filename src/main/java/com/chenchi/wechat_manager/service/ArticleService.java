package com.chenchi.wechat_manager.service;

import java.util.List;

import com.chenchi.wechat_manager.entity.Article;

public interface ArticleService {
	/**
	 * @Description 查询文章列表
	 * @return
	 * @see 需要参考的类或方法
	 */
	public List<Article> getList();
}
