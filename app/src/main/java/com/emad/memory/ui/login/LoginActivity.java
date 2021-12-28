package com.emad.memory.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.emad.memory.R;
import com.emad.memory.ui.signup_1.RegisterActivity;

public class LoginActivity extends AppCompatActivity {
	
	Button btn ;
	TextView forget , newAccount ;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		btn = findViewById(R.id.button1);
		forget = findViewById(R.id.textView2);
		newAccount = findViewById(R.id.textView3);
		
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(getApplicationContext(), "بس حلو اوى كدا", Toast.LENGTH_SHORT).show();
			}
		});
		
		forget.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(getApplicationContext(), "معلش", Toast.LENGTH_SHORT).show();
			}
		});
		
		newAccount.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(getApplicationContext() , RegisterActivity.class));
			}
		});
		
		
	}
}