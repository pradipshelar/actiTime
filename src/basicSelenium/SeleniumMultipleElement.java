package basicSelenium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumMultipleElement 
{
	public static void getdata(List<WebElement>elements)
	{
		for(WebElement element1:elements)
		{
			System.out.println(element1.getText());
		}
	}

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//table[@class='data-list']"));
		List <WebElement>headings=driver.findElements(By.xpath("//thead"));
		int hcount=headings.size();
		System.out.println("number of table"+hcount);
		List<WebElement>languages=driver.findElements(By.xpath("//table[@class='data-list']//tr//td[1]"));
		List<WebElement>stableversion=driver.findElements(By.xpath("//table[@class='data-list']//tr//td[2]"));
		List<WebElement>releasedate=driver.findElements(By.xpath("//table[@class='data-list']//tr//td[3]"));
		List<WebElement>alpha=driver.findElements(By.xpath("//table[@class='data-list']//tr//td[4]"));
		List<WebElement>alrelease=driver.findElements(By.xpath("//table[@class='data-list']//tr//td[5]"));
		List<WebElement>links=driver.findElements(By.xpath("//table[@class='data-list']//tr//td[6]"));
		System.out.println("headings of table");
		getdata(headings);
		System.out.println("languages");
		getdata(languages);
		System.out.println("stable version");
		getdata(stableversion);
		System.out.println("release date");
		getdata(releasedate);
		System.out.println("alpha version");
		getdata(alpha);
		System.out.println("alpha release date");
		getdata(alrelease);
		System.out.println("links");
		getdata(links);
		driver.close();
	}
	

}

