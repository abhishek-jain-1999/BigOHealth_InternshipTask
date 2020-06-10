package com.example.bigohealthinternshiptask;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {


    private static Retrofit retrofit;
    private static ApiClientService apiClientService;
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    private static Retrofit.Builder builder;

    public static Retrofit.Builder getRetrofit() {


        return builder;

    }

    public static ApiClientService getApiClientService(Context context) {
        if (retrofit == null) {
            builder = new Retrofit.Builder()
                    .baseUrl("https://bigobackend.herokuapp.com/")
                    .addConverterFactory(GsonConverterFactory.create());
        }
        if (apiClientService == null) {

            final String s= context.getSharedPreferences("shared",0).getString("token",null);


            if (!TextUtils.isEmpty(s)) {
                Interceptor interceptor = new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();
                        request = request.newBuilder()
                                .addHeader("X-XSRF-TOKEN", s)
                                .build();
                        Response response = chain.proceed(request);
                        return response;

                    }
                };
                if (!httpClient.interceptors().contains(interceptor)) {
                    httpClient.addInterceptor(interceptor);

                    builder.client(httpClient.build());
                    retrofit = builder.build();
                    apiClientService = retrofit.create(ApiClientService.class);
                }
            }
        }
        return apiClientService;

    }


}
