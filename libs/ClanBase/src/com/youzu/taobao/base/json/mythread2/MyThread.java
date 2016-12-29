package com.youzu.taobao.base.json.mythread2;

import java.util.ArrayList;


public class MyThread extends com.youzu.taobao.base.json.forumdisplay.Thread {
	private static final long serialVersionUID = -2394671015685761631L;
	private ArrayList<Detail> details;

	public ArrayList<Detail> getDetails() {
		return details;
	}

	public void setDetails(ArrayList<Detail> details) {
		this.details = details;
	}
	
}
