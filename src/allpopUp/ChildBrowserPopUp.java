package allpopUp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String parentwindow = driver.getWindowHandle();
		Set<String> allwind = driver.getWindowHandles();
		for(String win:allwind)
		{
			driver.switchTo().window(win);
			if(!parentwindow.equals(win))
			{
				driver.close();
			}
		}
		

	}

}
