package listeners;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class DemoTestB {
@Test
	public void testB()
	{
		Reporter.log("run testB...",true);
	}
}
