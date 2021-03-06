package pl.lukaszkolacz.weathernow;

import pl.lukaszkolacz.weathernow.api.WeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Lukasz Kolacz on 14.08.2017.
 */

public interface WeatherApi {
//    @GET("weather") Call<WeatherResponse> getWeather(@Query("APPID") String appid, @Query("q") String location);
    @GET("weather") Call<WeatherResponse> getWeather(@Query("APPID") String appid, @Query("lat") Double lat, @Query("lon") Double lon);
}
