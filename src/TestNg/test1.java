package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
 @Test
 public void demo()
 {
	 Reporter.log("hello",true);
	 Reporter.log("hello seleniun",false);
 }
}
