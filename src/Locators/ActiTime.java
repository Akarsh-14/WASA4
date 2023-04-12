package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
	
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if(actualtitle.equals("actiTIME - Login"))
		{
			System.out.println("pass:home page is displayed");
		}
		else
		{
			System.out.println("fails:home page is not displayed");
		}
		
String url=driver.getCurrentUrl();
System.out.println(url);
//driver.close();

	}

}
