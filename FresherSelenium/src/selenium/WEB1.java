package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEB1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/DELL/Desktop/Web.html");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		Dimension d=new Dimension(200, 300);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p=new Point(200, 300);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@value='selenium']"));
		ele.sendKeys(Keys.CONTROL+"ax");
//		Thread.sleep(2000);
//		ele.sendKeys(Keys.DELETE);
//		WebElement ele1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		ele1.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		WebElement ele2 = driver.findElement(By.xpath("//input[@type='radio']"));
//		ele2.sendKeys(Keys.ENTER);
		
		
		
	}
	//WebElement ele = driver.findElement(By.xpath("//input[@value='selenium']"));
	//ele.sendKeys(Keys.CONTROL+"ax");

}
