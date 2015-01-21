package com.chenchi.wechat_manager.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.chenchi.wechat_manager.dao.AppointmentInfoDao;
import com.chenchi.wechat_manager.dao.util.EntityDao;
import com.chenchi.wechat_manager.entity.AppointmentInfo;
import com.chenchi.wechat_manager.enums.Status;
@Repository
public class AppointmentInfoDaoImpl implements AppointmentInfoDao {
    @Resource
    private EntityDao entityDao;
    
    @Override
    public List<AppointmentInfo> getList() {
        String hql = "from AppointmentInfo ";
        return entityDao.find(hql);
    }

    @Override
    public void add(AppointmentInfo appointmentInfo) {
        entityDao.persist(appointmentInfo);
    }

}
