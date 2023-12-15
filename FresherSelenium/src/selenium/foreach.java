package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class foreach {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Desktop/for.html");
		Thread.sleep(2000);
		 List<WebElement> check = driver.findElements(By.xpath("//input"));
		int count=check.size();
		System.out.println(count);
		for(   WebElement we:check)
		{
			we.click();		}
	}
}
	
		
