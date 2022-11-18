package com.example.uatskudetails;

public class SkuModelForRecyclerView {
    public String dealID,
            totalTerms,
            termStyle,
            dealType,
            iType,
            ttDeal,
            iNumber,
            conditionType,
            count,
            amount,
            quantityEnforce,
            subDiscountAvailable,
            rtType,
            rtValue,
            meidType,
            meidValue,
            dealDistribution,
            offerProductCategoryId;

    public SkuModelForRecyclerView(String dealID,
                                   String totalTerms,
                                   String termStyle,
                                   String dealType,
                                   String iType,
                                   String ttDeal,
                                   String iNumber,
                                   String conditionType,
                                   String count,
                                   String amount,
                                   String quantityEnforce,
                                   String subDiscountAvailable,
                                   String rtType,
                                   String rtValue,
                                   String meidType,
                                   String meidValue,
                                   String dealDistribution,
                                   String offerProductCategoryId) {

        this.dealID = dealID;
        this.totalTerms = totalTerms;
        this.termStyle = termStyle;
        this.dealType = dealType;
        this.iType = iType;
        this.ttDeal = ttDeal;
        this.iNumber = iNumber;
        this.conditionType = conditionType;
        this.count = count;
        this.amount = amount;
        this.quantityEnforce = quantityEnforce;
        this.subDiscountAvailable = subDiscountAvailable;
        this.rtType = rtType;
        this.rtValue = rtValue;
        this.meidType = meidType;
        this.meidValue = meidValue;
        this.dealDistribution = dealDistribution;
        this.offerProductCategoryId = offerProductCategoryId;
    }
}
