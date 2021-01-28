package basicSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
      public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		
           getscreenshot(driver,"iphone");
           driver.close();
	}
	public static void getscreenshot(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
		Files.copy(source, new File("./Screenshots/"+name+".png"));
	}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		}

}
