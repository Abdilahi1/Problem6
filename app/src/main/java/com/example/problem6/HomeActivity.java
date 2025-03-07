package com.example.problem6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        // Find the "Let's go" button by ID
        Button btnLetsGo = findViewById(R.id.open_bottom_sheet);

        // Set click listener to navigate to SecondActivity
        btnLetsGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}
