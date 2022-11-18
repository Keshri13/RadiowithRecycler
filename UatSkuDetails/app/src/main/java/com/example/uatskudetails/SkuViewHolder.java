package com.example.uatskudetails;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SkuViewHolder extends  RecyclerView.ViewHolder{


    public TextView dealIdTextView,
            totalTermsTextView,
            termStyleTextView,
            dealTypeTextView,
            iTypeTextView,
            ttDealTextView,
            iNumberTextView,
            conditionTypeTextView,
            countTextView,
            amountTextView,
            quantityEnforceTextView,
            subDiscountAvailableTextView,
            rtTypeTextView,
            rtValueTextView,
            meidTypeTextView,
            meidValueTextView,
            dealDistributionTextView,
            offerProductCategoryIdTextView;

    View view;

    public SkuViewHolder(@NonNull View itemView) {
        super(itemView);

        dealIdTextView = itemView.findViewById(R.id.dealIdTextView);
        totalTermsTextView = itemView.findViewById(R.id.totalTermsTextView);
        termStyleTextView = itemView.findViewById(R.id.termStyleTextView);
        dealTypeTextView = itemView.findViewById(R.id.dealTypeTextView);
        iTypeTextView = itemView.findViewById(R.id.iTypeTextView);
        ttDealTextView = itemView.findViewById(R.id.ttDealTextView);
        iNumberTextView = itemView.findViewById(R.id.iNumberTextView);
        conditionTypeTextView = itemView.findViewById(R.id.conditionTypeTextView);
        countTextView = itemView.findViewById(R.id.countTextView);
        amountTextView = itemView.findViewById(R.id.amountTextView);
        quantityEnforceTextView = itemView.findViewById(R.id.quantityEnforceTextView);
        subDiscountAvailableTextView = itemView.findViewById(R.id.subDiscountAvailableTextView);
        rtTypeTextView = itemView.findViewById(R.id.rtTypeTextView);
        rtValueTextView = itemView.findViewById(R.id.rtValueTextView);
        meidTypeTextView = itemView.findViewById(R.id.meidTypeTextView);
        meidValueTextView = itemView.findViewById(R.id.meidValueTextView);
        dealDistributionTextView = itemView.findViewById(R.id.dealDistributionTextView);
        offerProductCategoryIdTextView = itemView.findViewById(R.id.offerProductCategoryIdTextView);


        view = itemView;
    }
}
