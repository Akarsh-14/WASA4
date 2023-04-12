package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
	Select s=new Select(dropdown);
	s.selectByIndex(4);
	Thread.sleep(2000);
	s.selectByValue("625");
	Thread.sleep(2000);
	s.selectByVisibleText("Baby");
	Thread.sleep(2000);
	driver.close();

	}

}
