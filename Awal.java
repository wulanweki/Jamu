package com.example.ramuan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class Awal extends Activity {
	ImageView sejarah, penyakit, ramuan, jamu, test;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awal);
        sejarah	= (ImageView) findViewById(R.id.imageButton1);
		penyakit	= (ImageView) findViewById(R.id.imageButton2);
		ramuan	= (ImageView) findViewById(R.id.imageButton3);
		jamu	= (ImageView) findViewById(R.id.imageButton4);
		test	= (ImageView) findViewById(R.id.imageButton5);
		
		Animation anim_show1 = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
		Animation anim_show2 = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
		Animation anim_show3 = AnimationUtils.loadAnimation(this, R.anim.linier);
		anim_show1.setStartOffset(500);
		anim_show2.setStartOffset(1000);
		sejarah.setVisibility(View.VISIBLE);
		sejarah.setAnimation(anim_show3);
		
		penyakit.setVisibility(View.VISIBLE);
		penyakit.setAnimation(anim_show1);
		
		ramuan.setVisibility(View.VISIBLE);
		ramuan.setAnimation(anim_show2);
		
		jamu.setVisibility(View.VISIBLE);
		jamu.setAnimation(anim_show1);
		
		test.setVisibility(View.VISIBLE);
		test.setAnimation(anim_show2);
    }
	
	public void go_sejarah (View view) {
		Intent intent = new Intent(Awal.this, Sejarah.class);
		startActivity(intent);
	}
	
	public void go_sakit (View view) {
		Intent intent = new Intent(Awal.this, Penyakit.class);
		startActivity(intent);
	}
	public void go_ramu (View view) {
		Intent intent = new Intent(Awal.this, Ramuan.class);
		startActivity(intent);
	}
	public void go_jamu (View view) {
		Intent intent = new Intent(Awal.this, Jamu.class);
		startActivity(intent);
	}
	public void go_test (View view) {
		Intent intent = new Intent(Awal.this, Testimonial.class);
		startActivity(intent);
	}
}

