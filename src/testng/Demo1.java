package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1
{
@Test(priority=1)
public void testA()
{
Reporter.log("user is registered",true);	
}
@Test(priority=2)
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