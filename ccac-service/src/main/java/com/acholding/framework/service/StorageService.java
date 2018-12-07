package com.acholding.framework.service;

import com.acholding.framework.persistence.StorageManager;
import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class StorageService {
  
  @Autowired
  private ApplicationInfoManager applicationInfoManager;
  
  @Autowired
  private StorageManager storageManager;
  
  public void persistInformation(String info) throws IOException {
    InstanceInfo appInfo = applicationInfoManager.getInfo();
    
    this.storageManager.saveInformation("Host: " + appInfo.getHostName()
            + " / IP-address: " + appInfo.getIPAddr()
            + " / InstanceId: " + appInfo.getInstanceId()
            + " / Message: " + info);
  }
}
