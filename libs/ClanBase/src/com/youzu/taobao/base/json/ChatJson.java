package com.youzu.taobao.base.json;

import com.youzu.taobao.base.json.mypm.ChatVariables;

public class ChatJson extends BaseJson {
	
	private ChatVariables variables;

	@Override
	public ChatVariables getVariables() {
		return variables;
	}

	public void setVariables(ChatVariables variables) {
		this.variables = variables;
	}
}
