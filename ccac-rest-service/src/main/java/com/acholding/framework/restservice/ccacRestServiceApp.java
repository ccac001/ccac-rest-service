package com.acholding.framework.restservice;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.acholding.framework.restservice.config"})
@EnableAutoConfiguration
public class ccacRestServiceApp implements ApplicationContextAware {
	
	private static ApplicationContext context;
	
	public static void main(String[] args) {
        SpringApplication.run(ccacRestServiceApp.class, args);
        
        showBeansContext();
    }

	//Implements
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = arg0;
	}
	
	private static void showBeansContext() {
		String[] beans = context.getBeanDefinitionNames();
		for(String bean : beans){
			System.out.println("BEAN: "+ bean);
		}
	}
}
