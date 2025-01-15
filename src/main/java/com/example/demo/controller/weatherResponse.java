package com.example.demo.controller;

//package com.example.demo.model;

import java.util.List;

public class weatherResponse {
    private City city;
    private List<Forecast> forecast;

    // Getters et setters
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    // Classe imbriquée pour la ville
    public static class City {
        private String name;
        private String country;

        // Getters et setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }

    // Classe imbriquée pour les prévisions
    public static class Forecast {
        private String datetime;
        private int tmin;
        private int tmax;
        private String weather;

        // Getters et setters
        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public int getTmin() {
            return tmin;
        }

        public void setTmin(int tmin) {
            this.tmin = tmin;
        }

        public int getTmax() {
            return tmax;
        }

        public void setTmax(int tmax) {
            this.tmax = tmax;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }
    }
}
