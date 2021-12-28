package com.emad.memory.ui.signup_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.emad.memory.R;
import com.emad.memory.ui.login.LoginActivity;

public class RegisterActivity2 extends AppCompatActivity {
	
	
	Button btn ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register2);
		
		btn = findViewById(R.id.button);
		
		
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(getApplicationContext() , LoginActivity.class));
			}
		});
		
		
		
		
	}
}