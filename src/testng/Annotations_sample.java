package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annotations_sample extends BaseTest
{
@Test
public void testC()
{
Reporter.log("run test c...",true);	
}
}
