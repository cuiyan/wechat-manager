package com.chenchi.wechat_manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.chenchi.wechat_manager.dao.util.AutoIDEntity;
import com.chenchi.wechat_manager.enums.ManagerRole;
import com.chenchi.wechat_manager.enums.Status;

/**
 * @Description: 后台管理员
 * @see: manager 此处填写需要参考的类
 * @version 2015年1月19日 下午4:13:08
 * @author chenchi
 */
@Entity
@Table(name = "WM_MANAGER")
public class Manager extends AutoIDEntity {

	private static final long serialVersionUID = 7857547295793241025L;

	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String userPwd;
	/**
	 * 角色
	 */
	private ManagerRole role;
	/**
	 * 状态
	 */
	private Status status;

	@Column(name = "USER_NAME", length = 60)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "USER_PWD", length = 256)
	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	@Enumerated(value = EnumType.STRING)
	@Column(name = "MANAGER_ROLE", columnDefinition = "VARCHAR(20)")
	public ManagerRole getRole() {
		return role;
	}

	public void setRole(ManagerRole role) {
		this.role = role;
	}

	@Enumerated(value = EnumType.STRING)
	@Column(name = "STATUS", columnDefinition = "VARCHAR(10)")
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
