package com.alcadio.pruebaretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.alcadio.pruebaretrofit.model.Entry;
import com.alcadio.pruebaretrofit.model.ResponseBody;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Button btnBotoncito;

    private MyRetrofitData service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creamos el objeto de retrofit para usar mas tarde
        service =MyRetrofitData.retrofit.create(MyRetrofitData.class);

        btnBotoncito = findViewById(R.id.btnBotoncito);

        btnBotoncito.setOnClickListener(retro -> {onResult();});
    }

    private void onResult() {
        Call<ResponseBody> call = service.getApiPrueba("jobs");
        Log.d("TAG", call.request().url() + "");
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.d("TAG", response.body().count+"");
                for (Entry e : response.body().entries) {
                    Log.d("TAG", e.toString());
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d("TAG", t.getMessage());
            }
        });
    }
}