package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtil 
{
	public static void getValueForKey(String key) throws IOException, IOException
	{
		Properties configProp = new Properties();
		configProp.load(new FileInputStream(new File(".ConfigFile/Environment.properties.")));
		configProp.getProperty(key);
	}

}
