package com.example.millionaremate;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    private EditText firstNameInput, lastNameInput, dobInput, emailInput, passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        firstNameInput = findViewById(R.id.first_name_input);
        lastNameInput = findViewById(R.id.last_name_input);
        dobInput = findViewById(R.id.date_of_birth_input);
        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);

        Button registerButton = findViewById(R.id.register_button);
        registerButton.setOnClickListener(new View.OnClickListener() {
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
        String firstName = firstNameInput.getText().toString().trim();
        String lastName = lastNameInput.getText().toString().trim();
        String dob = dobInput.getText().toString().trim();
        String email = emailInput.getText().toString().trim();
        String password = passwordInput.getText().toString();

        // Check for empty fields
        if (TextUtils.isEmpty(firstName) || TextUtils.isEmpty(lastName) ||
                TextUtils.isEmpty(dob) || TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return false;
        }

        // Validate first name length
        if (firstName.length() < 3 || firstName.length() > 30) {
            Toast.makeText(this, "First name should be between 3 and 30 characters", Toast.LENGTH_SHORT).show();
            return false;
        }

        // Validate last name length
        if (lastName.length() < 3 || lastName.length() > 30) {
            Toast.makeText(this, "Last name should be between 3 and 30 characters", Toast.LENGTH_SHORT).show();
            return false;
        }

        // Validate date of birth format (YYYY-MM-DD)
        if (!dob.matches("\\d{4}-\\d{2}-\\d{2}")) {
            Toast.makeText(this, "Invalid date of birth format (YYYY-MM-DD)", Toast.LENGTH_SHORT).show();
            return false;
        }

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

        Toast.makeText(this,"Registration Sucessfull",Toast.LENGTH_SHORT).show();
        // If all validations pass, return true
        return true;
    }
}
