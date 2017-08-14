package pl.lukaszkolacz.weathernow.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Lukasz Kolacz on 14.08.2017.
 */

public class Clouds {
    @SerializedName("all")
    @Expose
    public Long all;
}
