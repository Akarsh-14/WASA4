package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/Home-Kitchen/b/?ie=UTF8&node=976442031&ref_=nav_cs_home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dd = driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(dd);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("search-alias=fashion");
		Thread.sleep(2000);
		s.selectByVisibleText("Appliances");
		
		s.deselectByIndex(3);
		s.deselectByValue("search-alias=fashion");
		s.deselectByVisibleText("Appliances");
		
		Thread.sleep(2000);
		driver.close();
	}

}
