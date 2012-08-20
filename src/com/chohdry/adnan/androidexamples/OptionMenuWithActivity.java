package com.chohdry.adnan.androidexamples;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class OptionMenuWithActivity extends Activity {

	/*
	 * Override function onCreateOptionsMenu(Menu menu)
	 * Get menu inflater from activity
	 * Inflate layout (assign custom menu layout) 
	 * Call super class's onCreateOptionsMenu(menu)
	 */
	//
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.my_menu, menu);
		
		return super.onCreateOptionsMenu(menu);
	}
	
	/**
	 * Override function onOptionsItemSelected(MenuItem item)
	 * Identify the item
	 * Call super class's onOptionsItemSelected(MenuItem item)
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		if(item.getItemId()==R.id.menu_option_one){
			//do whatever you want
		}
		return super.onOptionsItemSelected(item);
	}
}
