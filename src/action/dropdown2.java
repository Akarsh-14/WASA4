package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dd = driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("625");
		Thread.sleep(2000);
		s.selectByVisibleText("Cell Phones & Accessories");
		System.out.println(s.isMultiple());
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		else
		{
			System.out.println("it is not multiple select dropdown");
		}
	driver.close();
	}

}
