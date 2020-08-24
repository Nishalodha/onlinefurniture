package com.wayfair.customeuties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
	public static Properties pro = new Properties();

	public static String getLocator(String locatername) throws FileNotFoundException {
		String values = "";
		String basepath = System.getProperty("user.dir");
		FileInputStream fin = new FileInputStream(basepath + "src\\main\\resources\\ObjectRepository.properties");
		try {
			pro.load(fin);
			values = (String) pro.get(locatername);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return values;

	}

}
