package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.org.amazonbase.BaseClass;

public class PropertiesClass extends BaseClass {
	public static String properties(String username) throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\pushk\\eclipse-workspace\\com.org.amazon\\PropertiesFile");
	    prop.load(fis);
	    return prop.getProperty(username);
	    
	   
	}
 public void takescreenshot() throws IOException {
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest=new File("C:\\Users\\pushk\\eclipse-workspace\\com.org.amazon\\Screenshots");
	 FileHandler.copy(src, dest);
	 
	 
	
 }
}
