package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test10 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement radiobutton = driver.findElement(By.xpath("//label[text()='Male']"));
		if(radiobutton.isSelected())
		{
			System.out.println("pass:element is selected");
		}
		else
		{
			System.out.println("fail:element is not selected");
		}

	}

}
