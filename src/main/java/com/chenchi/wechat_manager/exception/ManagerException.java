package com.chenchi.wechat_manager.exception;

public class ManagerException extends Exception {

	private static final long serialVersionUID = -8585623956870888168L;
	private String errorCode;

	public ManagerException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public ManagerException(String message) {
		super(message);
	}

	public ManagerException(Throwable ex) {
		super(ex);
	}

	public ManagerException(String message, Throwable ex) {
		super(message, ex);
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
