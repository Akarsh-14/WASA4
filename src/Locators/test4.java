package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.skillrary.com/user/login");
	driver.findElement(By.linkText("Forgot Password")).click();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("Return to login page")).click();
	}

}
