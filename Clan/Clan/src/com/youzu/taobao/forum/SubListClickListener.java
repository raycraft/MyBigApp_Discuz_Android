package com.youzu.taobao.forum;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;

import com.kit.utils.ZogUtils;
import com.youzu.taobao.app.constant.Key;
import com.youzu.taobao.base.json.forumnav.NavForum;

public class SubListClickListener implements OnClickListener {
    private FragmentActivity mContext;
    private NavForum forum;

    public SubListClickListener(FragmentActivity context, NavForum forum) {
        mContext = context;
        this.forum = forum;
    }

    @Override
    public void onClick(View widget) {

        ZogUtils.printLog(SubListClickListener.class,"SubListClickListener onClick!!!");
        Intent intent = new Intent(mContext, ForumActivity.class);
        intent.putExtra(Key.KEY_FORUM, forum);
        mContext.startActivity(intent);
    }

}
