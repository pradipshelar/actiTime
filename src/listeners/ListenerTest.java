package listeners;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListenerTest implements ITestListener 
{
public static WebDriver driver;
	@Override
	public void onStart(ITestContext context) {
		Reporter.log("on start ......",true);
		Reporter.log("context"+context,true);
		Date date=context.getStartDate();
		Reporter.log("on start Date="+date,true);
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		
		Reporter.log("on finnish....",true);
		Reporter.log("context"+context,true);
		Date date=context.getEndDate();
		Reporter.log("on finish date="+date,true);
	}
	@Override
	public void onTestStart(ITestResult result) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/");
	
		
	}
}

