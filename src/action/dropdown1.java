package action;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Durations;

public class dropdown1 {

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
	
		
		List<WebElement> alloptions = s.getOptions();
		for(WebElement b:alloptions)
		{
			System.out.println(b.getText());
		
		}
		
		
		driver.close();
	}
//committed
}
