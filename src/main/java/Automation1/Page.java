package Automation1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Page {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Amrit/Selenium/Session_2/drivers/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://techfios.com/test/101/index.php");
		
		//driver.findElement(By.name("submit")).click();
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.cssSelector("input[name='data']")).sendKeys("checkbox1");
		driver.findElement(By.cssSelector("input[value='Add']")).click();
		driver.findElement(By.name("allbox")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.cssSelector("input[name='data']")).sendKeys("addnother");
		driver.findElement(By.cssSelector("input[value='Add']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.cssSelector("input[value='Remove']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("allbox")).click();
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		//driver.findElement(By.cssSelector("#todos-content")).click();
		driver.findElement(By.cssSelector("input[value='Remove']")).click();
		
		
		driver.findElement(By.cssSelector("input[name='categorydata']")).sendKeys("ScaredyCat953");
		driver.findElement(By.cssSelector("input[value='Add category']")).click();
		driver.findElement(By.cssSelector("input[name='categorydata']")).sendKeys("ScaredyCat953");
		driver.findElement(By.cssSelector("input[value='Add category']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("body"));
		driver.findElement(By.cssSelector("a[href='javascript:history.back();']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='ScaredyCat953']")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='Yes'])[1]")).click();
		driver.findElement(By.name("due_month")).click();

	}

}
