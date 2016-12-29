package com.youzu.taobao.base.callback;

import android.content.Context;

import com.youzu.taobao.base.json.ForumnavJson;

public abstract class ForumnavCallback extends HttpCallback<ForumnavJson>{

	@Override
	public abstract void onSuccess(Context ctx,ForumnavJson t);
	@Override
	public abstract void onFailed(Context cxt,int errorCode, String errorMsg);

}
