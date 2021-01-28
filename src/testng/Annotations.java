package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annotations extends BaseTest
{
@Test
public void testA()
{
Reporter.log("run test A........",true);	
}
@Test
public void testB()
{
Reporter.log("run test B........",true);	
}
}
