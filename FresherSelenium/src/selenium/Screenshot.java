package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Dropdown.html");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
	     File src =ts.getScreenshotAs(OutputType.FILE);
	     File dst = new File("D:\\acc passwords\\Selenium\\act.jpeg");
	     FileHandler.copy(src, dst);
	}	

}
