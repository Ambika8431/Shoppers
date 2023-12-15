package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions6 {
	public static void main(String[] args)throws AWTException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Downloads']"));
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		Actions a1=new Actions(driver);
		a1.contextClick(ele1).perform();
		
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_T);
		r1.keyRelease(KeyEvent.VK_T);
		
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Projects']"));
		Actions a2=new Actions(driver);
		a2.contextClick(ele2).perform();
		//Thread.sleep(1000);
		Robot r2=new Robot();
		r2.keyPress(KeyEvent.VK_T);
		r2.keyRelease(KeyEvent.VK_T);

		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Support']"));
		Actions a3=new Actions(driver);
		a3.contextClick(ele3).perform();
		//Thread.sleep(1000);
		Robot r3=new Robot();
		r3.keyPress(KeyEvent.VK_T);
		r3.keyRelease(KeyEvent.VK_T);
		
		WebElement ele4 = driver.findElement(By.xpath("//span[text()='Blog']"));
		Actions a4=new Actions(driver);
		a4.contextClick(ele4).perform();
		//Thread.sleep(1000);
		Robot r4=new Robot();
		r4.keyPress(KeyEvent.VK_T);
		r4.keyRelease(KeyEvent.VK_T);
		Set<String> allwh = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<String>(allwh);
		String wh = l.get(3);
		driver.switchTo().window(wh);
		driver.quit();
	}
}