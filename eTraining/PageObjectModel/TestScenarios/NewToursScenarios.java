package TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.Cruises;
import PageObjects.Flights;
import PageObjects.Login;

public class NewToursScenarios
{
	//WebDriver driver = new FirefoxDriver();
	WebDriver driver = new ChromeDriver();
	Login _lg = new Login(driver);
	Flights _fl = new Flights(driver);
	Cruises _cr = new Cruises(driver);
	
	
	public void bookOnewayAirTravel()
	{
		_lg.launchApplication();
		_lg.loginToNewTours();
		_fl.bookFlight();
		_lg.logout();
		_lg.closeBrowser();
		
	}
	
	public void bookCruiseWithAirTravel()
	{
		_lg.launchApplication();
		_lg.loginToNewTours();
		_fl.bookFlight();
		_cr.navigteToCruises();
		_cr.bookCruises();
		_lg.logout();
		_lg.closeBrowser();
		
	}

}
