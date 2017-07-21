package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cruises 
{

	WebDriver driver;
	public Cruises(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void navigteToCruises()
	{
		driver.findElement(By.linkText("Cruises")).click();
	}
	
	public void bookCruises()
	{
		System.out.println("Cruise booked");
	}
	
}
