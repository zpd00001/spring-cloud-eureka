package com.example.eurekaanotherclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/test2")
    public String testanother(){
        return discoveryClient.getServices().toString();
    }
}
