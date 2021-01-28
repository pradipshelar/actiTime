package basicSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://google.com/");
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		int count=allLinks.size();
		System.out.println(count);
		//System.out.println(allLinks.size());
//		for(WebElement ele:allLinks)
//			
//		{
//			System.out.println(ele.getText());
//		}
		int a=0;int b=0;
		for(int i=0;i<count;i++)
		{
	
				WebElement links=allLinks.get(i);
			boolean	v=links.isDisplayed();
			if(v)
			{
				a++;
			
				System.out.println(links.getText());
				
			}	
			else
				
			{
				b++;
				
			}
			
		}
		System.out.println(a);
		System.out.println(b);
		driver.close();

	}

}
