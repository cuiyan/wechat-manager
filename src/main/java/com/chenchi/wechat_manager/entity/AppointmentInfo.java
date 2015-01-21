package com.chenchi.wechat_manager.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.chenchi.wechat_manager.dao.util.AutoIDEntity;
/**
 * @Description: 客户预约信息
 * @see: manager 此处填写需要参考的类
 * @version 2015年1月21日 下午4:13:08
 * @author cuiyan
 */
@Entity
@Table(name = "WM_APPOINTMENT_INFO")
public class AppointmentInfo extends AutoIDEntity {
    private static final long serialVersionUID = 1L;
    /**
     * 预约姓名
     */
    private String babyName;
    /**
     * 出生年月
     */
    private Date birthday;
    /**
     * 联系电话
     */
    private String telephone;
    /**
     * 获取途径
     */
    private String listenWay;
    
    private Date createTime;
    /**
     * 备注
     */
    private String remark;
    @Column(name="BABY_NAME",length=60)
    public String getBabyName() {
        return babyName;
    }
    public void setBabyName(String babyName) {
        this.babyName = babyName;
    }
    @Column(name="BIRTHDAY")
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    @Column(name="TELEPHONE",length=20)
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    @Column(name="LINSTEN_WAY",length=50)
    public String getListenWay() {
        return listenWay;
    }
    public void setListenWay(String listenWay) {
        this.listenWay = listenWay;
    }
    @Column(name="REMARK",length=255)
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    @Column(name="CREATE_TIME")
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    
}
