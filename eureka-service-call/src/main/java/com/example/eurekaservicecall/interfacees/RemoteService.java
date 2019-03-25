package com.example.eurekaservicecall.interfacees;

import com.example.eurekaservicecall.interfacees.impl.RemoteServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "anotherclient",fallback = RemoteServiceImpl.class)
public interface RemoteService {

    @GetMapping("/test2")
    String test2();
}