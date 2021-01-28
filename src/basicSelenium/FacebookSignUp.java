package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://touch.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='signup-button']")).click();
		driver.findElement(By.xpath("//input[@id='firstname_input']")).sendKeys("pradip");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastname_input']")).sendKeys("shelar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_54k8 _8x0i _8x0j _9adg _723k']")).click();
		WebElement web = driver.findElement(By.xpath("//select[@id='day']"));
		web.click();
		Select sel=new Select(web);
		sel.selectByVisibleText("29");
		WebElement wb=driver.findElement(By.xpath("//select[@id='month']"));
		wb.click();
		Select sel1=new Select(wb);
		sel1.selectByVisibleText("Nov");
		Thread.sleep(2000);
		WebElement wb2=driver.findElement(By.xpath("//select[@id='year']"));
		wb2.click();
		Thread.sleep(2000);
		Select sel2=new Select(wb2);
		sel2.selectByVisibleText("1987");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_54k8 _8x0i _8x0j _9adg _723k']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='contactpoint_step_input']")).sendKeys("9049431559");
	    Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[@class='_54k8 _8x0i _8x0j _9adg _723k']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Male']")).click();
		driver.findElement(By.xpath("//button[@class='_54k8 _8x0i _8x0j _9adg _723k']")).click();
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Pradip@100");
		driver.findElement(By.xpath("//button[@class='_54k8 _8x0i _8x0j _9adg _723k']")).click();
		driver.close();
		
		
		
		
	

	}

}
