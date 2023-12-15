package selenium;

import java.util.Set;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser4 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		String p_id=driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh : allwh) {
			driver.switchTo().window(wh);
			String title=driver.getTitle();
			Thread.sleep(4000);
			if(title.equals("About me - qavalidation"))
					{
				driver.close();
			}		
		}
	}
}  