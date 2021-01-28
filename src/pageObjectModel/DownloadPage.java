package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage
{
@FindBy(xpath="//a")
private List<WebElement> alllinks;
public DownloadPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}
public void getlinks()
{
int count=alllinks.size();
System.out.println(count);

for(WebElement link:alllinks)
{
System.out.println(link.getText());	
}
}

	
}
