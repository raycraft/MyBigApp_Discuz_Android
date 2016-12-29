package com.youzu.taobao.base;

import com.youzu.taobao.base.widget.list.OnEditListener;
import com.youzu.taobao.base.widget.list.RefreshListView;

public abstract class EditableFragment extends BaseFragment implements OnEditListener{
	public abstract RefreshListView getListView();
	
}
