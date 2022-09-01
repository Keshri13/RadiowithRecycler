package com.example.recyclerviewdemo.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.Models.BikeModel;
import com.example.recyclerviewdemo.R;

import java.util.ArrayList;

public class BikesAdapter extends RecyclerView.Adapter<BikesAdapter.viewHolder> {

    ArrayList<BikeModel> bikelist;
    Context context;


    public BikesAdapter(ArrayList<BikeModel> bikelist, Context context) {
        this.bikelist = bikelist;
        this.context = context;
        Log.d("Adapter","Are you Ready");
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview, parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        BikeModel model = bikelist.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());

    }

    @Override
    public int getItemCount() {
        return bikelist.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }


    }

}
