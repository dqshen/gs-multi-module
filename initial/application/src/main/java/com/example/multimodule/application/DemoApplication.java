package com.example.multimodule.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.multimodule")
// @RestController
public class DemoApplication {

  // private final MyService myService;

  // public DemoApplication(MyService myService) {
  //   this.myService = myService;
  // }

  

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}