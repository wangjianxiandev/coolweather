package com.example.adminstator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Adminstator on 2018/6/11.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
