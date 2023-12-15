package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/dragDrop?sublist=0");
		Thread.sleep(2000);
		WebElement src1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement src2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement dst1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement src3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement src4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement dst2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src1, dst1).perform();
		a.dragAndDrop(src2, dst1).perform();
		a.dragAndDrop(src3, dst1).perform();
		a.dragAndDrop(src4, dst1).perform();
		//driver.get("https://demoapps.qspiders.com/dragDrop?sublist=0");
		
		
	}
}
