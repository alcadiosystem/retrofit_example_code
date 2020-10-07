package com.alcadio.pruebaretrofit;

import com.alcadio.pruebaretrofit.model.ResponseBody;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * En esta interface lo que vamos a hacer es declar los metodos que va a utilizar el retrofit
 * Declaro en este punto el retrofit, por que es la mejor manera, ya que de esta forma nos permite
 * Tener todo ordenado
 */

public interface MyRetrofitData {

    /**
     * Separamos esto por que asi nos lo establece retrofit, este es un parametro de busqueda o indicativo
     * @param params Es lo que vamos a pasar por el lado de java en este caso {jobs}
     * @return
     */
    @GET("entries")
    Call<ResponseBody> getApiPrueba( @Query("category")  String params);

    //Objeto de retrofit que vamos a utilizar mas tarde
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Common.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
