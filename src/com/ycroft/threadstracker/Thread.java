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
	
	public Thread(String title, Category category, Date deadline, boolean done) {
		mTitle = title;
		mCategory = category;
		mDeadline = deadline;
		mDone = done;
		mImportance = mCategory.getImportance();
	}
	
	public void setTitle(String title) {
		mTitle = title;
	}
	
	public String getTitle() {
		return mTitle;
	}
	
	public void setDeadline(Date deadline) {
		mDeadline = deadline;
	}
	
	public Date getDeadline() {
		return mDeadline;
	}
	
	public void setCategory(Category category) {
		mCategory = category;
	}
	
	public Category getCategory() {
		return mCategory;
	}
	
	public void setDone(boolean done) {
		mDone = done;
	}
	
	public boolean isDone() {
		return mDone;
	}
	
	public void setImportance(int importance) {
		mImportance = importance;
	}
	
	public int getImportance() {
		return mImportance;
	}

}