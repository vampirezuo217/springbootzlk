package com.example.springbootzlk.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "com.dudu")
@PropertySource("classpath:selfdefine.properties")
public class RandomConfigBean {

  private String secret;

  private int number;

  private long bignumber;

  private String uuid;

  private int numberlessthanten;

  private int numberinrange;

}
