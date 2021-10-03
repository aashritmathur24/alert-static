package com.aashrit.WeatherConsumer.repository;

import com.aashrit.WeatherConsumer.model.WeatherAlert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherAlertRepository extends JpaRepository<WeatherAlert, String> {
}
