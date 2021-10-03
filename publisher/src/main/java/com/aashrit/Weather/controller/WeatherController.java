package com.aashrit.Weather.controller;

import com.aashrit.Weather.model.Weather;
import com.aashrit.Weather.service.WeatherService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    @GetMapping(
            value = "/getWeather"
//            consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public String simpleGetMethod(){
        return "My Simple Get Method!" ;
    }

    @PostMapping("/addReading")
    public boolean addWeatherReading(@RequestBody Weather weather) throws JsonProcessingException {
        weatherService.addWeatherReadings(weather);
        return true;
    }

    @GetMapping("/sortedReadings")
    public List<Weather> getAllReadingsSorted(){
        return weatherService.getWeatherReadingsSorted();
    }
}
