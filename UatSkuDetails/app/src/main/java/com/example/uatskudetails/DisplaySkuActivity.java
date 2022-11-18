package com.example.uatskudetails;

//import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.uatskudetails.Models.OfferTerm;
import com.example.uatskudetails.Models.SkuDetailsResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DisplaySkuActivity extends AppCompatActivity {


    SkuDetailsResponse skuDetailsResponseData;
    List<SkuModelForRecyclerView> skuModelList = new ArrayList<>();
    TextView totalOfferTermsTextView;
    String skuNumber;

    SkuAdapter skuAdapter;
    RecyclerView recyclerView;
    View.OnClickListener clickListener;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_sku);

        recyclerView = findViewById(R.id.skuRecyclerView);
        totalOfferTermsTextView = findViewById(R.id.totalTermsTextView);

        skuNumber = getIntent().getExtras().getString("skuNumber");
        implementApiCallForSku();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void implementRecyclerView(){
        if (skuModelList.size()==0) {
            runHandler();
        }
        else {
            skuAdapter = new SkuAdapter(skuModelList, getApplicationContext(), clickListener);
            recyclerView.setAdapter(skuAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(DisplaySkuActivity.this));
        }
    }

    public String validateAndConvertToString(Object obj){
        if (obj!=null){
            return obj.toString();
        }
        return "Null";
    }

    private List<SkuModelForRecyclerView> getOfferTermList(SkuDetailsResponse skuDetailsResponses){

        List<SkuModelForRecyclerView> skuModelForRecyclerViewList = new ArrayList<>();

        if (skuDetailsResponses.getData().getTotalOfferTerm() == 0){
            return skuModelForRecyclerViewList;
        }

        String dealID,
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


        totalTerms = skuDetailsResponses.getData().getTotalOfferTerm().toString();

        for(OfferTerm eachOfferTerm : skuDetailsResponses.getData().getOfferTerm()){
            dealID = eachOfferTerm.getDealId();
            termStyle = eachOfferTerm.getHeader().getTermStyle();
            dealType = eachOfferTerm.getHeader().getDealType();
            iType = eachOfferTerm.getItype();
            ttDeal = eachOfferTerm.getTtDeal().toString();
            iNumber = validateAndConvertToString(eachOfferTerm.getInumbr());
            conditionType = eachOfferTerm.getConditionType();
            count = eachOfferTerm.getCount().toString();
            amount = validateAndConvertToString(eachOfferTerm.getAmount());
            quantityEnforce = eachOfferTerm.getQuanEnforce();
            subDiscountAvailable = eachOfferTerm.getSubsdiscavailable().toString();
            rtType = eachOfferTerm.getRtypecode().toString();
            rtValue = eachOfferTerm.getRvalue().toString();
            meidType = validateAndConvertToString(eachOfferTerm.getMeidTypecode());
            meidValue = validateAndConvertToString(eachOfferTerm.getMeidValue());
            dealDistribution = eachOfferTerm.getHeader().getDealdist();
            offerProductCategoryId = eachOfferTerm.getOfferProductcategoryid();

            skuModelForRecyclerViewList.add(new SkuModelForRecyclerView(
                    "Deal Id :      " + dealID,
                    "Total Terms :      " + totalTerms,
                    "Term Style :       " + termStyle,
                    "Deal Type : " + dealType,
                    "I Type :       " + iType,
                    "TT Deal :      " + ttDeal,
                    "I Number :     " + iNumber,
                    "Condition Type :       " + conditionType,
                    "Count :        " + count,
                    "Amount :       " + amount,
                    "Quantity Enforce :     " + quantityEnforce,
                    "Sub Discount Available :       " + subDiscountAvailable,
                    "RT Type :      " + rtType,
                    "RT Value :     " + rtValue,
                    "MEID Type :        " + meidType,
                    "MEID Value :       " + meidValue,
                    "Deal Distribution :        " + dealDistribution,
                    "ProductCategoryId :    " + offerProductCategoryId));
        }
        return skuModelForRecyclerViewList;
    }

    public void implementApiCallForSku(){

        String customerLoyaltyNo = "2210980031870012";
        String tier = "4";
        String process = "UAT";
        String storeCode = "101";
        //String upcCode = "206432663";

        (SkuApi.getClient().getSkuDetails(customerLoyaltyNo,tier,process,storeCode,skuNumber)).enqueue(new Callback<SkuDetailsResponse>() {
            @Override
            public void onResponse(Call<SkuDetailsResponse> call, Response<SkuDetailsResponse> response) {

                if (!response.isSuccessful()) {
                    Log.d("skuApiTag: ", String.valueOf(response.code()));
                    Toast.makeText(DisplaySkuActivity.this,"Invalid Details !",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(DisplaySkuActivity.this,MainActivity.class);
                    startActivity(intent);
                    return;
                }

                totalOfferTermsTextView.setText("Total OfferTerms : " + response.body().getData().getTotalOfferTerm());
                Log.d("skuApiTag: ", String.valueOf(response.code()));
                Toast.makeText(DisplaySkuActivity.this,"Data Found !",Toast.LENGTH_SHORT).show();
                skuDetailsResponseData = response.body();

                skuModelList = getOfferTermList(skuDetailsResponseData);
                implementRecyclerView();
                //Toast.makeText(DisplaySkuActivity.this,"Recycler View Started!",Toast.LENGTH_SHORT).show();



            }

            @Override
            public void onFailure(Call<SkuDetailsResponse> call, Throwable t) {
                Log.d("skuApiTag: ", String.valueOf(t.getMessage()));
                Toast.makeText(DisplaySkuActivity.this,"Failed !",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(DisplaySkuActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void runHandler() {

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(DisplaySkuActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 3000);

    }
}


