package com.example.uatskudetails;

import com.example.uatskudetails.Models.SkuDetailsResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface SkuApiInterface {

    @FormUrlEncoded // annotation used in POST type requests
    @POST("api/get-item-details") // API's endpoints

    Call<SkuDetailsResponse> getSkuDetails(@Field("CustLoyalityNo") String CustLoyalityNo,
                                          @Field("tier") String tier,
                                          @Field("process") String process,
                                          @Field("StoreCode") String StoreCode,
                                          @Field("UpcCode") String UpcCode);

    // In registration method @Field used to set the keys and String data type is representing its a string type value
    // and callback is used to get the response from api and it will set it in our POJO class
}
