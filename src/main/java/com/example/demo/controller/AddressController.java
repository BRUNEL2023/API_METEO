package com.example.demo.controller;

import com.example.demo.model.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherController {

    private final String METEO_API_URL = "https://api.meteoconcept.com/forecast/daily";
    private final String METEO_API_TOKEN = "cca9aac9fbbc8651cb4ddfa42d7da314c55c09941fad1d32b8cafa35b5f52c8b"; // Remplacez par votre clé API

    @PostMapping("/meteo")
    public String handleAddressSubmission(@RequestParam("address") String address, Model model) {
        String etalabApiUrl = "https://api-adresse.data.gouv.fr/search/?q=" + address;

        try {
            RestTemplate restTemplate = new RestTemplate();
            // Appel à l'API Etalab pour obtenir les coordonnées GPS
            ApiResponse etalabResponse = restTemplate.getForObject(etalabApiUrl, ApiResponse.class);

            if (etalabResponse != null && !etalabResponse.getFeatures().isEmpty()) {
                // Récupération des coordonnées GPS
                ApiResponse.Feature.Geometry geometry = etalabResponse.getFeatures().get(0).getGeometry();
                double lat = geometry.getCoordinates().get(1);
                double lon = geometry.getCoordinates().get(0);

                // Appel à l'API MeteoConcept pour obtenir les prévisions météo
                String meteoUrl = METEO_API_URL + "?token=" + METEO_API_TOKEN + "&lat=" + lat + "&lon=" + lon;
                WeatherResponse weatherResponse = restTemplate.getForObject(meteoUrl, WeatherResponse.class);

                if (weatherResponse != null && weatherResponse.getForecast() != null) {
                    model.addAttribute("submittedAddress", etalabResponse.getFeatures().get(0).getProperties().getLabel());
                    model.addAttribute("weatherInfo", weatherResponse.getForecast());
                } else {
                    model.addAttribute("weatherInfo", "Aucune donnée météo disponible.");
                }
            } else {
                model.addAttribute("weatherInfo", "Adresse introuvable.");
            }
        } catch (Exception e) {
            model.addAttribute("error", "Erreur lors de l'appel API : " + e.getMessage());
        }

        return "weatherResult";
    }
}
