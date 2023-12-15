package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmaps {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps/@12.9989812,77.5504667,15z?entry=ttu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@dir='ltr']")).sendKeys("Banglore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']")).sendKeys("Manglore");
		Thread.sleep(2000);
		driver.close();
	    }
}
 