package com.example.trashflow.model;

import java.util.List;

public class FlowResponse {
    private String ward;
    private List<Destination> destinations;
    private double confidence;

    public FlowResponse() {}

    public FlowResponse(String ward, List<Destination> destinations, double confidence) {
        this.ward = ward;
        this.destinations = destinations;
        this.confidence = confidence;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }
}
