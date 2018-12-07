package com.acholding.framework.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;

import java.io.*;

public class StorageManager {
  
  @Autowired
  private File file;
  
  public void saveInformation(String info) throws IOException{
    if (!this.file.exists()) {
      this.file.createNewFile();
    }
    
    BufferedWriter bufWriter = new BufferedWriter(new FileWriter(this.file, true));
    PrintWriter printWriter = new PrintWriter(bufWriter);
  
    printWriter.println(info);
    printWriter.close();
  }
}
