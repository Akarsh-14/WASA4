package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		Dimension d=ele.getSize();
		int height=d.getHeight();
		System.out.println("height of the element is:"+height);
		int width=d.getWidth();
		System.out.println("width of the element is:"+width);
		driver.close();
	}

}
