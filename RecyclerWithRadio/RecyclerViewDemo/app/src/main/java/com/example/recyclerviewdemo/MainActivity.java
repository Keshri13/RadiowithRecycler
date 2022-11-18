package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.example.recyclerviewdemo.Adapters.BikesAdapter;
import com.example.recyclerviewdemo.Models.BikeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity","Are you Ready");

        recyclerview = findViewById(R.id.recyclerview);

        ArrayList <BikeModel> list = new ArrayList<>();

        list.add(new BikeModel(R.drawable.img_1,"Hayabusa"));
        list.add(new BikeModel(R.drawable.img_2,"Hayabusa"));
        list.add(new BikeModel(R.drawable.img_3,"Hayabusa"));
        list.add(new BikeModel(R.drawable.img_4,"Hayabusa"));
        list.add(new BikeModel(R.drawable.img_5,"Hayabusa"));
        list.add(new BikeModel(R.drawable.img_6,"Hayabusa"));
        list.add(new BikeModel(R.drawable.img_7,"Hayabusa"));
        list.add(new BikeModel(R.drawable.img_8,"Hayabusa"));
        list.add(new BikeModel(R.drawable.img_10,"Hayabusa"));

        BikesAdapter adapter = new BikesAdapter(list,this);
        recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutManager);

    }
}