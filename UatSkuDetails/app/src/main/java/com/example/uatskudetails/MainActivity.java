package com.example.uatskudetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextSkuNumber;
    Button buttonCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextSkuNumber = findViewById(R.id.editTextTextSkuNumber);
        buttonCheck = findViewById(R.id.buttonCheck);

        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DisplaySkuActivity.class);
                intent.putExtra("skuNumber",editTextSkuNumber.getText().toString());
                startActivity(intent);
            }
        });

    }

    private void runHandler() {

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, DisplaySkuActivity.class);
            startActivity(intent);
            finish();
        }, 2000);

    }
}