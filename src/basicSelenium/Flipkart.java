package basicSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	
	public static void getText(WebDriver driver,WebElement element1)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element1).perform();
		List<WebElement>element2=driver.findElements(By.xpath("//div[@class='_1fwVde']"));
		for(WebElement wb:element2)
		{
			System.out.println(wb.getText());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement>wb1=driver.findElements(By.xpath("//div[@class='_1kidPb']"));
		for(WebElement wb2:wb1)
		{
			System.out.println("headings of flipkart----"+wb2.getText());
		}
		System.out.println("------------------------------------");
		WebElement electronics=driver.findElement(By.xpath("//span[.='Electronics']"));
		WebElement tvandapp=driver.findElement(By.xpath("//span[.='TVs & Appliances']"));
		WebElement men=driver.findElement(By.xpath("//span[.='Men']"));
		WebElement women=driver.findElement(By.xpath("//span[.='Women']"));
		WebElement baby=driver.findElement(By.xpath("//span[.='Baby & Kids']"));
		WebElement home=driver.findElement(By.xpath("//span[.='Home & Furniture']"));
		WebElement sports=driver.findElement(By.xpath("//span[.='Sports, Books & More']"));
	             getText(driver,electronics);
	             System.out.println("---------------------------------------");
	             Thread.sleep(2000);
	             getText(driver,tvandapp);
	             System.out.println("---------------------------------------");
	             Thread.sleep(2000);
	             getText(driver,men);
	             System.out.println("---------------------------------------");
	             Thread.sleep(2000);
	             getText(driver,women);
	             System.out.println("---------------------------------------");
	             Thread.sleep(2000);
	             getText(driver,baby);
	             System.out.println("---------------------------------------");
	             Thread.sleep(2000);
	             getText(driver,home);
	             System.out.println("---------------------------------------");
	             Thread.sleep(2000);
	             getText(driver, sports);
	             System.out.println("---------------------------------------");
		         Thread.sleep(2000);
                driver.close();
	}

}
