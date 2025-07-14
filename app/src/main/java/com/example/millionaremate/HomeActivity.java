package com.example.millionaremate;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Handler;


import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private static final int SPLASH_TIMEOUT = 2000; // Splash screen duration in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button registerButton = findViewById(R.id.register_button);
        Button loginButton = findViewById(R.id.login_button);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the registration activity
                startActivity(new Intent(HomeActivity.this, RegistrationActivity.class));
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the login activity
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            }
        });
    }
}
