package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/ele.html");
		WebElement ele=driver.findElement(By.id("a1"));
		boolean b=ele.isSelected();
		if(b)
		{
			System.out.println("element selected");
		}
		else
		{
			System.out.println("element not selected");
		}
	}

}
