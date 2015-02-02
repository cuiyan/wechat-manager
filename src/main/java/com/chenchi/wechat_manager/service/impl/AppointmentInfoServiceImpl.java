package com.chenchi.wechat_manager.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;




import org.springframework.transaction.annotation.Transactional;

import com.chenchi.wechat_manager.dao.AppointmentInfoDao;
import com.chenchi.wechat_manager.entity.AppointmentInfo;
import com.chenchi.wechat_manager.service.AppointmentInfoService;
@Service
@Transactional
public class AppointmentInfoServiceImpl implements AppointmentInfoService {
    @Resource
    private AppointmentInfoDao appointmentInfoDao;
    @Override
    public List<AppointmentInfo> getList() {
        return appointmentInfoDao.getList();
    }

    @Override
    public void add(AppointmentInfo appointmentInfo) {
        appointmentInfoDao.add(appointmentInfo);
    }

}
