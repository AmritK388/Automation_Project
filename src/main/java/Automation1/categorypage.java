package Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class categorypage {
	WebDriver driver;

	By category = By.cssSelector("input[name='categorydata']");
	By addcat = By.cssSelector("input[value='Add category']");
	By bod = By.cssSelector("body");
	By nevermind = By.cssSelector("a[href='javascript:history.back();']");
	By clicksca = By.xpath("//span[normalize-space()='ScaredyCat953']");
	By yest = By.xpath("(//a[normalize-space()='Yes'])[1]");
	By due = By.name("due_month");
	
	categorypage(WebDriver d)
	{
		driver = d;
	}

	public void Addca(String ScaredyCat953)
	{
		driver.findElement(category).sendKeys("ScaredyCat953");
	}

	public void clickadd()
	{
		driver.findElement(addcat).click();
	}

	public void Addcategory(String ScaredyCat953)
	{
		driver.findElement(category).sendKeys("ScaredyCat953");
	}
	
	public void add()
	{
		driver.findElement(addcat).click();
	}

	public void bo()
	{
		driver.findElement(bod);
	}

	public void neve()
	{
		driver.findElement(nevermind).click();
	}

	public void clickscary()
	{
		driver.findElement(clicksca).click();
	}

	public void yes()
	{
		driver.findElement(yest).click();
	}
	
	public void month()
	{
		driver.findElement(due).click();
	}
	
}
