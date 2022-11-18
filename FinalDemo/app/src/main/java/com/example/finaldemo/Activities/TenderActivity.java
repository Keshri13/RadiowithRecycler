package com.example.finaldemo.Activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finaldemo.Adapters.TenderRecyclerAdapter;
import com.example.finaldemo.Api.TenderApi;
import com.example.finaldemo.Models.Dataset;
import com.example.finaldemo.Models.Datum;
import com.example.finaldemo.Models.TenderModelDataForRecyclerView;
import com.example.finaldemo.Models.TenderResponse;
import com.example.finaldemo.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TenderActivity extends AppCompatActivity {

    TenderResponse tenderResponseData;
    TenderRecyclerAdapter tenderRecyclerAdapter;
    RecyclerView recyclerView;
    View.OnClickListener clickListener;
    //TextView textView;

    List<TenderModelDataForRecyclerView> tenderList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tender);
        //textView = findViewById(R.id.textView3);


        //textView.setText(tenderResponseData.getData().get(0).getDataset().get(0).getSdides());
        testTenderWorking();

        recyclerView = findViewById(R.id.recyclerView);
        clickListener = view -> Toast.makeText(TenderActivity.this,"Clicked item Index is " + view.getVerticalScrollbarPosition(),Toast.LENGTH_LONG);



    }

    public void recyclerViewChalao(){
        //
        tenderRecyclerAdapter = new TenderRecyclerAdapter(tenderList,getApplicationContext(),clickListener);
        recyclerView.setAdapter(tenderRecyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(TenderActivity.this));
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private List<TenderModelDataForRecyclerView> getData() {
        List<TenderModelDataForRecyclerView> tList = new ArrayList<>();

        for(Datum eachData : tenderResponseData.getData()){
            for (Dataset eachDataSet : eachData.getDataset()){
                tList.add(new TenderModelDataForRecyclerView("Tender Name : " + eachDataSet.getSdides(),"Tender Type : " + eachDataSet.getTndtyp()));
            }

        }

        return tList;
    }

    private void testTenderWorking(){
        String storeCode = "101";
        tenderApiCall(storeCode);

    }

    private void tenderApiCall(String storeCode){

        (TenderApi.getClientTender().fetchTenderDetails(storeCode)).enqueue(new Callback<TenderResponse>() {
            @Override
            public void onResponse(Call<TenderResponse> call, Response<TenderResponse> response) {

                if (!response.isSuccessful()) {
                    Log.d("tenderTag: ", String.valueOf(response.code()));
                    Toast.makeText(TenderActivity.this,"Invalid StoreDetails !",Toast.LENGTH_LONG).show();
                    return;
                }

                tenderResponseData = response.body();
                tenderList = getData();
                recyclerViewChalao();
                //tenderResponseData.getData().get(0).getDataset().get(0).getSdides();
                Log.d("tenderTag",tenderResponseData.getData().get(0).getDataset().get(0).getSdides());

                //textView.setText(tenderResponseData.getData().get(0).getDataset().get(0).getSdides());

                //progressDialog.dismiss();
                Toast.makeText(TenderActivity.this,String.valueOf(tenderResponseData.getMessage()),Toast.LENGTH_LONG).show();

            }

            @Override
            public void onFailure(Call<TenderResponse> call, Throwable t) {

                Log.d("tenderTag", Arrays.toString(t.getStackTrace()));
                Log.d("tenderTag",call.toString());
                Log.d("tenderTag",t.toString());

            }
        });

    }
}