package io.github.fabriciobedin.smartcitizen;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by fabricio on 25/10/2016.
 */

public interface RetrofitServices {
    //interface
    //100% métodos constantes
    //100% metodos abstratos

    //url inteira =  https://api.smartcitizen.me/v0/devices

    @GET("v0/devices")
    Call<List<Device>> listAllDevices();
}
