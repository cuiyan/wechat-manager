package com.chenchi.wechat_manager.service;

import java.util.List;

import com.chenchi.wechat_manager.bean.ManagerBean;
import com.chenchi.wechat_manager.entity.Manager;
import com.chenchi.wechat_manager.exception.ManagerException;

/**
 * @Description: 后台操作员service
 * @see: ManagerService 此处填写需要参考的类
 * @version 2015年1月20日 上午11:13:02
 * @author chenchi
 */
public interface ManagerService {

	/**
	 * @Description 查询操作员列表
	 * @return
	 * @see 需要参考的类或方法
	 */
	public List<Manager> getList();

	/**
	 * @Description 根据用户名查找操作员
	 * @param userName
	 * @return
	 * @see 需要参考的类或方法
	 */
	public Manager findByUsername(String userName);

	/**
	 * @Description 创建操作员
	 * @param manager
	 * @see 需要参考的类或方法
	 */
	public void add(Manager manager);

	/**
	 * @Description 登录验证
	 * @param userName
	 * @param userPwd
	 * @return loginKey
	 * @throws ManagerException
	 * @see 需要参考的类或方法
	 */
	public ManagerBean loginCheck(String userName, String userPwd)
			throws ManagerException;

	/**
	 * 登录状态校验
	 * 
	 * @param loginKey
	 * @throws ManagerException
	 */
	public void statusCheck(ManagerBean manager, String loginKey) throws ManagerException;

}
