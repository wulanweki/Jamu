package com.example.ramuan;

import android.widget.ViewFlipper;
import android.os.Bundle;
import android.app.Activity;

public class R_hepatitis extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.r_hepatitis);
		ViewFlipper slideshow = (ViewFlipper)findViewById(R.id.imageView1);
		slideshow.startFlipping();

	}
}

