package com.example.springbootzlk.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

  @Value("${spring.application.name}")
  private String name;

  @Value("${spring.application.age}")
  private String age;

  @RequestMapping("springboot")
  public String testSringBoot() {

    return "springboot user by zlk name:" + name + "age:" + age;
  }
}
