package com.example.springbootzlk;

import com.example.springbootzlk.config.BeanConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({BeanConfig.class})
public class SpringbootzlkApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootzlkApplication.class, args);
  }

}
