package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPractice 
{
	WebDriver driver = new FirefoxDriver();
	ApplicationUtilities myUtils = new ApplicationUtilities(driver);
	
	@Before
	public void launchGmail()
	{
		driver.get(GeneralUtilities.readProperties("URL"));
	}
	WebElement nextButton;
	List<WebElement> groupOfButtons;
	List<WebElement> myElements;
	
	@Test
	public void workWithWindowHandlers()
	{
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "n");
		ArrayList<String>  myWindows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(myWindows.get(0));
		driver.get("https://amazon.co.in");
		driver.switchTo().window(myWindows.get(1));
		driver.get("https://icicibank.com");
		//driver.close();
		driver.quit();
		for(int i=0;i<myWindows.size();i++)
		{
			System.out.println(myWindows.get(i));
		}
	}
	@Test
	public void workWithLinkText()
	{
		
		myUtils.returnWebElement("linkText","Cruises").click();
	}
	@Test
	public void workWithPartialLinkText() throws InterruptedException
	{
		myUtils.returnWebElement("partiallinkText","SIGN").click();
		Thread.sleep(2000);
		loginToNewTours();
		Thread.sleep(2000);
		myUtils.returnWebElement("partiallinkText","SIGN").click();
	}
	@Test
	public void workWithStaticXpath()
	{
		myUtils.returnWebElement("xpath","/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a").click();
		myUtils.returnWebElement("xpath","/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a").click();
	}
	
	@Test
	public void workWithDynamicXpath()
	{
		//returnWebElement("xpath","//a[contains(@href,'mercuryregister')]").click();
		loginToNewTours();
		//returnWebElement("xpath","//a[contains(@href,'mercuryprofile')]").click();
		driver.findElement(By.xpath("//a[contains(@href,'mercuryprofile')]")).click();
		myUtils.returnWebElement("xpath","//img[contains(@src,'profile_submit')]").click();
	}
	
	@Test
	public void loginToGmail() throws InterruptedException
	{
		//driver.findElement(By.id("identifierId")).sendKeys("nag022");
		WebElement userName = driver.findElement(By.id("identifierId"));
		//nextButton = driver.findElement(By.cssSelector(".RveJvd"));
		groupOfButtons = driver.findElements(By.cssSelector(".RveJvd"));
		if(userName.isEnabled())
		{
			userName.clear();
			userName.sendKeys("nag022");
			groupOfButtons.get(1).click();
			groupOfButtons.get(0).click();
			//nextButton.click();
			Thread.sleep(2000);
			WebElement passWord = driver.findElement(By.name("password"));
			passWord.sendKeys("kothapalli@1234");
			//driver.findElement(By.cssSelector(".RveJvd")).click();
			WebElement nextButton2 = driver.findElement(By.cssSelector(".RveJvd"));
			nextButton2.click();
			
		}
		
	}

@Test
public void loginToNewTours()
{
	
	myUtils.returnWebElement("name","userName").sendKeys(GeneralUtilities.readProperties("UserName"));
	myUtils.returnWebElement("name","password").sendKeys(GeneralUtilities.readProperties("PassWord"));
	myUtils.returnWebElement("name","login").click();
	//driver.findElement(By.name("userName")).sendKeys("nag022");
	//driver.findElement(By.name("password")).sendKeys("mar1234");
	//driver.findElement(By.name("login")).click();

}
@Test
public void bookFlight()
{
	loginToNewTours();
	myUtils.selectAnElementFromACollection("oneway");
	myUtils.selectAnElementFromACollection("tripType","roundtrip");
	myUtils.selectAnElementFromACollection("servClass","First");
	//selectAnElementFromACollection("className","mouseOut","innerText","Cruises");
	//driver.findElements(By.name("tripType")).get(1).click();
	//driver.findElements(By.name("tripType")).get(0).click();
	
	/*WebElement myElement = returnWebElement("name","passCount");
	Select mySelect = new Select(myElement);
	mySelect.selectByIndex(1);*/
	
	/*Select mySelect = new Select(returnWebElement("name","passCount"));
	mySelect.selectByIndex(1);*/
	
	//new Select(returnWebElement("name","passCount")).selectByIndex(2);
	myUtils.selectAnElementFromDropDown("name","passCount",GeneralUtilities.readProperties("Passengers"));
	myUtils.selectAnElementFromDropDown("name","fromPort",GeneralUtilities.readProperties("SourceCity"));
	myUtils.selectAnElementFromDropDown("name","fromMonth",5);
	myUtils.selectAnElementFromDropDown("name","fromDay",27);
	myUtils.selectAnElementFromDropDown("name","toPort",GeneralUtilities.readProperties("DestinationCity"));
	myUtils.selectAnElementFromDropDown("name","toMonth",6);
	myUtils.selectAnElementFromDropDown("name","toDay",5);
	myUtils.selectAnElementFromDropDown("name","airline",1);
	
	
}






}