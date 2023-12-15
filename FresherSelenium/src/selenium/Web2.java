package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
		boolean b=ele.isDisplayed();
		if(b)
		{
			System.out.println("element displayed");
		}
		else
		{
			System.out.println("element is not displayed");
		}
		
	}

}
