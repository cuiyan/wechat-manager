package com.chenchi.wechat_manager.controller.result;

import java.io.Serializable;

import com.chenchi.wechat_manager.enums.ResultType;

public class LoginResultBean implements Serializable {

	private static final long serialVersionUID = -6976622481894731707L;

	/**
	 * 处理结果
	 */
	private ResultType type;
	/**
	 * 失败原因
	 */
	private String reason;

	public ResultType getType() {
		return type;
	}

	public void setType(ResultType type) {
		this.type = type;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginResultBean [type=");
		builder.append(type);
		builder.append(", reason=");
		builder.append(reason);
		builder.append("]");
		return builder.toString();
	}

}
