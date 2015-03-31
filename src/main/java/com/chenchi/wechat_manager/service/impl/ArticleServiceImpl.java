package com.chenchi.wechat_manager.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chenchi.wechat_manager.dao.ArticleDao;
import com.chenchi.wechat_manager.entity.Article;
import com.chenchi.wechat_manager.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Resource
	public ArticleDao articleDao;

	@Override
	public List<Article> getList() {
		return articleDao.getlist();
	}

}
