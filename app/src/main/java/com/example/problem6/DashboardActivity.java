package com.example.problem6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        // Bottom navigation icons
        ImageView homeIcon = findViewById(R.id.ic_home);
        ImageView statsIcon = findViewById(R.id.ic_stats);
        ImageView profileIcon = findViewById(R.id.ic_profile);


        // Click listener for navigation
        homeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this, HomeActivity.class));
            }
        });

    }
}