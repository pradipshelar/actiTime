package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount 
{
@Test(invocationCount=5)
public void createUser()
{
	Reporter.log("user created successfully..",true);
	}
}
