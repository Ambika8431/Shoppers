package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class select {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Dropdown.html");
		Thread.sleep(1000);
		WebElement drop_down = driver.findElement(By.xpath("//select[@id='city_dropdown']"));
		Select sel=new Select(drop_down);
		if(sel.isMultiple())
		{
			System.out.println("Multi select");
		}
		else
		{
			System.out.println("Single select");
		}
	}
}
