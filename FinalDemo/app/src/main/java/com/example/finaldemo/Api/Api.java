package com.example.finaldemo.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Api {

    private static Retrofit retrofit = null;
    public static ApiInterface getClient() {

        // change our base URL as per our requirements
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://shoppersstopuatapi.cravrr.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        //Creating object for our interface
        ApiInterface api = retrofit.create(ApiInterface.class);

        // return the APIInterface object
        return api;

    }

}