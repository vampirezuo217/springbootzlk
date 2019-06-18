package com.example.springbootzlk.controller;


import com.example.springbootzlk.config.BeanConfig;
import com.example.springbootzlk.config.SelfDefineConifgBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {


  //自定义属性（1.属性、对象）
  @Value("${spring.application.name}")
  private String name;
  @Value("${spring.application.age}")
  private String age;
  //传对象方式
  @Autowired
  BeanConfig beanConfig;


  //参数间引用
  @Value("${spring.application.want}")
  private String wang ;

  //自定义配置文件
  @Autowired
  SelfDefineConifgBean selfDefineConifgBean;


  @RequestMapping("springboot")
  public String testSringBoot() {
    System.out.println(beanConfig.getWant1());
    System.out.println(beanConfig.getWant2());
    System.out.println(beanConfig.getWant3());
    System.out.println(beanConfig.getWant4());

    System.out.println(wang);

    System.out.println(selfDefineConifgBean.getZlk1());
    System.out.println(selfDefineConifgBean.getZlk2());
    System.out.println(selfDefineConifgBean.getZlk3());


    return "springboot user by zlk name:" + name + "age:" + age;
  }
}
