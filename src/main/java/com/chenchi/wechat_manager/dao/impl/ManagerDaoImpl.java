package com.chenchi.wechat_manager.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.chenchi.wechat_manager.dao.ManagerDao;
import com.chenchi.wechat_manager.entity.Manager;
import com.chenchi.wechat_manager.enums.Status;

@Repository
public class ManagerDaoImpl implements ManagerDao {

	@Resource
	private SessionFactory sessionFactory;

	@Override
	public List<Manager> getList() {
		String hql = "from Manager where status = ?";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter(0, Status.TRUE);
		return query.list();
	}

	@Override
	public Manager findByUsername(String userName) {
		String hql = "from Manager where userName = ? and status = ?";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter(0, userName);
		query.setParameter(1, Status.TRUE);

		List<Manager> list = query.list();
		if (!list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void add(Manager manager) {
		Session session = sessionFactory.getCurrentSession();
		session.save(manager);
	}

}
