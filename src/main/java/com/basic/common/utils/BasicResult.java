package com.basic.common.utils;

import java.io.Serializable;

/**
 * 返回给客户端的基本信息数据对象
 *
 */
public class BasicResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1536178736804261810L;

	/**
	 * 返回的状态值 0:失败 1:成功
	 */
	private int resultCode = 0;
	/**
	 * 返回的信息描述 如：用户不存在 resultCode 为1时可为空
	 */
	private String resultMessage;
	/**
	 * 数据集 list Map obj 等
	 */
	private Object dataCollection;

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Object getDataCollection() {
		return dataCollection;
	}

	public void setDataCollection(Object dataCollection) {
		this.dataCollection = dataCollection;
	}

	@Override
	public String toString() {

		return super.toString();
	}
}
