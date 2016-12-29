package com.youzu.taobao.forum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.youzu.android.framework.view.annotation.ContentView;
import com.youzu.android.framework.view.annotation.ViewInject;
import com.youzu.android.framework.view.annotation.event.OnItemClick;
import com.youzu.taobao.R;
import com.youzu.taobao.app.constant.Key;
import com.youzu.taobao.base.BaseActivity;
import com.youzu.taobao.base.json.forumdisplay.Forum;
import com.youzu.taobao.base.json.forumdisplay.Thread;
import com.youzu.taobao.base.util.StringUtils;
import com.youzu.taobao.base.util.jump.JumpThreadUtils;
import com.youzu.taobao.base.widget.list.RefreshListView;

@ContentView(R.layout.activity_forum_type)
public class ForumTypeActivity extends BaseActivity {
    private ForumTypeAdapter mAdapter;

    @ViewInject(R.id.list)
    private RefreshListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();

        Forum forum = (Forum) intent.getSerializableExtra(Key.KEY_FORUM);
        String typeName = intent.getStringExtra(Key.KEY_TYPE_NAME);
        String typeId = intent.getStringExtra(Key.KEY_TYPE_ID);
        setTitle(StringUtils.get(typeName));
        if (forum == null) {
            return;
        }
        mAdapter = new ForumTypeAdapter(this, forum, typeId);
        mListView.setAdapter(mAdapter);
    }

    @OnItemClick(R.id.list)
    public void onItemClick(AdapterView<?> parent, View view,
                            int position, long id) {
        Thread thread = (Thread) mAdapter.getItem(position);
//        ClanUtils.showDetail(this, thread.getTid());
        JumpThreadUtils.gotoThreadDetail(this,thread.getTid());
    }


}
