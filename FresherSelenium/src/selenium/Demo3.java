package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9883798641");
		Thread.sleep(2000);
		WebElement drop_down = driver.findElement(By.xpath("//select[@id='select2']"));
		Select sel=new Select(drop_down);
		sel.selectByVisibleText("Female");
		Thread.sleep(2000);
		WebElement drop_down1 = driver.findElement(By.xpath("//select[@id='select3']"));
		Select sel1=new Select(drop_down1);
		sel1.selectByVisibleText("India");
		Thread.sleep(2000);
		WebElement drop_down2 = driver.findElement(By.xpath("//select[@id='select5']"));
		Select sel2=new Select(drop_down2);
		sel2.selectByVisibleText("Karnataka");
		Thread.sleep(2000);
		WebElement drop_down3 = driver.findElement(By.xpath("//option[.='Select City']"));
		Select sel3=new Select(drop_down3);
		sel3.selectByValue("Bidar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//a[@aria-current='page']")).click();

	}
}
