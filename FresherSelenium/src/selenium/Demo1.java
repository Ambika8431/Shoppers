package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/user/youtube/videos");
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("bellada cha");
		driver.findElement(By.name("input")).click();
		Thread.sleep(2000);
		driver.close();
			
	}

}
