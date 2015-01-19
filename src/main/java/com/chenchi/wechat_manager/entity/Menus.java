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
 * @Description: 管理后台菜单
 * @see: Menus 此处填写需要参考的类
 * @version 2015年1月19日 下午4:22:07
 * @author chenchi
 */
@Entity
@Table(name = "WM_MENUS")
public class Menus extends AutoIDEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 菜单名
	 */
	private String menuName;
	/**
	 * 菜单层级
	 */
	private int levels;
	/**
	 * 状态
	 */
	private Status status;
	/**
	 * 指向地址
	 */
	private String url;
	/**
	 * 父级菜单id
	 */
	private long parentId;
	/**
	 * 所属权限
	 */
	private ManagerRole inRole;

	@Column(name = "MENU_NAME", length = 60)
	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	@Column(name = "LEVELS")
	public int getLevels() {
		return levels;
	}

	public void setLevels(int levels) {
		this.levels = levels;
	}

	@Enumerated(value = EnumType.STRING)
	@Column(name = "STATUS", columnDefinition = "VARCHAR(10)")
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Column(name = "URL", length = 256)
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "PARENT_ID")
	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	@Enumerated(value = EnumType.STRING)
	@Column(name = "IN_ROLE", columnDefinition = "VARCHAR(20)")
	public ManagerRole getInRole() {
		return inRole;
	}

	public void setInRole(ManagerRole inRole) {
		this.inRole = inRole;
	}

}
