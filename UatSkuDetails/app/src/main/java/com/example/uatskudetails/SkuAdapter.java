package com.example.uatskudetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uatskudetails.Models.SkuDetailsResponse;

import java.util.Collections;
import java.util.List;

public class SkuAdapter extends RecyclerView.Adapter<SkuViewHolder> {

    List<SkuModelForRecyclerView> offerTermList; //= Collections.emptyList();
    Context context;
    View.OnClickListener clickListener;

    public SkuAdapter(List<SkuModelForRecyclerView> offerTermList, Context context, View.OnClickListener clickListener) {
        this.offerTermList = offerTermList;
        this.context = context;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public SkuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View skuView = inflater.inflate(R.layout.sku_recycler_view_card,parent,false);
        return new SkuViewHolder(skuView);
    }

    @Override
    public void onBindViewHolder(@NonNull SkuViewHolder skuViewHolder,final int position) {

        skuViewHolder.getAbsoluteAdapterPosition();

        skuViewHolder.dealIdTextView.setText(offerTermList.get(position).dealID);
        skuViewHolder.totalTermsTextView.setText(offerTermList.get(position).totalTerms);
        skuViewHolder.termStyleTextView.setText(offerTermList.get(position).termStyle);
        skuViewHolder.dealTypeTextView.setText(offerTermList.get(position).dealType);
        skuViewHolder.iTypeTextView.setText(offerTermList.get(position).iType);
        skuViewHolder.ttDealTextView.setText(offerTermList.get(position).ttDeal);
        skuViewHolder.iNumberTextView.setText(offerTermList.get(position).iNumber);
        skuViewHolder.conditionTypeTextView.setText(offerTermList.get(position).conditionType);
        skuViewHolder.countTextView.setText(offerTermList.get(position).count);
        skuViewHolder.amountTextView.setText(offerTermList.get(position).amount);
        skuViewHolder.quantityEnforceTextView.setText(offerTermList.get(position).quantityEnforce);
        skuViewHolder.subDiscountAvailableTextView.setText(offerTermList.get(position).subDiscountAvailable);
        skuViewHolder.rtTypeTextView.setText(offerTermList.get(position).rtType);
        skuViewHolder.rtValueTextView.setText(offerTermList.get(position).rtValue);
        skuViewHolder.meidTypeTextView.setText(offerTermList.get(position).meidType);
        skuViewHolder.meidValueTextView.setText(offerTermList.get(position).meidValue);
        skuViewHolder.dealDistributionTextView.setText(offerTermList.get(position).dealDistribution);
        skuViewHolder.offerProductCategoryIdTextView.setText(offerTermList.get(position).offerProductCategoryId);

//        skuViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                clickListener.onClick(skuViewHolder.view);
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return offerTermList.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
