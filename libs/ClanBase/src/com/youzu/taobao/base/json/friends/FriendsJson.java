package com.youzu.taobao.base.json.friends;

import com.youzu.taobao.base.json.BaseJson;

/**
 * Created by tangh on 2015/7/15.
 */
public class FriendsJson extends BaseJson {
    private FriendsVariables variables;

    @Override
    public FriendsVariables getVariables() {
        return variables;
    }

    public void setVariables(FriendsVariables variables) {
        this.variables = variables;
    }
}
