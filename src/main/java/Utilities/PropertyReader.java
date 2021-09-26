package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


/**
 * 
 * @author Sachin SR
 * PropertyReader Class is used to read the file from config.properties
 *
 */
public class PropertyReader {
	
	FileInputStream file;
	 public static  Properties props;
	public PropertyReader() throws IOException
	{
		file = new FileInputStream(Constants.configFilePath);
		props = new Properties();
		props.load(file);
	}
	
	public static String getProperty(String key)
	{
	  return (String)props.get(key);
	}

}
