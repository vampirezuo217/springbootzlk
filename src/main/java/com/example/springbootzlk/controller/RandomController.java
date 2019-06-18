package com.example.springbootzlk.controller;

import com.example.springbootzlk.config.RandomConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/ramdom
 */
@RestController
@RequestMapping("/")
public class RandomController {

  //随机值配置（自定义文件）
  @Autowired
  RandomConfigBean randomConfigBean;

  @RequestMapping("ramdom")
  public  void test (){
    System.out.println(randomConfigBean.getSecret());
    System.out.println(randomConfigBean.getNumber());
    System.out.println(randomConfigBean.getBignumber());
    System.out.println(randomConfigBean.getUuid());
    System.out.println(randomConfigBean.getNumberlessthanten());
    System.out.println(randomConfigBean.getNumberinrange());
  }
}
