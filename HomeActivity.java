package com.example.civicconnect;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView welcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialize UI elements
        welcomeTextView = findViewById(R.id.welcomeTextView);

        // Retrieve username from intent extras
        String username = getIntent().getStringExtra("username");

        // Display a welcome message with the username
        if (username != null && !username.isEmpty()) {
            welcomeTextView.setText("Welcome, " + username + "!");
        } else {
            welcomeTextView.setText("Welcome!");
        }

        // Sample logic: Perform any other operations or initialization for the home activity
        // For example, you can fetch data, set up UI components, or handle user interactions
    }
}

