package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("1234567");
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]")).click();
		String title=driver.getTitle();
		if(title.equals("instagram"))
		{
			System.out.println("pass:home page is displayed");
		}
		else
		{
			System.out.println("fail:home page is not displayed");
		}
		System.out.println(driver.getCurrentUrl());
		}
	}


