package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcase2 {
public WebDriver driver;
@BeforeMethod
public void openapp()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
@Test
public void tc2()
{
	driver.findElement(By.linkText("Forgotten password?")).click();
	driver.findElement(By.id("identify_email")).sendKeys("9731777565");
	driver.findElement(By.name("did_submit")).click();
	Reporter.log(driver.getTitle(),true);
	Reporter.log(driver.getCurrentUrl(),true);
	
}
@AfterMethod
public void closeapp()
{
	driver.close();
}
}
