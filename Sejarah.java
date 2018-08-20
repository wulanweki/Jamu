package com.example.ramuan;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Sejarah extends Activity {
	ImageView sejarah;;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sejarah);
		sejarah	= (ImageView) findViewById(R.id.imageView1);
		
		Animation anim_show1 = AnimationUtils.loadAnimation(this, R.anim.fade_in);
		sejarah.setVisibility(View.VISIBLE);
		sejarah.setAnimation(anim_show1);
	}
}

