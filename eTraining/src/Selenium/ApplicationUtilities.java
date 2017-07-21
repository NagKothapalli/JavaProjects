package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ApplicationUtilities 
{
	WebDriver driver;
	List<WebElement> myCollection ;
	WebElement myObject;
	public ApplicationUtilities(WebDriver myDriver)
	{
		driver = myDriver;
	}
	public void selectAnElementFromDropDown(String propertyType,String propertyValue,int indextoSelect)
	{
		myObject = createObject(propertyType,propertyValue);
		Select mySelect = new Select(myObject);
		mySelect.selectByIndex(indextoSelect);
	}
	
	public void selectAnElementFromDropDown(String propertyType,String propertyValue,String textVisible)
	{
		myObject = createObject(propertyType,propertyValue);
		Select mySelect = new Select(myObject);
		mySelect.selectByVisibleText(textVisible);
	}
	
	
	public void selectAnElementFromDropDown(int indextoSelect)
	{
		WebElement dropDown = driver.findElement(By.name("passCount"));
		Select mySelect = new Select(dropDown);
		mySelect.selectByIndex(indextoSelect);
	}
	
	public void selectAnElementFromDropDown(String textVisible)
	{
		WebElement dropDown = driver.findElement(By.name("passCount"));
		Select mySelect = new Select(dropDown);
		mySelect.selectByVisibleText(textVisible);
	}
	public void selectAnElementFromCollection(String propertyType,String propertyValue,String elementToSelect,String attributeType)
	{
		myCollection = createObjectCollection(propertyType,propertyValue);
		for(int i=0;i<myCollection.size();i++)
		{
			System.out.println("My  :" +i+ "  Element Text is : " + myCollection.get(i).getAttribute(attributeType));
			if(myCollection.get(i).getAttribute(attributeType).trim().equalsIgnoreCase(elementToSelect))
			{
				myCollection.get(i).click();
				System.out.println("Found :" + elementToSelect);
				break;
			}
		}
	}
	public void selectAnElementFromCollection(String propertyType,String propertyValue,String elementToSelect)
	{
		myCollection = createObjectCollection(propertyType,propertyValue);
		for(int i=0;i<myCollection.size();i++)
		{
			if(myCollection.get(i).getAttribute("value").equalsIgnoreCase(elementToSelect))
			{
				myCollection.get(i).click();
				System.out.println("Found :" + elementToSelect);
				break;
			}
		}
	}
	public WebElement createObject(String propertyType,String propertyValue)
	{
		if(propertyType.equalsIgnoreCase("name"))
			myObject = driver.findElement(By.name(propertyValue));
		else if(propertyType.equalsIgnoreCase("id"))
			myObject = driver.findElement(By.id(propertyValue));
		else if(propertyType.equalsIgnoreCase("linkText"))
			myObject = driver.findElement(By.linkText(propertyValue));
		else if(propertyType.equalsIgnoreCase("partialLinkText"))
			myObject = driver.findElement(By.partialLinkText(propertyValue));
		else if(propertyType.equalsIgnoreCase("className"))
			myObject = driver.findElement(By.className(propertyValue));
		else if(propertyType.equalsIgnoreCase("cssSelector"))
			myObject = driver.findElement(By.cssSelector(propertyValue));
		else if(propertyType.equalsIgnoreCase("xpath"))
			myObject = driver.findElement(By.xpath(propertyValue));
		
		return myObject;
	}
	
	public List<WebElement> createObjectCollection(String propertyType,String propertyValue)
	{
		if(propertyType.equalsIgnoreCase("name"))
			myCollection = driver.findElements(By.name(propertyValue));
		else if(propertyType.equalsIgnoreCase("id"))
			myCollection = driver.findElements(By.id(propertyValue));
		else if(propertyType.equalsIgnoreCase("linkText"))
			myCollection = driver.findElements(By.linkText(propertyValue));
		else if(propertyType.equalsIgnoreCase("partialLinkText"))
			myCollection = driver.findElements(By.partialLinkText(propertyValue));
		else if(propertyType.equalsIgnoreCase("className"))
			myCollection = driver.findElements(By.className(propertyValue));
		else if(propertyType.equalsIgnoreCase("cssSelector"))
			myCollection = driver.findElements(By.cssSelector(propertyValue));
		else if(propertyType.equalsIgnoreCase("xpath"))
			myCollection = driver.findElements(By.xpath(propertyValue));
		
		return myCollection;
	}
	
	public void selectAnElementFromCollection(String propertyValue,String elementToSelect)
	{
		List<WebElement>myCollection = driver.findElements(By.name(propertyValue));
		for(int i=0;i<myCollection.size();i++)
		{
			if(myCollection.get(i).getAttribute("value").equalsIgnoreCase(elementToSelect))
			{
				myCollection.get(i).click();
				System.out.println("Found :" + elementToSelect);
				break;
			}
		}
	}
	public void selectAnElementFromCollection(String journeyType)
	{
		List<WebElement>myCollection = driver.findElements(By.name("tripType"));
		for(int i=0;i<myCollection.size();i++)
		{
			if(myCollection.get(i).getAttribute("value").equalsIgnoreCase(journeyType))
			{
				myCollection.get(i).click();
				System.out.println("Found :" + journeyType);
				break;
			}
		}
	}

}
