package com.aashrit.Weather.service.implementation;

import com.aashrit.Weather.awsMessaging.WeatherAlertSNS;
import com.aashrit.Weather.model.Weather;
import com.aashrit.Weather.model.WeatherAlert;
import com.aashrit.Weather.service.WeatherService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Comparator;
import java.util.List;

@Service
public class DefaultWeatherService implements WeatherService {

//    private WeatherRepository weatherRepository;

    private RestTemplate restTemplate;

    private WeatherAlertSNS weatherAlertSNS;

    private ObjectMapper objectMapper;

    @Autowired
    public DefaultWeatherService(RestTemplate restTemplate, WeatherAlertSNS weatherAlertSNS, ObjectMapper objectMapper){
//       this.weatherRepository = weatherRepository;
        this.restTemplate = restTemplate;
        this.weatherAlertSNS = weatherAlertSNS;
        this.objectMapper = objectMapper;
    }

    @Override
    public Boolean addWeatherReadings(Weather weather) throws JsonProcessingException {
        System.out.println(weather);
//        weatherRepository.save(weather);
        if(weather.getTemperature() > 35){
            WeatherAlert weatherAlert = new WeatherAlert("Too Hot", weather);
//            return restTemplate.postForObject("http://localhost:8081/addReading", weatherAlert, boolean.class);
            String message = objectMapper.writeValueAsString(weatherAlert);
            weatherAlertSNS.send("Temperature Alert", message);
        }
        if(weather.getWind().getSpeed() > 10){
            WeatherAlert weatherAlert = new WeatherAlert("Too Windy", weather);
//            return restTemplate.postForObject("http://localhost:8081/addReading", weatherAlert, boolean.class);
            String message = objectMapper.writeValueAsString(weatherAlert);
            weatherAlertSNS.send("Wind Alert", message);
        }
        return true;
    }

    @Override
    public List<Weather> getWeatherReadingsSorted() {
//        List<Weather> weatherList = weatherRepository.findAll();
//        weatherList.sort(Comparator.comparing(Weather::getTimestamp));
        return null;
    }
}
