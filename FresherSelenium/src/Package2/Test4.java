package Package2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	@Test(priority = 1)
	public void test1()
	{
		Reporter.log("Java",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("Selenium",true);
	}
}
