package basicSelenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
	Dimension d=email.getSize();
	int height=d.getHeight();
	int width=d.getWidth();
	System.out.println("height and width of email is"+height+"and"+width);
	
	Dimension d1=password.getSize();
	int height1=d1.getHeight();
	int width1=d1.getWidth();
	System.out.println("height and width of password is"+height1+"and"+width1);
	if(height==height1&& width==width1)
	{
		System.out.println("same");
	}
	else
	{
	System.out.println("different");	
	}
	driver.close();
	}

}
