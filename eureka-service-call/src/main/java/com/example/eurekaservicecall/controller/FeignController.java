package com.example.eurekaservicecall.controller;

import com.example.eurekaservicecall.interfacees.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private RemoteService remoteService;

    @GetMapping("/feign")
    public String test(){
        return remoteService.test2();
    }
}
