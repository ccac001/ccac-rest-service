package com.acholding.framework.service.config;

import com.acholding.framework.service.StorageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.acholding.framework.persistence.config"})
public class ServiceConfiguration {
  
  @Bean
  public StorageService storageService() {
    return new StorageService();
  }
}
