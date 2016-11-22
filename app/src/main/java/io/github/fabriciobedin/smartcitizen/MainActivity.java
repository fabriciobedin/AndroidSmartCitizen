package io.github.fabriciobedin.smartcitizen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Call<List<Device>> call =  ControlLifeCycleApp.service.listAllDevices();

        call.enqueue(new Callback<List<Device>>(){

            @Override
            public void onResponse(Call<List<Device>> call, Response<List<Device>> response) {
                Log.e("RETROFIT", "sucesso");
                Log.e("RETROFIT", "sucesso " + response.body().size());
            }

            @Override
            public void onFailure(Call<List<Device>> call, Throwable t) {
                Log.e("RETROFIT", "falha " + t.getLocalizedMessage());
            }
        });
        //vai fazer de forma assincrona (sempre melhor usar essa)
        //call.execute(); forma sincrona


    }
}
