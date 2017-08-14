package pl.lukaszkolacz.weathernow.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Lukasz Kolacz on 14.08.2017.
 */

public class Coord {
    @SerializedName("lon")
    @Expose
    public Double lon;
    @SerializedName("lat")
    @Expose
    public Double lat;
}
