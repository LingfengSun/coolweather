package com.landy.coolweather.gson;

import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public NOW now;
    public Suggestion suggestion;
    public List<Forecast> forecastList;
}
