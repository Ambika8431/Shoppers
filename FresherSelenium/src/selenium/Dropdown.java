package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Dropdown.html");
		Thread.sleep(1000);
		WebElement drop_down = driver.findElement(By.xpath("//select[@id='city_dropdown']"));
		Select sel=new Select(drop_down);
		sel.selectByValue("C");
		Thread.sleep(1000);
		sel.selectByIndex(4);
		Thread.sleep(1000);
		sel.selectByVisibleText("Manglore");
	}
	
		
		

}
