package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumCore
{
	WebDriver driver = new FirefoxDriver();
	ApplicationUtilities appUtils = new ApplicationUtilities(driver);
	//WebDriver driver = new ChromeDriver();
	WebElement uName;
	WebElement pWord;
	WebElement login;
	/*List<WebElement> myCollection ;
	WebElement myObject;*/
	
	@Before
	public void launchApplication()
	{
		
		/*driver.navigate().to(GeneralUtilities.readValue("URL"));
		uName = driver.findElement(By.name("userName"));
		pWord = driver.findElement(By.name("password"));
		login = driver.findElement(By.name("login"));*/
		
		driver.get("http://www.egov.com/");
		//driver.get("http://www.ksrtc.in");
		System.out.println("This is my Launch Application");
		//readPropertiesFile("URL");
	}
	@Test
	public void workWithIframe()
	{
		driver.findElement(By.className("_3ac-")).click();
		staticWait(3);
		WebElement myFrame = driver.findElement(By.xpath("//*[@id='app']/div/div[6]/div[2]/div/iframe"));
		driver.switchTo().frame(myFrame);
		driver.findElement(By.name("username")).sendKeys("nag022");
		driver.findElement(By.name("password")).sendKeys("nag022");
		//driver.findElement(By.name("username")).sendKeys("nag022");
		//nagkothapalli
	}
	@Test
	public void workWithWindowHandles()
	{
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "n");
		//Set<String> myWindows = driver.getWindowHandles();
		ArrayList<String> myWindows =  new ArrayList<String>(driver.getWindowHandles());
		myWindows.size();
		driver.switchTo().window(myWindows.get(0));
		driver.navigate().to("https://google.co.in");
		driver.switchTo().window(myWindows.get(1));
		driver.navigate().to("https://paytm.com");
		driver.close();
		driver.switchTo().window(myWindows.get(0));
		driver.navigate().to("https://ksrtc.in");
		
		//driver.quit();
		for(int i=0;i<myWindows.size();i++)
		{
			System.out.println(myWindows.get(i));
		}
		
	}
	@Test
	public void workWithResponsiveWebSites()
	{
		driver.manage().window().maximize();
	}
	
	@Test
	public void workWithAlerts()
	{
		driver.findElement(By.name("fromPlaceName")).sendKeys("Hyderabad");
		driver.findElement(By.name("searchBtn")).click();
		Alert myAlert = driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.accept();
		
		driver.findElement(By.name("toPlaceName")).sendKeys("Bangalore");
	}
	
	public void staticWait(int timeInSec)
	{
		try {
			Thread.sleep(timeInSec*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void loginGmail() throws InterruptedException
	{
		driver.findElement(By.id("Email")).sendKeys("nag022");
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Passwd")).sendKeys("mar1234");
		driver.findElement(By.id("signIn")).click();
	}
	
	
	@Test
	public void workWithLinkText()
	{
		//driver.findElement(By.linkText("your destination")).click();
		driver.findElement(By.linkText("Business Travel @ About.com")).click();
		
	}
	
	@Test
	public void workWithPartialLinkText()
	{
		driver.findElement(By.partialLinkText("Business Travel")).click();
	}
	@Test
	public void workWithStaticXpath()
	{
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	}
	@Test
	public void workWithDynamicXpath()
	{
		driver.findElement(By.xpath("//a[contains(@href,'mercurycruise')]")).click();
	}

	@Test
	public void loginToNewTours()
	{
		if(uName.isEnabled())
			uName.sendKeys(GeneralUtilities.readValue("UserName"));
		if(pWord.isEnabled())
			pWord.sendKeys(GeneralUtilities.readValue("PassWord"));
		if(login.isEnabled())
			login.click();
	}
	
	@Test
	public void bookFlight()
	{
		loginToNewTours();
		//driver.findElements(By.name("tripType")).get(0).click();
		//driver.findElements(By.name("tripType")).get(1).click();
		//selectAnElementFromCollection("oneway");
		//selectAnElementFromCollection("tripType","RoundTrip");
		//selectAnElementFromCollection("servClass","Business");
		appUtils.selectAnElementFromCollection("name","tripType",GeneralUtilities.readValue("trips"),"value");
		appUtils.selectAnElementFromCollection("name","servClass",GeneralUtilities.readValue("service"),"value");
		//selectAnElementFromDropDown(1);
		//selectAnElementFromDropDown("3");
		appUtils.selectAnElementFromDropDown("name","passCount","3");
		//selectAnElementFromDropDown("name","passCount",3);
		appUtils.selectAnElementFromDropDown("name","fromPort","London");
		appUtils.selectAnElementFromDropDown("name","fromMonth",1);
		appUtils.selectAnElementFromDropDown("name","fromDay","3");
		appUtils.selectAnElementFromDropDown("name","toPort","Paris");
		appUtils.selectAnElementFromDropDown("name","toMonth","March");
		appUtils.selectAnElementFromDropDown("name","toDay",4);
		appUtils.selectAnElementFromDropDown("name","airline",2);
		appUtils.selectAnElementFromCollection("className","mouseOut","ITINERARY","innerText");
		appUtils.selectAnElementFromCollection("className","mouseOut","Cruises","innerText");
	}
	
	
}
