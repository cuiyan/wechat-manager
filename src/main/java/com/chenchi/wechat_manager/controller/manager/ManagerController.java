package com.chenchi.wechat_manager.controller.manager;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chenchi.wechat_manager.entity.AppointmentInfo;
import com.chenchi.wechat_manager.service.AppointmentInfoService;
import com.chenchi.wechat_manager.service.ManagerService;
/**
 * @Description: 管理员管理操作
 * @see: ManagerController 此处填写需要参考的类
 * @version 2015年2月03日 
 * @author cuiyan
 */
@Controller
@RequestMapping("/manager/")
public class ManagerController {
    @Resource
    private ManagerService managerService;
    @Resource
    private AppointmentInfoService  appointmentInfoService;
    @RequestMapping("index")
    public String managerIndex(){
        return "manager/index";
    }
    @RequestMapping("queryAppointment")
    public List<AppointmentInfo> queryAppointment(){
        List<AppointmentInfo>  appList = new ArrayList<AppointmentInfo>();
        appList = appointmentInfoService.getList();
        return appList;
    }
}
