package com.example.finaldemo.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finaldemo.Models.TenderModelDataForRecyclerView;
import com.example.finaldemo.R;
import com.example.finaldemo.ViewHolders.TenderViewHolder;

import java.util.Collections;
import java.util.List;

public class TenderRecyclerAdapter extends RecyclerView.Adapter<TenderViewHolder> {

    List<TenderModelDataForRecyclerView> tenderList = Collections.emptyList();
    Context context;
    View.OnClickListener clickListener;

    public TenderRecyclerAdapter(List<TenderModelDataForRecyclerView> tenderList,
                                 Context context,
                                 View.OnClickListener clickListener){
        this.tenderList = tenderList;
        this.context = context;
        this.clickListener = clickListener;

    }

    @NonNull
    @Override
    public TenderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View tenderView = inflater.inflate(R.layout.tender_recycler_view_card,parent,false);
        TenderViewHolder tenderViewHolder = new TenderViewHolder(tenderView);

        return tenderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final TenderViewHolder tenderViewHolder,final int position) {

        final int indexx = tenderViewHolder.getBindingAdapterPosition();

        tenderViewHolder.tenderName.setText(tenderList.get(position).tenderName);
        tenderViewHolder.tenderType.setText(tenderList.get(position).tenderType);

        tenderViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onClick(tenderViewHolder.itemView);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tenderList.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {

        super.onAttachedToRecyclerView(recyclerView);
    }
}
