package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dd1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement dd2 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.dragAndDrop(dd1, dd2).perform();
	
	}

}
