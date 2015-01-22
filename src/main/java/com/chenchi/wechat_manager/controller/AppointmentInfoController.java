package com.chenchi.wechat_manager.controller;

import java.text.ParseException;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chenchi.wechat_manager.entity.AppointmentInfo;
import com.chenchi.wechat_manager.service.AppointmentInfoService;
import com.chenchi.wechat_manager.util.DateUtils;

/**
 * @Description: 预约账户信息
 * @see: AppointmentInfoController 此处填写需要参考的类
 * @version 2015年1月21日 上午10:52:56
 * @author cuiyan
 */
@Controller
@RequestMapping("/appointment/")
public class AppointmentInfoController {
    @Resource
    private AppointmentInfoService  appointmentInfoService;
  
    @RequestMapping("getinfo")
    public String getInfo(){
        return "/appointment/getInfo";
    }
    
    @RequestMapping("getinfodo")
    public String getInfoDo(String babyName,String birthday,String telephone,String listenWay,String remark){
        AppointmentInfo appointmentInfo = new AppointmentInfo();
        appointmentInfo.setBabyName(babyName);
        try{
            appointmentInfo.setBirthday(DateUtils.StringToDate(birthday));
        }catch(ParseException e){
            e.printStackTrace();
        }
        appointmentInfo.setTelephone(telephone);
        appointmentInfo.setListenWay(listenWay);
        appointmentInfo.setRemark(remark);
        appointmentInfo.setCreateTime(new Date());
        appointmentInfoService.add(appointmentInfo);
        return "/appointment/getInfoDo";
    }
}
