package com.chenchi.wechat_manager.controller.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HttpServletBean;

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
    public String queryAppointment(HttpServletRequest request){
//        List<AppointmentInfo>  appList = new ArrayList<AppointmentInfo>();
//        appList = appointmentInfoService.getList();
//        Map<String, Object> result = new HashMap<String, Object>() ;
//        result.put("list", appList);
//        request.setAttribute("list", appList);
        return  "manager/queryAppointment";
    }
    @RequestMapping("queryAppointmentList")
    @ResponseBody
    public List<AppointmentInfo> queryAppointmentList(){
        List<AppointmentInfo>  appList = new ArrayList<AppointmentInfo>();
        appList = appointmentInfoService.getList();
        return appList;
    }
}
