package action;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("3");
		Thread.sleep(2000);
		s.selectByVisibleText("Oct");
		
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
		
		ArrayList a=new ArrayList<>();
		for( WebElement opt:alloptions)
		{
			String st = opt.getText();
			a.add(st);
			System.out.println(st);
			
		}
		System.out.println("*****************after sorting**************");
		Collections.sort(a);
			
		for( Object options:a)
		{
			System.out.println(options);
		}
		driver.close();
		
	}

}
