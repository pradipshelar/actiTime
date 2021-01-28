package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2_dependsOnMethod
{
@Test
public void register()
{
	Reporter.log("user is register....",true);
}
@Test(dependsOnMethods="register")
public void edited()
{
Reporter.log("user is edited",true);	
}
@Test(dependsOnMethods= {"register","edited"})
public void deleted()
{
	Reporter.log("register deleted...",true);
	}
}
