package com.example.recyclerwithradio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Initialize variable
    RecyclerView recyclerView;
    ItemClickListener itemClickListener;
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Assign variable
        recyclerView = findViewById(R.id.recycler_view);

        // initialize array list
        ArrayList<String> arrayList = new ArrayList<>();

        // Use for loop
        for (int i = 0; i < 20; i++) {
            // add values in array list
            arrayList.add("RB " + i);
        }


        // Initialize listener
        itemClickListener = new ItemClickListener() {
            @Override public void onClick(String s)
            {
                // Notify adapter
                recyclerView.post(new Runnable() {
                    @Override public void run()
                    {
                        adapter.notifyDataSetChanged();
                    }
                });
                // Display toast
                Toast
                        .makeText(getApplicationContext(),
                                "Selected : " + s,
                                Toast.LENGTH_SHORT)
                        .show();
            }
        };

        // Set layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize adapter
        adapter = new MainAdapter(arrayList, itemClickListener);

        // set adapter
        recyclerView.setAdapter(adapter);


    }
}