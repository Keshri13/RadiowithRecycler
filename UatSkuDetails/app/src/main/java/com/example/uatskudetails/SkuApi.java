package com.example.uatskudetails;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SkuApi {

    private static Retrofit retrofit = null;
    public static SkuApiInterface getClient() {

        // change our base URL as per our requirements
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://shoppersstopuatapi.cravrr.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        //Creating object for our interface
        SkuApiInterface skuApi = retrofit.create(SkuApiInterface.class);

        // return the APIInterface object
        return skuApi;

    }

}
