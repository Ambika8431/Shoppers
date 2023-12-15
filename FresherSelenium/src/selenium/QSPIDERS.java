package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class QSPIDERS {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.qspiders.com/courses");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0;i<1;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
		}
		
		WebElement ele = driver.findElement(By.xpath("(//span[.='Details'])[6]"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		Thread.sleep(1000);
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_T);
		r1.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) 
		{
			driver.switchTo().window(wh);
		}
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//p[@class='card-header-title has-text-persian'])[3]")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
	     File src =ts.getScreenshotAs(OutputType.FILE);
	     File dst = new File("D:\\acc passwords\\SELENIUM2\\screen.jpeg");
	     FileHandler.copy(src, dst);
	     Thread.sleep(2000);
	     
	      List<WebElement> ele3 = driver.findElements(By.xpath("//div[@class='content']"));
	     for (WebElement we : ele3) 
	     {
	    	 System.out.println(we.getText());
		 }
	     Thread.sleep(2000);
	     driver.close();
	}
}
