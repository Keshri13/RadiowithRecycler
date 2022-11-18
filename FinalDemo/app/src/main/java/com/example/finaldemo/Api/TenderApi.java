package com.example.finaldemo.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class TenderApi {

    private static Retrofit retrofit = null;
    public static TenderApiInterface getClientTender() {

        // change our base URL as per our requirements
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://shoppersstopuatapi.cravrr.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        //Creating object for our interface
        TenderApiInterface tenderApi = retrofit.create(TenderApiInterface.class);

        // return the APIInterface object
        return  tenderApi;

    }

}