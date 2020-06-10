package com.example.bigohealthinternshiptask;

import com.example.bigohealthinternshiptask.dataclass.ForDoctors;
import com.example.bigohealthinternshiptask.dataclass.PatId;
import com.example.bigohealthinternshiptask.dataclass.Response;
import com.example.bigohealthinternshiptask.dataclass.ResponseForPat;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiClientService {

    @POST("https://bigobackend.herokuapp.com/doctors")
    Call<Response> getData(@Body ForDoctors forDoctors);


    @POST("https://bigobackend.herokuapp.com/patientAppt")
    Call<ResponseForPat> getData(@Body PatId patId);



    @POST("https://bigobackend.herokuapp.com/doctors")
    Call<Response> getAllCityList();

}
