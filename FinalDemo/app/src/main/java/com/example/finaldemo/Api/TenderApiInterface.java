package com.example.finaldemo.Api;

import com.example.finaldemo.Models.LoginResponse;
import com.example.finaldemo.Models.TenderResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface TenderApiInterface {

    @FormUrlEncoded // annotation used in POST type requests
    @POST("/getStoreTenders") // Tender API's endpoints

    Call<TenderResponse> fetchTenderDetails(@Field("StoreCode") String StoreCode);

    // In registration method @Field used to set the keys and String data type is representing its a string type value
    // and callback is used to get the response from api and it will set it in our POJO class
}