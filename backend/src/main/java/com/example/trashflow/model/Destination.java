package com.example.trashflow.model;

public class Destination {
    private String name;
    private double probability;
    private double lat;
    private double lng;

    public Destination() {
    }

    public Destination(String name, double probability, double lat, double lng) {
        this.name = name;
        this.probability = probability;
        this.lat = lat;
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}
