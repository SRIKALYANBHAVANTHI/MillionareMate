package com.example.millionaremate;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_TIMEOUT = 2000; // Splash screen duration in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Using a handler to delay the screen transition for splash screen effect
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Navigate to the next screen (Login/Register) after splash screen duration
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
                finish(); // Close MainActivity so that it's not accessible via back button
            }
        }, SPLASH_TIMEOUT);
    }
}
