package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_group extends BaseTest1
{
@Test(priority=1,groups="smoketesting")
public void createuser()
{
Reporter.log("create user..",true);	
}
@Test(priority=2,groups={"smoketesting","regression"})
public void edituser()
{
Reporter.log("edit user..",true);	
}
@Test(priority=3,groups="smoketesting")
public void deleteuser()
{
Reporter.log("delete user..",true);	
}
}
