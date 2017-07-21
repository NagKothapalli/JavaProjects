package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ApplicationUtilities.AppUtilities;
import GeneralUtilities.ReadProperties;
public class Flights
{
	WebDriver driver;
	AppUtilities appUtils;
	public Flights(WebDriver driver)
	{
		this.driver = driver;
		appUtils = new AppUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "passCount") 	public WebElement mypassengerCount;
	@FindBy(name = "fromPort") 	public WebElement fromCity;
	@FindBy(name ="toPort") 	public WebElement destinationCity;
	@FindBy(name = "fromDay") 	public WebElement startDate;
	@FindBy(name = "fromMonth") 	public WebElement startMonth;
	@FindBy(name = "toMonth") 	public WebElement returnMonth;
	@FindBy(name = "toDay") 	public WebElement returnDate;
	@FindBy(name = "airline") 	public WebElement airLine;
	public void bookFlight()
	{
		//driver.findElements(By.name("tripType")).get(0).click();
		//driver.findElements(By.name("tripType")).get(1).click();
		//selectAnElementFromCollection("oneway");
		//selectAnElementFromCollection("tripType","RoundTrip");
		//selectAnElementFromCollection("servClass","Business");
		appUtils.selectAnElementFromCollection("name","tripType",ReadProperties.readValue("trips"),"value");
		appUtils.selectAnElementFromCollection("name","servClass",ReadProperties.readValue("service"),"value");
		//selectAnElementFromDropDown(1);
		//selectAnElementFromDropDown("3");
		//appUtils.selectAnElementFromDropDown("name","passCount","3");
		appUtils.selectAnElementFromDropDown(mypassengerCount, 2);
		//selectAnElementFromDropDown("name","passCount",3);
		appUtils.selectAnElementFromDropDown(fromCity,"London");
		appUtils.selectAnElementFromDropDown(startMonth,1);
		appUtils.selectAnElementFromDropDown(startDate,"3");
		appUtils.selectAnElementFromDropDown(destinationCity,"Paris");
		appUtils.selectAnElementFromDropDown(returnMonth,"March");
		appUtils.selectAnElementFromDropDown(returnDate,4);
		appUtils.selectAnElementFromDropDown(airLine,2);
		appUtils.selectAnElementFromCollection("className","mouseOut","ITINERARY","innerText");
		appUtils.selectAnElementFromCollection("className","mouseOut","Cruises","innerText");
	}
}
