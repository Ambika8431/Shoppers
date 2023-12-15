package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions8 {
	public static void main(String[] args) throws InterruptedException, AWTException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele1 = driver.findElement(By.xpath("//span[.='Documentation']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Support']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[text()='Blog']"));
		
		ArrayList<WebElement> l=new ArrayList<WebElement>();
		l.add(ele);
		l.add(ele1);
		l.add(ele2);
		l.add(ele3);
		l.add(ele4);
		
		Actions a=new Actions(driver);
		Robot r=new Robot();
		for(WebElement w : l)
		{
			a.contextClick(w).perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}
		Set<String> win = driver.getWindowHandles();
		ArrayList<String> f=new ArrayList<String>(win);
		driver.switchTo().window(f.get(1));
		
		
	}
}
