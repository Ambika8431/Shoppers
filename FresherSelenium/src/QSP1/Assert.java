package QSP1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Assert extends GenericScript1
{
	@Test
	public void validLogin()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ambikamk200@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("84gaNavi@46");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		org.testng.Assert.assertEquals(title,"Instagram");
		System.out.println("1");	
	}
}
