package GeneralUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties
{
	static FileInputStream myFile;
	static Properties myProp ;
	public static String readValue(String myKey)
	{
		try {
			myFile = new FileInputStream("TestData/config.properties");
			myProp = new Properties();
			myProp.load(myFile);
		} catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Properties file not found,may be filepath is wrong");
		}
		String myproperties = myProp.getProperty(myKey);
		return myproperties;
	}
}

