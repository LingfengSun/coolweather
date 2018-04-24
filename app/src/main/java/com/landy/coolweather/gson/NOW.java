package com.landy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class NOW {
    @SerializedName("tmp")
    public String temperature;
    public More more;
    public class More {
        @SerializedName("txt")
        public String info;
    }
}
