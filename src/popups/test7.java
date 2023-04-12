package popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test7 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=CjwKCAjwh-CVBhB8EiwAjFEPGVy-nfH_mwrr4ff9uHkkL-TqPKo6udGQvIgp54elqi6ApqMXhuYviBoCyT8QAvD_BwE&gclsrc=aw.ds");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Runtime.getRuntime().exec("C:\\Users\\akars\\Desktop\\AutoIt\\fileupload.exe");

	}

}
