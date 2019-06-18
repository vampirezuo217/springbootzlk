package com.example.springbootzlk.controller;


import com.example.springbootzlk.config.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
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


  //传对象方式
  @Autowired BeanConfig beanConfig;

  @RequestMapping("springboot")
  public String testSringBoot() {
    System.out.println(beanConfig.getWant1());
    System.out.println(beanConfig.getWant2());
    System.out.println(beanConfig.getWant3());
    System.out.println(beanConfig.getWant4());
    return "springboot user by zlk name:" + name + "age:" + age;
  }
}
