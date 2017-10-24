package com.prl.utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

	public static Properties getPropValues(String filename) {
		Properties prop = new Properties();
		try	{
	
			InputStream is = ReadProperties.class.getClassLoader().getResourceAsStream(filename);
			prop.load(is);
			
		} catch(IOException io )	{
			
		}
		return prop;
	}
}
