package com.example.millionaremate;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText emailInput, passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Validate input fields
                if (validateForm()) {
                    // Registration successful, return to previous screen
                    finish();
                }
            }
        });
    }

    private boolean validateForm() {

        String email = emailInput.getText().toString().trim();
        String password = passwordInput.getText().toString();

        // Check for empty fields


        // Validate email format
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Invalid email address", Toast.LENGTH_SHORT).show();
            return false;
        }

        // Validate password length
        if (password.length() < 6) {
            Toast.makeText(this, "Password should be at least 6 characters long", Toast.LENGTH_SHORT).show();
            return false;
        }

        Toast.makeText(this,"Login Sucessfull",Toast.LENGTH_SHORT).show();
        // If all validations pass, return true
        return true;
    }
}
