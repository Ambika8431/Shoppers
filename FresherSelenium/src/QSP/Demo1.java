package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void test1() throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.youtube.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("KGF Trailor");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='channel-info']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='segmented-like-button']")).click();
			Thread.sleep(2000);
		}
}
	