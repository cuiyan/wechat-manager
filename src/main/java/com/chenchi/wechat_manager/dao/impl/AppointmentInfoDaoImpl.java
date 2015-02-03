package com.chenchi.wechat_manager.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.chenchi.wechat_manager.dao.AppointmentInfoDao;
import com.chenchi.wechat_manager.entity.AppointmentInfo;

@Repository
public class AppointmentInfoDaoImpl implements AppointmentInfoDao {

	@Resource
	private SessionFactory sessionFactory;

	@Override
	public List<AppointmentInfo> getList() {
		String hql = "from AppointmentInfo ";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		return query.list();
	}

	@Override
	public void add(AppointmentInfo appointmentInfo) {
		Session session = sessionFactory.getCurrentSession();
		session.save(appointmentInfo);
	}

}
