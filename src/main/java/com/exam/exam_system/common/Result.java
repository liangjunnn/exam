package com.exam.exam_system.common;

/**
 * 
 * @ClassName: Result  
 * @Description:
 * @author:
 * @date: 2020/3/22 15:30
 * @version : V1.0
 */
public class Result<T> {

	/** 处理是否成功 **/
	private boolean success = true;
	/** 接口错误码 **/
	private String errorCode;
	/** 接口错误信息 **/
	private String errorMsg;
	/** 业务数据 **/
	private T obj;

	public Result(String errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.success = false;
	}

	public Result() {
		super();
	}

	public Result(T obj) {
		super();
		this.success = true;
		this.obj = obj;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}
