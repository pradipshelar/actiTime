package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipExecution {
	
	@Test(priority=1)
	public void testA()
	{
	Reporter.log("user is registered",true);	
	}
	@Test(enabled=false)
	public void testB()
	{
	Reporter.log("user is edited",true);	
	}
	@Test(priority=3)
	public void testC()
	{
	Reporter.log("user is deleted",true);
	}

}
