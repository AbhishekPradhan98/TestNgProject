package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AppUtil 
{
	public static WebDriver driver;
	@BeforeMethod
	public static void setup() throws Throwable
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://calc.qedgetech.com/");
		Thread.sleep(5000);
		
		
	}
	@AfterMethod
	public static void traDown()
	{
		driver.close();
	}

}
