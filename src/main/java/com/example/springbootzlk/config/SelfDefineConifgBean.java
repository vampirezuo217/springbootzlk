package com.example.springbootzlk.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "com.test")
@PropertySource("classpath:selfdefine.properties")
public class SelfDefineConifgBean {

  private String zlk1;
  private String zlk2;
  private String zlk3;
}
