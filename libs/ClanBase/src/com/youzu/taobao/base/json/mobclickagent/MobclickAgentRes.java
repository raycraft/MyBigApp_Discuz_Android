package com.youzu.taobao.base.json.mobclickagent;

import com.youzu.taobao.base.json.BaseResponse;

/**
 * Created by Zhao on 15/6/2.
 */
public class MobclickAgentRes extends BaseResponse {

    private MobclickAgentConfig config;

    public MobclickAgentConfig getConfig() {
        return config;
    }

    public void setConfig(MobclickAgentConfig config) {
        this.config = config;
    }
}
