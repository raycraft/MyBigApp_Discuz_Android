package com.youzu.taobao.base.json;

import com.youzu.taobao.base.json.update.AutoUpdateInfo;

public class UpdateInfoJson extends BaseResponse {
	
	private AutoUpdateInfo data;

	@Override
	public AutoUpdateInfo getData() {
		return data;
	}

	public void setData(AutoUpdateInfo data) {
		this.data = data;
	}
}
