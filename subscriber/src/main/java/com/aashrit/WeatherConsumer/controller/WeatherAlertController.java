package com.aashrit.WeatherConsumer.controller;

import com.aashrit.WeatherConsumer.model.WeatherAlert;
import com.aashrit.WeatherConsumer.service.WeatherAlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherAlertController {

    private WeatherAlertService weatherAlertService;

    @Autowired
    public WeatherAlertController(WeatherAlertService weatherAlertService){
        this.weatherAlertService = weatherAlertService;
    }

    @PostMapping("/addReading")
    public boolean addWeatherReading(@RequestBody WeatherAlert weatherAlert){
        weatherAlertService.addWeatherAlert(weatherAlert);
        return true;
    }
}
