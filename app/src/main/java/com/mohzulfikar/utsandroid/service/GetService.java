package com.mohzulfikar.utsandroid.service;

import com.mohzulfikar.utsandroid.model.User;
import com.mohzulfikar.utsandroid.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}
