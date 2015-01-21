package com.chenchi.wechat_manager.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chenchi.wechat_manager.entity.AppointmentInfo;
import com.chenchi.wechat_manager.service.AppointmentInfoService;

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
        return "getinfo";
    }
    
    @RequestMapping("getinfodo")
    public String getInfoDo(AppointmentInfo appointmentInfo){
        appointmentInfoService.add(appointmentInfo);
        return "getinfo";
    }
}
