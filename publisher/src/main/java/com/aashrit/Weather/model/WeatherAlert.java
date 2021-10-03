package com.aashrit.Weather.model;

import lombok.Data;

@Data
public class WeatherAlert {

    private String alert;
    private Weather weather;

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public WeatherAlert(String alert, Weather weather) {
        this.alert = alert;
        this.weather = weather;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
