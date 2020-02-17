package com.biswanath.restdemo.data;

import com.biswanath.restdemo.model.Photo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/photos")
    Call<List<Photo>> getAllPhotos();
}
