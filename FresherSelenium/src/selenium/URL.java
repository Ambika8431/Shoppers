package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class URL {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/");
	    Thread.sleep(2000);
	    String a=driver.getTitle();
	    Thread.sleep(2000);
	    driver.get("https://www.facebook.com/");
	    String b=driver.getTitle();
	    System.out.println(a);
	    System.out.println(b);
		if(a.equals(b))
		{
			System.out.println("matching");
		}
		else
		{
			System.out.println("notmatching");
		}
			
		
	}
}
