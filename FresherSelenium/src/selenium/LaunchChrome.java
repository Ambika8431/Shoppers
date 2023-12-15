package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException{
//	    String Key="webdriver.gecko.driver";
//		String Value="./Softwares/geckodriver.exe";
//		System.setProperty(Key, Value);
//		FirefoxDriver driver=new FirefoxDriver();
//		Thread.sleep(2000);
//		driver.close();
//		String Key1="webdriver.chrome.driver";
//		String Value1="./Softwares/chromedriver.exe";
//		System.setProperty(Key1, Value1);
//		ChromeDriver driver1=new ChromeDriver();
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		//driver.close();
	}

}
