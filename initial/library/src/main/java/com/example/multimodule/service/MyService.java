package com.example.multimodule.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@EnableConfigurationProperties(value = ServiceProperties.class)
public class MyService {
    
    private final ServiceProperties serviceProperties;

    public MyService(ServiceProperties serviceProperties) {
      this.serviceProperties = serviceProperties;
    }
  
    public String message() {
      log.info("MyService.message fire");
      return this.serviceProperties.getMessage();
    }

}
