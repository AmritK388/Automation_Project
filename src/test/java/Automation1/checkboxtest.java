package Automation1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxtest {
@Test	
public void vertify() {
	System.setProperty("webdriver.chrome.driver","/Users/Amrit/Selenium/Automation1/drivers/chromedriver");
	WebDriver driver =new ChromeDriver();
	
	checkboxpage check = new checkboxpage(driver);
	driver.get("https://techfios.com/test/101/index.php");

	
		check.Adddata("checkbox1");
		check.datalink();
		check.toggleclick();
		check.check();
		check.adddata("addanother");
		check.clickadd();
		check.checkbox();
		check.remove();
		check.togg();
		check.rem();



}



}
