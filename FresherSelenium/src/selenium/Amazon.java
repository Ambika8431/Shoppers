package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Redmi mobiles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		//driver.close();
	}

}
