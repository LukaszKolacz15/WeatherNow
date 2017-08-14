package pl.lukaszkolacz.weathernow;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Lukasz Kolacz on 14.08.2017.
 */

public class WeatherNowApp extends Application {
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/";
    public static final String API_KEY = "9b9179927dea31b2c186367fcb4b3025";

    Retrofit retrofit;
    public static WeatherApi weatherApi;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        weatherApi = retrofit.create(WeatherApi.class);
    }
}
