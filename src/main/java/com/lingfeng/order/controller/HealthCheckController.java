package com.lingfeng.order.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
public class HealthCheckController {

    private String status = "UP";

    @GetMapping
    public String healthCheck() {
        return status;
    }

    @PostMapping("/set-status")
    public String setStatus(@RequestParam String status) {
        this.status = status;
        return "Status set to " + status;
    }
}