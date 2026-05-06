package com.example.trashflow.service;

import com.example.trashflow.model.Destination;
import com.example.trashflow.model.FlowResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class FlowService {

    public FlowResponse getFlow(double lat, double lng) {
        // Mock data as per requirements
        return new FlowResponse(
            "K-East",
            Arrays.asList(
                new Destination("Kanjurmarg", 0.7),
                new Destination("Deonar", 0.3)
            ),
            0.7
        );
    }
}
