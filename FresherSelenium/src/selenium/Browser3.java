package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser3 {
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
		
		System.out.println(allwh.size());
		allwh.remove(p_id);
		System.out.println(allwh.size());
		for(String wh : allwh) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
	}
	}
}
