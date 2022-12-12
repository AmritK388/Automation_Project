package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkboxpage {
	WebDriver driver;

		By data = By.cssSelector("input[name='data']");
		By Add = By.cssSelector("input[value='Add']");
		By toggle = By.name("allbox");
		By checkbox = By.xpath("//input[@type='checkbox']");
		//By dataad = By.cssSelector("input[name='data']");
		//By clickadd = By.cssSelector("input[value='Add']");
		By remove = By.cssSelector("input[value='Remove']");
		


		checkboxpage(WebDriver d)
		{
			driver = d;
		}
		
		public void Adddata(String checkbox1)
		{
			driver.findElement(data).sendKeys(checkbox1);
		}
		
		public void datalink()
		{
			driver.findElement(Add).click();
		}

		public void toggleclick()
		{
			driver.findElement(toggle).click();
		}

		public void check()
		{
			driver.findElement(checkbox).click();
		}

		public void adddata(String addnother)
		{
			driver.findElement(data).sendKeys("addnother");
		}

		public void clickadd()
		{
			driver.findElement(Add).click();
		}

		public void checkbox()
		{
			driver.findElement(checkbox).click();
		}

		public void remove()
		{
			driver.findElement(remove).click();
		}

		public void togg()
		{
			driver.findElement(toggle).click();
		}
		
		public void rem()
		{
			driver.findElement(remove).click();
		}
}

