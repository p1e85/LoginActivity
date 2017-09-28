package com.p1creations.loginactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends Activity {
	TextView hello, textView1;
	Button btnLogOut;
	public static final String USERNAME = "username";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		hello = (TextView) findViewById(R.id.tHello);
		textView1 = (TextView) findViewById(R.id.textView1);
		btnLogOut = (Button) findViewById(R.id.btnLogOut);
		
		textView1.setText(getIntent().getStringExtra(USERNAME));
		
	}
	
	public void logOut(View view) {
		Intent i = new Intent(SecondActivity.this, MainActivity.class);
		startActivity(i);
		Toast.makeText(SecondActivity.this, "Log Out Successful", Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
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
