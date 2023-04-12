package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test8 {

	public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.actitime.com/login.do");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement ele = driver.findElement(By.xpath("//div[text()='Login ']"));
	  if(ele.isEnabled())
	  {
		  System.out.println("pass:element is enabled");
		  ele.click();
	  }
	  else
	  {
		  System.out.println("fail:element is not displayed");
	  }
	  

	}

}
