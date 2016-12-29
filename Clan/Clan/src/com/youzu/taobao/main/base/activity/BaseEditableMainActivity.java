package com.youzu.taobao.main.base.activity;

import android.os.Bundle;

import com.kit.utils.DialogUtils;
import com.youzu.taobao.R;
import com.youzu.taobao.app.config.BuildType;
import com.youzu.taobao.base.EditableActivity;
import com.youzu.taobao.base.net.LoadEmojiUtils;
import com.youzu.taobao.base.widget.list.RefreshListView;

/**
 * Created by Zhao on 15/9/15.
 */
public class BaseEditableMainActivity extends EditableActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        showDialog();

//        PollingUtils.startCheckNewMessage(this, mPreferenceListener);


        LoadEmojiUtils.startLoadSmiley(this);
    }


    @Override
    public RefreshListView getListView() {
        return null;
    }


    public void showDialog() {
        if (getString(R.string.build_type).equals(BuildType.TEST)) {
            DialogUtils.showDialog(this, getString(R.string.tips), getString(R.string.notice_test_build), getString(R.string.confirm), getString(R.string.cancel), true, true, null, null);
        }
    }



}
