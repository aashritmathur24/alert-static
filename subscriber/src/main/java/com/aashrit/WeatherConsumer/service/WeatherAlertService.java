package com.aashrit.WeatherConsumer.service;

import com.aashrit.WeatherConsumer.model.WeatherAlert;

import java.util.List;

public interface WeatherAlertService {
    boolean addWeatherAlert(WeatherAlert weatherAlert);
    List<WeatherAlert> getAllAlerts();
}
