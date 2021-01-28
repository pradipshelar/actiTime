package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest1 
{
@BeforeMethod(alwaysRun=true)
public void preCondition()
{
Reporter.log("login to app",true);	
}
@AfterMethod(alwaysRun=true)
public void postCondition()
{
Reporter.log("logout to app",true);	
}

}
