package selenium;








import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class web {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Web.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@value='selenium']"));
		ele.sendKeys(Keys.CONTROL+"ax");
		//ele.sendKeys(Keys.CONTROL+"c");
		//ele.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@type='TEXT1']"));
		ele1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//input[@type='TEXT']"));
		ele2.sendKeys(Keys.CONTROL+"ax");
		//ele2.sendKeys(Keys.CONTROL+"c");
		//ele2.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		WebElement ele3 = driver.findElement(By.xpath("//input[@value='selenium']"));
		ele3.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		WebElement ele4 = driver.findElement(By.xpath("//input[@type='TEXT1']"));
		ele4.sendKeys(Keys.CONTROL+"ax");
		//ele4.sendKeys(Keys.CONTROL+"c");
		//ele4.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		WebElement ele5 = driver.findElement(By.xpath("//input[@type='TEXT']"));
		ele5.sendKeys(Keys.CONTROL+"v");
		
		
		
		
		
	}

}
