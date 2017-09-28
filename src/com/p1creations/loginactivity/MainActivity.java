package com.p1creations.loginactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText etUsername, etPassword;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		etUsername = (EditText) findViewById(R.id.etUsername);
		etPassword = (EditText) findViewById(R.id.etPassword);

	}
	
	public void login(View v) {
		//type in any user name **passowrd is password**
		
		if (/*etUsername.getText().toString().equals("username") &&*/ etPassword.getText().toString().equals("password")) {
			Intent i = new Intent(MainActivity.this, SecondActivity.class);
			i.putExtra(SecondActivity.USERNAME, etUsername.getText().toString());
			startActivity(i);
			//Toast.makeText(MainActivity.this, "Loging Successful", Toast.LENGTH_LONG).show();
		} else
			Toast.makeText(MainActivity.this, "Username or Password is invalid", Toast.LENGTH_LONG).show();
		
	}
	
	public void forgot(View v) {
		if (etUsername.getText().toString().equals("username"))
			Toast.makeText(MainActivity.this, "The Password is 'password'", Toast.LENGTH_SHORT).show();
	    else 
			Toast.makeText(MainActivity.this, "Please Enter A Valid Username", Toast.LENGTH_LONG).show();
			
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
