package Automation1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class categorypagetest {
@Test
public void vertify() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","/Users/Amrit/Selenium/Automation1/drivers/chromedriver");
	WebDriver driver =new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,350)", "");
	driver.manage().window().fullscreen();
	driver.manage().window().maximize();
	categorypage cat = new categorypage(driver);
	driver.get("https://techfios.com/test/101/index.php");
		
	cat.Addca("ScaredyCat953");
	cat.clickadd();
	Thread.sleep(3000);
	cat.Addcategory("ScaredyCat953");
	cat.add();
	Thread.sleep(3000);
	cat.bo();
	cat.neve();
	Thread.sleep(3000);
	cat.clickscary();
	cat.yes();
	Thread.sleep(3000);
	cat.month();
}



}
