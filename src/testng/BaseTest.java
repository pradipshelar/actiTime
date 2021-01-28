package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
@BeforeMethod
public void beforemethod()
{
Reporter.log("run before method....",true);	
}
@AfterMethod
public void aftermethod()
{
Reporter.log("run after method....",true);	
}
@BeforeClass()
public void beforeclass()
{
Reporter.log("run before class...",true);	
}
@AfterClass
public void afterclass()
{
Reporter.log("run after class method...",true);	
}
@BeforeTest
public void beforetest()
{
	Reporter.log("run beforetest method...",true);	
}
@AfterTest
public void aftertest()
{
	Reporter.log("run aftertest method...",true);	
}
@BeforeSuite
public void beforesuite()
{
	Reporter.log("run beforesuite method...",true);	
}
@AfterSuite
public void aftersuite()
{
	Reporter.log("run after suite method...",true);	
}
}
