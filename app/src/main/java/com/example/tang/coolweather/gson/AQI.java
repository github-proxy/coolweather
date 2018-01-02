package com.example.tang.coolweather.gson;

/**
 * Created by tang on 2018/1/2.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
