package com.youzu.taobao.base.widget.list;

import android.content.Context;
import android.util.AttributeSet;

import com.youzu.taobao.R;
import com.youzu.taobao.base.widget.EmptyView;

/**
 * Created by tangh on 2015/7/9.
 */
public class SearchRefreshListview extends RefreshListView {
    public SearchRefreshListview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void setEmptyView(Context context) {
        mEmptyView = new EmptyView(context, R.layout.include_empty_search_view);
        mEmptyView.setOnErrorClickListener(mErrorClickListener);
        setEmptyView(mEmptyView);
    }

}
