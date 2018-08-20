package com.example.ramuan;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class About extends Activity {
	ImageView ab1, ab2;;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		ab1	= (ImageView) findViewById(R.id.imageView1);
		ab2	= (ImageView) findViewById(R.id.imageView2);
		
		Animation anim_show1 = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
		Animation anim_show2 = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
		anim_show2.setStartOffset(500);
		ab1.setVisibility(View.VISIBLE);
		ab1.setAnimation(anim_show2);
		
		ab2.setVisibility(View.VISIBLE);
		ab2.setAnimation(anim_show1);

	}
}

