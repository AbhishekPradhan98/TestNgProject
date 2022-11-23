package sep17;
 
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtil;

public class SecondTestNG extends AppUtil
{
	@Test(priority=2,enabled=true)
	public void addition() throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("76543");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
		driver.findElement(By.name("display")).sendKeys("984");
	
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Thread.sleep(1000);
		String adress=driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(adress,true);
		
	}
	@Test(priority=1,enabled=true)
	public void division() throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("45454");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
		driver.findElement(By.name("display")).sendKeys("87");
	
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Thread.sleep(1000);
		String divress=driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(divress,true);
		
	
	

}
	@Test(priority=0,enabled=true)
	public void multiplication() throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("4546445");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
		driver.findElement(By.name("display")).sendKeys("547");
	
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Thread.sleep(1000);
		String mulress=driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(mulress,true);
		
}
}