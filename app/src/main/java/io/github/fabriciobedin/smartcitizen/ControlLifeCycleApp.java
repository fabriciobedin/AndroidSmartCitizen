package io.github.fabriciobedin.smartcitizen;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fabricio on 25/10/2016.
 */

public class ControlLifeCycleApp extends Application {
    public static RetrofitServices service;

    @Override
    public void onCreate() {
        super.onCreate();

        Gson gson = new GsonBuilder().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.smartcitizen.me/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        service = retrofit.create(RetrofitServices.class);
    }
}
