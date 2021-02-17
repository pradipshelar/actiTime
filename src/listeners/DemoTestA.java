package listeners;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class DemoTestA {
@Test
public void testA()
{
Reporter.log("run test A....",true);	
}

}
