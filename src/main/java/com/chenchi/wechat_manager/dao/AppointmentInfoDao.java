package com.chenchi.wechat_manager.dao;

import java.util.List;

import com.chenchi.wechat_manager.entity.AppointmentInfo;


/**
 * @Description: 客户预约信息dao
 * @see: ManagerDao 此处填写需要参考的类
 * @version 2015年1月21日 下午5:58:49
 * @author cuiyan
 *
 */
public interface AppointmentInfoDao {
    /**
     * @Description 查询操作员列表
     * @return
     * @see 需要参考的类或方法
     */
    public List<AppointmentInfo> getList();
    
    /**
     * @Description 创建操作员
     * @param manager
     * @see 需要参考的类或方法
     */
    public void add(AppointmentInfo appointmentInfo);
}
