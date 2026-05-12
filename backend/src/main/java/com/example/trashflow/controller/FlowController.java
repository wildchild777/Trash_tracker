package com.example.trashflow.controller;

import com.example.trashflow.model.FlowResponse;
import com.example.trashflow.service.FlowService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class FlowController {

    private final FlowService flowService;

    // Constructor-based dependency injection
    public FlowController(FlowService flowService) {
        this.flowService = flowService;
    }

    @GetMapping("/flow")
    public FlowResponse getFlow(@RequestParam double lat, @RequestParam double lng) {
        return flowService.getFlow(lat, lng);
    }
}
