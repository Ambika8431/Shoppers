package QSP1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerScript1 extends GenericScript1
{
	@Test
	public void validLogin1()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ambikamk200@gmail.com");
	}
	
	@Test
	public void validLogin2()
	{
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("84gaNavi@46");
	}
	
	@Test
	public void validLogin3()
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}
	
//	@Test
//	public void validLogin4()
//	{
//		driver.findElement(By.xpath("//button[.='Save info']")).click();	
//	}
//	
//	@Test
//	public void validLogin5()
//	{
//		driver.findElement(By.xpath("//button[.='Not Now']")).click();
//	}
}
