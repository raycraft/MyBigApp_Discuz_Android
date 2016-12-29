package com.youzu.taobao.myfav;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.youzu.taobao.R;
import com.youzu.taobao.base.json.FavThreadJson;
import com.youzu.taobao.base.net.ClanHttpParams;
import com.youzu.taobao.base.util.DateUtils;
import com.youzu.taobao.base.util.StringUtils;
import com.youzu.taobao.base.widget.ViewHolder;
import com.youzu.taobao.base.widget.list.BaseRefreshAdapter;
import com.youzu.taobao.base.json.favthread.Thread;

public class FavThreadAdapter extends BaseRefreshAdapter<FavThreadJson> {
	private Context context;

	public FavThreadAdapter(Context context, ClanHttpParams params) {
		super(params);
		this.context = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = View.inflate(context, R.layout.item_fav_thread, null);
		}
		Thread thread = (Thread) getItem(position);
		TextView contentText = ViewHolder.get(convertView,
				R.id.content);
		TextView nameText = ViewHolder.get(convertView, R.id.name);
		CheckBox checkbox = ViewHolder.get(convertView, R.id.checkbox);

		checkbox.setVisibility(isEditable() ? View.VISIBLE : View.GONE);
		contentText.setText(StringUtils.get(thread.getTitle()));
		String author = thread.getAuthor();
		String timestamp = thread.getDateline();
		String date = "";
		try {
			date = DateUtils.getDate4Discuz(timestamp, DateUtils.YEAR_MONTH_DAY_HOUR_MIN_SEC);
		} catch (Exception e) {
		}
		nameText.setText(author + " " + date);
		return convertView;
	}

}