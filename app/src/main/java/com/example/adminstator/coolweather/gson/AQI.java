package com.example.adminstator.coolweather.gson;

/**
 * Created by Adminstator on 2018/6/11.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
