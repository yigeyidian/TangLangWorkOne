package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;


public class MainActivity extends Activity {
	private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) this.findViewById(R.id.image);
        
        image.setImageResource(R.drawable.gameback);
        image.setTag(R.drawable.gameback);
        
        image.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if((Integer)image.getTag() == R.drawable.gameback){
					image.setImageResource(R.drawable.welcomimage);
					image.setTag(R.drawable.welcomimage);
				}else{
					image.setImageResource(R.drawable.gameback);
			        image.setTag(R.drawable.gameback);
				}
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
