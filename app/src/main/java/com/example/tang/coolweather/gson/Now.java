package com.example.tang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tang on 2018/1/2.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
