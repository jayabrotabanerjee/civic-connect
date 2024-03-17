package com.example.civicconnect;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText complaintEditText;
    private Button submitComplaintButton;
    private TextView announcementTextView;
    private Button signInButton;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        complaintEditText = findViewById(R.id.complaintEditText);
        submitComplaintButton = findViewById(R.id.submitComplaintButton);
        announcementTextView = findViewById(R.id.announcementTextView);
        signInButton = findViewById(R.id.signInButton);
        signUpButton = findViewById(R.id.signUpButton);

        // Example announcement from the government
        String announcement = "Important announcement: Road construction on Main Street will start tomorrow.";
        announcementTextView.setText(announcement);

        // Display "CIVIC CONNECT (DEVELOPED BY ROLL 2, 9, 47 of CSBS)"
        TextView titleTextView = findViewById(R.id.titleTextView);
        titleTextView.setText("CIVIC CONNECT (DEVELOPED BY ROLL 2, 9, 47 of CSBS)");

        // Button click listeners
        submitComplaintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitComplaint();
            }
        });

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSignIn();
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToSignUp();
            }
        });
    }

    private void submitComplaint() {
        String complaint = complaintEditText.getText().toString().trim();
        if (!TextUtils.isEmpty(complaint)) {
            // Code to send complaint to server or perform relevant action
            Toast.makeText(this, "Complaint submitted successfully!", Toast.LENGTH_SHORT).show();
            // Clear EditText after submission
            complaintEditText.setText("");
        } else {
            Toast.makeText(this, "Please enter your complaint", Toast.LENGTH_SHORT).show();
        }
    }

    private void navigateToSignIn() {
        Intent intent = new Intent(MainActivity.this, SignInActivity.class);
        startActivity(intent);
    }

    private void navigateToSignUp() {
        Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(intent);
    }
}



