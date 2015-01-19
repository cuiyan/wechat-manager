package com.chenchi.wechat_manager.dao;

import org.springframework.stereotype.Repository;

import com.chenchi.wechat_manager.entity.Manager;

/**
 * @Description: 后台操作员dao
 * @see: ManagerDao 此处填写需要参考的类
 * @version 2015年1月19日 下午5:58:49
 * @author chenchi
 */

@Repository
public interface ManagerDao {

	public List<Manager> getList();
}
