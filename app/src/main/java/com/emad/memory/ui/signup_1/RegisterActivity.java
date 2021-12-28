package com.emad.memory.ui.signup_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.emad.memory.R;
import com.emad.memory.ui.signup_2.RegisterActivity2;

import java.util.List;

public class RegisterActivity extends AppCompatActivity {
	
	Button btn ;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		btn = findViewById(R.id.register1_btn);
		
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivity(new Intent(getApplicationContext() , RegisterActivity2.class));
			}
		});
		
		
	}
}