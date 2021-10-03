package com.aashrit.WeatherConsumer.repository;

import com.aashrit.WeatherConsumer.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, String> {
}
