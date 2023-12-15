package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Whatsapp {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://web.whatsapp.com//anush");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Type a message']")).sendKeys(".");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-icon='send']")).click();
		Thread.sleep(1000);
		
	}
}
	