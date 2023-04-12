package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
Actions a=new Actions(driver);

a.moveToElement(signin).perform();
driver.findElement(By.xpath("//a[text()='login']")).click();
driver.switchTo().frame(0);
driver.findElement(By.name("username")).sendKeys("9731777565");
Thread.sleep(2000);
driver.findElement(By.id("close-pop")).click();

driver.switchTo().defaultContent();
a.moveToElement(signin).perform();
driver.findElement(By.xpath("//a[text()='login']")).click();
driver.switchTo().frame(0);
driver.findElement(By.name("username")).sendKeys("akarsh");
Thread.sleep(2000);
driver.findElement(By.id("close-pop")).click();

driver.findElement(By.id("close-pop")).click();
	}

}
