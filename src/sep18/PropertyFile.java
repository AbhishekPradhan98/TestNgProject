package sep18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertyFile 
{
   WebDriver driver;
   Properties p;
   @BeforeTest
   public void setup() throws FileNotFoundException, IOException
   {
	   p=new Properties();
	   p.load(new FileInputStream("E:\\New folder\\TestNG_Framework\\Primus.properties"));
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(p.getProperty("url"));
   }
	
@Test
public void login()
{
	driver.findElement(By.xpath(p.getProperty("objuser"))).sendKeys(p.getProperty("username"));
	driver.findElement(By.xpath(p.getProperty("objpass"))).sendKeys(p.getProperty("password"));
	driver.findElement(By.xpath(p.getProperty("objlogin"))).click();
}
@AfterTest
public void tearDown()
{
	driver.quit();
}




}
