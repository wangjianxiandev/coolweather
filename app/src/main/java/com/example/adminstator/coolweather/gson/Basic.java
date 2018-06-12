package com.example.adminstator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Adminstator on 2018/6/11.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
