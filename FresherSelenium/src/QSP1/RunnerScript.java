package QSP1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerScript extends GenericScript
{
	@Test
	public void validLogin()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
	}
	
	@Test
	public void validLogin1()
	{
		driver.findElement(By.id("pass")).sendKeys("admin");
	}
	
	@Test
	public void validLogin2()
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
