package com.example.springbootzlk.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * 有时候属性太多了，一个个绑定到属性字段上太累，官方提倡绑定一个对象的bean
 */

@Setter
@Getter
@ConfigurationProperties(prefix = "spring.application")
public class BeanConfig {
  private String want1;
  private String want2;
  private String want3;
  private String want4;
}

