package com.example.lavisha.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrieveDataInterface {

    @GET("/ub-android-app/v1.9/services.php?act=gettournaments")
    Call<JSONResponse> getJSON();

    @GET("ub-android-app/v1.9/services.php/ub-android-app/v1.9/services.php?act=tournament_details")
    Call<MyResponse> gettournamentDetail(@Query("tournament_id") String id);
}
