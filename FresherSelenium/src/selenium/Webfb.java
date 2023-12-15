package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webfb {	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
		ele.sendKeys(Keys.ENTER+"ambika@gmil.com");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='email']"));
		ele1.sendKeys(Keys.ALT+"tab");
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='pass']"));
		ele1.sendKeys(Keys.ENTER+"amk@12");
	}

}
