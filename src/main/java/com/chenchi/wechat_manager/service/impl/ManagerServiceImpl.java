package com.chenchi.wechat_manager.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chenchi.wechat_manager.bean.ResultCode;
import com.chenchi.wechat_manager.dao.ManagerDao;
import com.chenchi.wechat_manager.entity.Manager;
import com.chenchi.wechat_manager.exception.ManagerException;
import com.chenchi.wechat_manager.service.ManagerService;
import com.chenchi.wechat_manager.util.DigestUtil;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Resource
	private ManagerDao managerDao;

	@Override
	public List<Manager> getList() {
		return managerDao.getList();
	}

	@Override
	public Manager findByUsername(String userName) {
		return managerDao.findByUsername(userName);
	}

	@Override
	public void add(Manager manager) {
		managerDao.add(manager);
	}

	@Override
	public String loginCheck(String userName, String userPwd)
			throws ManagerException {

		Manager manager = managerDao.findByUsername(userName);

		if (manager == null) {
			throw new ManagerException("操作员不存在", ResultCode.O02);
		}

		if (!DigestUtil.md5DigestAsHex(userPwd.getBytes()).equals(
				manager.getUserPwd())) {
			throw new ManagerException("操作员密码错误", ResultCode.O03);
		}

		String createTime = String.valueOf(System.currentTimeMillis());
		String loginKey = DigestUtil.md5DigestAsHex((userName + createTime)
				.getBytes());

		return loginKey;
	}

    @Override
    public void statusCheck(String loginKey) {
        // TODO Auto-generated method stub
        
    }
}
