package com.acholding.framework.restservice.controller;

import com.acholding.framework.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ApplicationController {
  
  @Autowired
  private StorageService storageService;
	
	@RequestMapping("/")
  public String index() {
      return "Greetings from Spring Boot!";
  }
  
  @RequestMapping("/addInfo")
  public String addInfo() throws IOException {
    this.storageService.persistInformation("Always new info!!");
	  
    return "Adding info!";
  }
}
