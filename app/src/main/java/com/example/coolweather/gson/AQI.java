package com.example.coolweather.gson;

/**
 * Created by ZQY on 2017/8/3.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
