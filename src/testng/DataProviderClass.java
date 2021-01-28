package testng;



import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderClass
{
@DataProvider
public Object[][]getdata()
{
Object[][]data=new Object[2][2];
data[0][0]="user A";
data[0][1]="pass123";
data[1][0]="user B";
data[1][1]="12345";
return data;
}
@Test(dataProvider="getdata")
public void createuser(Object un,Object pwd)
{
Reporter.log(un+"\t"+pwd,true);	
}
}
