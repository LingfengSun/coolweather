package com.landy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class NOW {
    @SerializedName("tmp")
    public String temperature;
    //体感温度
    public String fl;
    //天气状况
    public String cond_txt;

}
