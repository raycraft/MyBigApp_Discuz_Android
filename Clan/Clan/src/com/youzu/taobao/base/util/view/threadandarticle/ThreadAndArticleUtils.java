package com.youzu.taobao.base.util.view.threadandarticle;

import android.app.Activity;

import com.kit.utils.ListUtils;
import com.kit.utils.intentutils.IntentUtils;
import com.youzu.taobao.R;
import com.youzu.taobao.base.json.forumnav.NavForum;
import com.youzu.taobao.base.util.ClanUtils;
import com.youzu.taobao.base.util.ToastUtils;
import com.youzu.taobao.main.base.forumnav.DBForumNavUtils;
import com.youzu.taobao.thread.ThreadPublishActivity;

import java.util.List;

/**
 * 设置文章和帖子列表
 * Created by Zhao on 15/11/5.
 */
public class ThreadAndArticleUtils extends ContentUtils {



    public static void addThread(Activity context) {
        if (ClanUtils.isToLogin(context, null, Activity.RESULT_OK, false)) {
            return;
        }
        List<NavForum> forums = DBForumNavUtils.getAllNavForum(context);
        if (ListUtils.isNullOrContainEmpty(forums)) {
            ToastUtils.mkShortTimeToast(context, context.getString(R.string.wait_a_moment));
        } else
            IntentUtils.gotoNextActivity(context, ThreadPublishActivity.class);
    }

}
