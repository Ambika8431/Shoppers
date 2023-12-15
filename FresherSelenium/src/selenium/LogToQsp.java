package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogToQsp {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Ambika");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("ambikamk@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("amk@06");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[type='button']")).click();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/button");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='btn2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='btn7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='btn8']")).click();
		driver.get("https://demoapps.qspiders.com/link");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='/link/payment']")).click();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/radio");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='radio']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='office']")).click();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/checkbox");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='mode']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}
