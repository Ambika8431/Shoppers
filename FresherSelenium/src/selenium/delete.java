package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class delete {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/DELL/Desktop/Web.html");
		Thread.sleep(2000);
		WebElement ele5 = driver.findElement(By.xpath("//input[@value='selenium']"));
		ele5.sendKeys(Keys.CONTROL+"a");
		ele5.sendKeys(Keys.DELETE);
		
				
	}
}
