package com.aashrit.WeatherConsumer.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class WeatherAlert {

    @Id
    private String id;

    private String alert;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Weather weather;

    public WeatherAlert(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
