package com.chenchi.wechat_manager.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.chenchi.wechat_manager.dao.ManagerDao;
import com.chenchi.wechat_manager.dao.util.EntityDao;
import com.chenchi.wechat_manager.entity.Manager;
import com.chenchi.wechat_manager.enums.Status;

@Repository
public class ManagerDaoImpl implements ManagerDao {

	@Resource
	private EntityDao entityDao;

	@Override
	public List<Manager> getList() {
		String hql = "from Manager where status = ?";
		return entityDao.find(hql, Status.TRUE);
	}

	@Override
	public Manager findByUsername(String userName) {
		String hql = "from Manager where userName = ? and status = ?";
		return entityDao.findUnique(Manager.class, hql, userName, Status.TRUE);
	}

	@Override
	public void add(Manager manager) {
		entityDao.persist(manager);
	}

}
