package com.example.newsreaderapp.network;

import com.example.newsreaderapp.models.TopHeadlinesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiList {
    @GET("top-headlines?apiKey=1c0136b9c55641e5a28546c1a97226e1")
    Call<TopHeadlinesResponse> topHeadlines(@Query("country") String country);
}
