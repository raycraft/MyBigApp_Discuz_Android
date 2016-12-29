package com.youzu.taobao.base.json;

import com.youzu.taobao.base.json.mypm.MypmVariables;

/**
 * 消息 会话列表
 * @author wangxi
 *
 */
public class MypmJson extends BaseJson {
	private static final long serialVersionUID = 8924613163934673398L;
	private MypmVariables variables;

	public MypmVariables getVariables() {
		return variables;
	}

	public void setVariables(MypmVariables variables) {
		this.variables = variables;
	}
	
}
