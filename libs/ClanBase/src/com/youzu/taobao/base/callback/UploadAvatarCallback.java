package com.youzu.taobao.base.callback;

import android.support.v4.app.FragmentActivity;

import com.youzu.taobao.base.json.VariablesJson;

public abstract class UploadAvatarCallback extends ProgressCallback<VariablesJson>{

	public UploadAvatarCallback(FragmentActivity activity) {
		super(activity);
	}
}
