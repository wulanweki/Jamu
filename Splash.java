package com.example.ramuan;

import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import android.content.Intent;


public class Splash extends Activity {
	private static int splashInterval = 2000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
	
		new Handler().postDelayed(new Runnable(){
			
	@Override
	public void run(){
	Intent i = new Intent(Splash.this, MainActivity.class);
	startActivity(i);
	
	finish();
	}
	},splashInterval);
	};
}

