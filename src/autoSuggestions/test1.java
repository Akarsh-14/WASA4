package autoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("oneplus");
		Thread.sleep(1000);
		List<WebElement> autosuggest = driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println(autosuggest.size());
		for(WebElement b:autosuggest)
		{
			System.out.println(b.getText());
		}
driver.close();

	}

}
