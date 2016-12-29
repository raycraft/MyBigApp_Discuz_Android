package com.youzu.taobao.base.json;

import com.youzu.android.framework.json.annotation.JSONField;
import com.youzu.taobao.base.json.forumdisplay.ForumDisplayVariables;

public class ForumDisplayJson extends BaseJson {
	
	private static final long serialVersionUID = -2375782355111698214L;
	private ForumDisplayVariables variables;

	@Override
	public ForumDisplayVariables getVariables() {
		return variables;
	}

	@JSONField(name="Variables")
	public void setVariables(ForumDisplayVariables variables) {
		this.variables = variables;
	}
	
	
}
