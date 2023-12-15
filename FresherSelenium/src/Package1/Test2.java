package Package1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test(priority = 1)
	public void test1()
	{
		Reporter.log("Hello",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("India",true);
	}

}
