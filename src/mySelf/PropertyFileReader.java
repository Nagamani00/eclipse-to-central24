package mySelf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFileReader 
{
  static WebDriver driver;
	public static void main(String[] args) throws Throwable
	{
		FileInputStream file = new FileInputStream("C:\\testNGeclisepe\\eclipse\\eclipse\\Mani_gattu\\mySelf\\objectRepo\\configure.Properties");
		Properties properties = new Properties();
		properties.load(file);
		String s1 =properties.getProperty("browser");
		String s2 =properties.getProperty("url");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		if(s1.equals("chrome"))
		{
			driver = new ChromeDriver();
			
		}
		else if(s1.equals("edge"))
		{
			driver = new ChromeDriver();
			
		}
		else if (s1.equals("firefox"))
		{
			driver = new ChromeDriver();
			
		}
	}

}
