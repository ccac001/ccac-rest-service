package com.acholding.framework.restservice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan({"com.acholding.framework.restservice.controller", "com.acholding.framework.service.config"})
public class ControllerConfiguration {

}
