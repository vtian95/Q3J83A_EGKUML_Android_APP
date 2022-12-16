package com.example.beadando_mobil_02;

import androidx.fragment.app.Fragment;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TenorClient {

    //..../random?key=alma
    @GET("random")
    Call<TenorResponse> getRandom(@Query("key")String key);

    @GET("trending")
    Call <TenorResponse >getTrending(@Query("key")String key);


    //...../search?tag=patrick+star&key=alma
    @GET("search")
    Call <TenorResponse> getSearchByTag(@Query("tag") String tag, @Query("key")String key);
}
