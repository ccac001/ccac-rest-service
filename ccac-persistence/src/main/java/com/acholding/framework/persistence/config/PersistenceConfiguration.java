package com.acholding.framework.persistence.config;

import com.acholding.framework.persistence.StorageManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import java.io.File;

@Configuration
public class PersistenceConfiguration {
  
  @Bean
  public File file(){
    return new File("/var/storage.txt");
  }
  
  @Bean
  public StorageManager storageManager() {
    return new StorageManager();
  }
}
