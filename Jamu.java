package com.example.ramuan;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Jamu extends Activity {
	TextView text;
	@Override
    protected void onCreate(Bundle savedInstanceState) {  
       super.onCreate(savedInstanceState);
       setContentView(R.layout.jamu);
       ImageView img = (ImageView)findViewById(R.id.imageView1);
       img.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               Intent intent = new Intent();
               intent.setAction(Intent.ACTION_VIEW);
               intent.addCategory(Intent.CATEGORY_BROWSABLE);
               intent.setData(Uri.parse("http://www.agusspriyono05.blogspot.com/2014/08/macam-macam-jamu-dan-manfaatnya.html"));
               startActivity(intent);

           }
           
        });
        }};  