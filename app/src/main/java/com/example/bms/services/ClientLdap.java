package com.example.bms.services;

import com.example.bms.model.AccessTokenLdap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ClientLdap {

    @FormUrlEncoded
    @POST("api")
    Call<ResponseBody> UserLdapClient(
            @Field("username") String username,
            @Field("password") String password
    );

    @POST("token")
    @FormUrlEncoded
    Call<AccessTokenLdap> getAccessTokenLdap(
            @Header("Authorization") String authToken
    );
}