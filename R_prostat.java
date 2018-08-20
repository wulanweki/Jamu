package com.example.ramuan;

import android.widget.ViewFlipper;
import android.os.Bundle;
import android.app.Activity;

public class R_prostat extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.r_prostat);
		ViewFlipper slideshow = (ViewFlipper)findViewById(R.id.imageView1);
		slideshow.startFlipping();

	}
}

