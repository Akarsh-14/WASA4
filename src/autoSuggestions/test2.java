package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		ele.sendKeys("dresses");
		Thread.sleep(2000);
		List<WebElement> autosuggest = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
System.out.println(autosuggest.size());
for(WebElement b:autosuggest)
{
	System.out.println(b.getText());
}
driver.close();
	}

}
