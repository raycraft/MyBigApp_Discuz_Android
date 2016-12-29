package com.youzu.taobao.base.json.thread;

import com.youzu.android.framework.json.annotation.JSONField;
import com.youzu.taobao.base.json.BaseJson;

/**
 * Created by wjwu on 2015/12/15.
 */
public class ThreadPayJson extends BaseJson {
    private ThreadPayVariables variables;

    public ThreadPayVariables getVariables() {
        return variables;
    }

    @JSONField(name = "Variables")
    public void setVariables(ThreadPayVariables variables) {
        this.variables = variables;
    }
}
