package com.example.finaldemo.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finaldemo.R;

public class TenderViewHolder extends RecyclerView.ViewHolder {

    public TextView tenderName;
    public TextView tenderType;
    View view;

    public TenderViewHolder(@NonNull View itemView) {

        super(itemView);

        tenderName = itemView.findViewById(R.id.tenderNameTextView);
        tenderType = itemView.findViewById(R.id.tenderTypeTextView);

        view = itemView;



    }
}
