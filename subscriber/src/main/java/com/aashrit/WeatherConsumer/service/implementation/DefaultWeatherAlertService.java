package com.aashrit.WeatherConsumer.service.implementation;

import com.aashrit.WeatherConsumer.model.WeatherAlert;
import com.aashrit.WeatherConsumer.repository.WeatherAlertRepository;
import com.aashrit.WeatherConsumer.service.WeatherAlertService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultWeatherAlertService implements WeatherAlertService {

    private WeatherAlertRepository weatherAlertRepository;

    public DefaultWeatherAlertService(WeatherAlertRepository weatherAlertRepository){
        this.weatherAlertRepository = weatherAlertRepository;
    }

    @Override
    public boolean addWeatherAlert(WeatherAlert weatherAlert) {
        weatherAlertRepository.save(weatherAlert);
        return true;
    }

    @Override
    public List<WeatherAlert> getAllAlerts() {
        List<WeatherAlert> weatherAlerts = weatherAlertRepository.findAll();
        return weatherAlerts;
    }
}
