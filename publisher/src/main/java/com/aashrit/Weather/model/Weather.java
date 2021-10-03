package com.aashrit.Weather.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Weather {

    private String city;
    private String description;
    private double humidity;
    private double pressure;
    private double temperature;
    private Wind wind;
    private Timestamp timestamp;

//    public Weather(){
//        this.id = UUID.randomUUID().toString();
//    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}

//{
//        "city": "Chicago",
//        "description": "scattered clouds",
//        "humidity": 33,
//        "pressure": 1020,
//        "temperature": 25,
//        "wind": {
//        "speed": 3.1,
//        "degree": 240
//        },
//        "timestamp": "2017-02-14T05:48:41.861Z"
//}