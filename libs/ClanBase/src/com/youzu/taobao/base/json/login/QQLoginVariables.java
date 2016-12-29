package com.youzu.taobao.base.json.login;

import com.youzu.taobao.base.json.model.Variables;

/**
 * 收藏版块
 * @author wangxi
 *
 */
public class QQLoginVariables extends Variables {

	private String hasbind;
	private String message;

	public String getHasbind() {
		return hasbind;
	}

	public void setHasbind(String hasbind) {
		this.hasbind = hasbind;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
