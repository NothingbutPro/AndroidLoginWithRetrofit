package com.inducesmile.androidloginwithretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("api/{email}/{password}")
    Call<Login> authenticate(@Path("mobile") String email, @Path("School_code") String sch , @Path("Password") String password);

    @POST("api/{email}/{password}")
    Call<Login> registration(@Path("email") String email, @Path("password") String password);
}
