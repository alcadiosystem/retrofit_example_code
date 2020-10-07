package com.alcadio.pruebaretrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * En tu objeto de json muestra un array con varios objetos
 * Esta clase representa esos objetos en java
 */

public class Entry {

    @SerializedName("API")
    @Expose
    public String aPI;
    @SerializedName("Description")
    @Expose
    public String description;
    @SerializedName("Auth")
    @Expose
    public String auth;
    @SerializedName("HTTPS")
    @Expose
    public Boolean hTTPS;
    @SerializedName("Cors")
    @Expose
    public String cors;
    @SerializedName("Link")
    @Expose
    public String link;
    @SerializedName("Category")
    @Expose
    public String category;


    @Override
    public String toString() {
        return "Entry{" +
                "aPI='" + aPI + '\'' +
                ", description='" + description + '\'' +
                ", auth='" + auth + '\'' +
                ", hTTPS=" + hTTPS +
                ", cors='" + cors + '\'' +
                ", link='" + link + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
