package com.example.demo.controller;
//package com.example.demo.model;

//import package com.example.demo.model;

import java.util.List;

public class ApiResponse {
    private String type;
    private List<Feature> features;

    // Getters et setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    // Classe imbriquée pour représenter les fonctionnalités
    public static class Feature {
        private Geometry geometry;
        private Properties properties;

        // Getters et setters
        public Geometry getGeometry() {
            return geometry;
        }

        public void setGeometry(Geometry geometry) {
            this.geometry = geometry;
        }

        public Properties getProperties() {
            return properties;
        }

        public void setProperties(Properties properties) {
            this.properties = properties;
        }

        // Classe imbriquée pour la géométrie
        public static class Geometry {
            private String type;
            private List<Double> coordinates;

            // Getters et setters
            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<Double> getCoordinates() {
                return coordinates;
            }

            public void setCoordinates(List<Double> coordinates) {
                this.coordinates = coordinates;
            }
        }

        // Classe imbriquée pour les propriétés
        public static class Properties {
            private String label;
            private double score;
            private String id;
            private String type;

            // Getters et setters
            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public double getScore() {
                return score;
            }

            public void setScore(double score) {
                this.score = score;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
