  package sep17;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import config.AppUtil1;

public class ThirdTestNGClass extends AppUtil1
{
	@Test
	public void branches() throws Throwable
	{
		driver.findElement(By.xpath("(//img)[5]")).click();
		Thread.sleep(3000);
	}

	@Test
	public void roles() throws Throwable
	{
		driver.findElement(By.xpath("(//img)[6]")).click();
		Thread.sleep(3000);
	}

	@Test
	public void users() throws Throwable
	{
		driver.findElement(By.xpath("(//img)[7]")).click();
		Thread.sleep(3000);
	}

	@Test
	public void employee() throws Throwable
	{
		driver.findElement(By.xpath("(//img)[8]")).click();
		Thread.sleep(3000);
	}


}
