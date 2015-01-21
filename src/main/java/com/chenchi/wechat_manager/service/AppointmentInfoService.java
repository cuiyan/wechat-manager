package com.chenchi.wechat_manager.service;

import java.util.List;

import com.chenchi.wechat_manager.entity.AppointmentInfo;

/**
 * @Description: 客户预约信息service
 * @see: ManagerService 此处填写需要参考的类
 * @version 2015年1月21日 上午11:13:02
 * @author cuiyan
 */
public interface AppointmentInfoService {
    /**
     * @Description 查询预约客户信息列表
     * @return
     * @see 需要参考的类或方法
     */
    public List<AppointmentInfo> getList();
    
    /**
     * @Description 添加预约客户信息
     * @param manager
     * @see 需要参考的类或方法
     */
    public void add(AppointmentInfo appointmentInfo);
}
