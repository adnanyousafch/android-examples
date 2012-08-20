package com.chohdry.adnan.androidexamples;

import android.app.Activity;
import android.app.Dialog;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

//Create a new class extended from default Dialog class
public class OptionMenuWithDialog extends Dialog {

	//Define activity type variable in class
	private Activity mActivity;

	/**
	 * Implement constructor (a custom or default passing Activity)
	 * Set class variable.
	 */
	public OptionMenuWithDialog(Activity activity) {
		super(activity, android.R.style.Theme_Translucent);
		mActivity = activity;

		//Customize your dialog here
	}

	/**
	 * Override function onCreateOptionsMenu(Menu menu)
	 * Get menu inflater from activity
	 * Inflate layout (assign custom menu layout)
	 * Call super class's onCreateOptionsMenu(menu)
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		MenuInflater inflater = mActivity.getMenuInflater();
		inflater.inflate(R.menu.my_menu, menu);
		
		return super.onCreateOptionsMenu(menu);
	}
	
	/**
	 * Override function onMenuItemSelected(int featureId, MenuItem item)
	 * Identify the item
	 * Call super class's onMenuItemSelected(int featureId, MenuItem item)
	 */
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		
		if(item.getItemId()==R.id.menu_option_one){
			//do whatever you want
		}
		return super.onOptionsItemSelected(item);
	}
}