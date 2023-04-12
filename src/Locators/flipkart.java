package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		String actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	if(actualtitle.equals("flipkart"))
	{
		System.out.println("pass:home pass is opened");
	}
	else
	{
		System.out.println("fail:home page is not opened");
	}
	String url=driver.getCurrentUrl();
	System.out.println(url);
	}

	}


