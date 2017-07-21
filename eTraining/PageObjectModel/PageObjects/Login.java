package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ApplicationUtilities.AppUtilities;
import GeneralUtilities.ReadProperties;
public class Login 
{
	WebDriver driver;
	AppUtilities appUtils;
	public Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		appUtils = new AppUtilities(driver);
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	
	@FindBy(name = "userName") 	public WebElement uName;
	@FindBy(name = "password") 	public WebElement pWord;
	@FindBy(name = "login") 	public WebElement login;
	@FindBy(partialLinkText = "SIGN") 	public WebElement signOutButton;
	/*WebElement uName;
	WebElement pWord;
	WebElement login;*/
	
	public void launchApplication()
	{
		driver.navigate().to(ReadProperties.readValue("URL"));
	}
	
	
	
	public void loginToNewTours()
	{
		/*uName = driver.findElement(By.name("userName"));
		pWord = driver.findElement(By.name("password"));
		login = driver.findElement(By.name("login"));*/
		/*try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		appUtils.sendKeysWebElement(uName,ReadProperties.readValue("UserName"));
		appUtils.sendKeysWebElement(pWord,ReadProperties.readValue("PassWord"));
		appUtils.clickWebElement(login);
	}
	
	public void logout()
	{
		//driver.findElement(By.partialLinkText("SIGN")).click();
		signOutButton.click();
	}
	public void closeBrowser()
	{
		
	}
}
