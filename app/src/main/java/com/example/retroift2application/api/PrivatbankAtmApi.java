package com.example.retroift2application.api;

import com.example.retroift2application.pojo.AtmData;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Retrofit API
 */
public interface PrivatbankAtmApi {

    @GET
    Observable<AtmData> getAtmDataByCity(@Url String url);
}
