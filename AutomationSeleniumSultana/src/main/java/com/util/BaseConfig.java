package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
	
	public static String  getConfigValue(String value) {
		File file= new File("./config.properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
		
			e1.printStackTrace();
		}
		Properties pro= new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return pro.getProperty(value);
		
		
	}
	
			
		
	}	
		
	
	


