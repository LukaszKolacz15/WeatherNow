package pl.lukaszkolacz.weathernow.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Lukasz Kolacz on 14.08.2017.
 */

public class Sys {
    @SerializedName("type")
    @Expose
    public Long type;
    @SerializedName("id")
    @Expose
    public Long id;
    @SerializedName("message")
    @Expose
    public Double message;
    @SerializedName("country")
    @Expose
    public String country;
    @SerializedName("sunrise")
    @Expose
    public Long sunrise;
    @SerializedName("sunset")
    @Expose
    public Long sunset;
}
