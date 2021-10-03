package com.aashrit.WeatherConsumer.repository;

import com.aashrit.WeatherConsumer.model.Wind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WindRepository extends JpaRepository<Wind, String> {
}
