package com.ycroft.threadstracker;

import java.util.Date;

public class Thread {
	
	private String mTitle;
	private Date mDeadline;
	private boolean mDone;
	private int mImportance;
	private Category mCategory;
	
	public Thread(String title, Category category, Date deadline, boolean done, int importance) {
		mTitle = title;
		mCategory = category;
		mDeadline = deadline;
		mDone = done;
		mImportance = importance;
	}

}
