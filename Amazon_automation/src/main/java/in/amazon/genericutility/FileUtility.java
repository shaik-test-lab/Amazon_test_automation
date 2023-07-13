package in.amazon.genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	
	public String read_data_signup_prop(String key) throws Throwable{
		FileInputStream signup = new FileInputStream("./src/test/resources/signup.properties");
		Properties pobj = new Properties();
		pobj.load(signup);
		String value = pobj.getProperty(key);  
		return value; 
	}
}
