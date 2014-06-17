package com.ycroft.threadstracker;

import android.support.v4.app.Fragment;

public class ThreadActivity extends SingleFragmentActivity {

	public Fragment createFragment() {
		return new ThreadFragment();
	}
	
}
