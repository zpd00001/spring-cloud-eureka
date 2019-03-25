package com.example.eurekaservicecall.interfacees.impl;

import com.example.eurekaservicecall.interfacees.RemoteService;
import org.springframework.stereotype.Component;

@Component
public class RemoteServiceImpl implements RemoteService {

    @Override
    public String test2() {
        return "服务降级";
    }
}
