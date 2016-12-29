package com.youzu.taobao.base.json;

import com.youzu.taobao.base.json.favforum.AddFavForumVariables;

public class AddForumJson extends BaseJson {

	private static final long serialVersionUID = -1948992055549669100L;
	private AddFavForumVariables variables;
	public AddFavForumVariables getVariables() {
		return variables;
	}
	public void setVariables(AddFavForumVariables variables) {
		this.variables = variables;
	}
	

}
