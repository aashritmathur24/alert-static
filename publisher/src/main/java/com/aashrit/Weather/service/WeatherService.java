package com.aashrit.Weather.service;

import com.aashrit.Weather.model.Weather;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface WeatherService {
    Boolean addWeatherReadings(Weather weather) throws JsonProcessingException;
    List<Weather> getWeatherReadingsSorted();
}
