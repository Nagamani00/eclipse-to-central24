package mySelf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch1 {

	public static void main(String[] args) 
	{
		System.setProperty("webDriver.chrome.driver", "C:\\testNGeclisepe\\eclipse\\eclipse\\Mani_gattu\\mySelf\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rbgtechnologies.com/");

	}

}
