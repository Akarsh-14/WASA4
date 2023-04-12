package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if(actualtitle.equals("facebook"))
		{
			System.out.println("pass:home page is displaying");
		}
		else
		{
			System.out.println("fail:home page is not displaying");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		}

	}


