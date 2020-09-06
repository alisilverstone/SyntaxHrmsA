package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

	static Properties prop;
	
	public static void readProperties(String filePath) {

		try {
			FileInputStream fis = new FileInputStream(filePath);

		 prop = new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	public static String  getPropValue(String key) {
		return prop.getProperty(key);
		
		
	}
	
	
	
	
}
