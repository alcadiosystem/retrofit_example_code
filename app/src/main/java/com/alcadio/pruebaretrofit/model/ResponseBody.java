package com.alcadio.pruebaretrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Esta es la clase principal de la que se va a transformar ej JSON en un Objeto java
 *
 * @see {http://www.jsonschema2pojo.org/} Convertir json a clase java
 */

public class ResponseBody {
    @SerializedName("count")
    @Expose
    public Integer count;
    @SerializedName("entries")
    @Expose
    public List<Entry> entries = null;


    @Override
    public String toString() {
        return "ResponseBody{" +
                "count=" + count +
                ", entries=" + entries +
                '}';
    }
}
