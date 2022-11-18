package com.example.finaldemo.Api;

import com.example.finaldemo.Models.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded // annotation used in POST type requests
    @POST("/login") // API's endpoints

    Call<LoginResponse> registration(@Field("empno") String empno,
                                     @Field("password") String password,
                                     @Field("source") String source,
                                     @Field("DeviceId") String DeviceId);

    // In registration method @Field used to set the keys and String data type is representing its a string type value
    // and callback is used to get the response from api and it will set it in our POJO class
}