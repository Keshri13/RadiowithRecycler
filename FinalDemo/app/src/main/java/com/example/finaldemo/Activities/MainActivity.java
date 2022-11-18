package com.example.finaldemo.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.finaldemo.R;
import com.example.finaldemo.SaviorSharedPrefrence;

public class MainActivity extends AppCompatActivity {

    TextView welcomeEmployeeTextView,
            storeIdTextView,
            positionTextView,
            primaryGroupTextView,
            locationTextView;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeEmployeeTextView = findViewById(R.id.welcomeEmployeeTextView);
        storeIdTextView = findViewById(R.id.storeIdTextView);
        positionTextView = findViewById(R.id.positionTextView);
        primaryGroupTextView = findViewById(R.id.primaryGroupTextView);
        locationTextView = findViewById(R.id.locationTextView);

        nextButton = findViewById(R.id.nextButton);

        SaviorSharedPrefrence saviorSharedPrefrence = new SaviorSharedPrefrence(this);
        saviorSharedPrefrence.recoverLoginData(this);

        String welcome_textView = "Welcome \n"+saviorSharedPrefrence.getEmpName();
        String storeId_textView = "Store Number : " + saviorSharedPrefrence.getStoreId();
        String position_textView = "Position : " + saviorSharedPrefrence.getPosition();
        String primaryGroup_textView = "Primary Group : " + saviorSharedPrefrence.getPrimaryGroup();
        String location_textView = "Location : " + saviorSharedPrefrence.getLocation();

        welcomeEmployeeTextView.setText(welcome_textView);
        storeIdTextView.setText(storeId_textView);
        positionTextView.setText(position_textView);
        primaryGroupTextView.setText(primaryGroup_textView);
        locationTextView.setText(location_textView);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TenderActivity.class);
                startActivity(intent);
            }
        });
    }
}