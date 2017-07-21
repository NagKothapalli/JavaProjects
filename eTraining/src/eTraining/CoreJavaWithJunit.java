package eTraining;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoreJavaWithJunit 
{
	//@Test
	//@Before
	//@After
	@Before
	public void intialise()
	{
		System.out.println("This is my Intialization Script");
		launchGmail();
		loginToGmail();
		
	}
	@After
	public void cleaupScript()
	{
		System.out.println("This is my CleanUp Script");
		logoutFromGmail();
		closeGmailBrowser();
		
	}
	/*@Test
	public void testCase1()
	{
		System.out.println("This is my TestCase1 ");
	}
	@Test
	public void testCase2()
	{
		System.out.println("This is my TestCase2 ");
	}*/
	public void launchGmail()
	{
		System.out.println("Lauch Gamil Component");
	}
	public void loginToGmail()
	{
		System.out.println("Login To Gamil Component");
	}
	public void logoutFromGmail()
	{
		System.out.println("logoutFromGmail Component");
	}
	public void closeGmailBrowser()
	{
		System.out.println("closeGmailBrowser Component");
	}
	@Test
	public void smokeSuite()
	{
		composeAnEmail();
		replyMail();
		sentItems();
	}
	
	@Test
	public void composeAnEmail()
	{
		System.out.println("This is composeAnEmail Test");
		//launchGmail();
		//loginToGmail();
		System.out.println("composeAnEmail and Send");
		//logoutFromGmail();
		//closeGmailBrowser();
	}
	@Test
	public void replyMail()
	{
		System.out.println("This is replyMail Test");
		//launchGmail();
		//loginToGmail();
		System.out.println("replyMail Test");
		//logoutFromGmail();
		//closeGmailBrowser();
	}
	@Test
	public void replyToAll()
	{
		System.out.println("This is replyToAll Test");launchGmail();
		//loginToGmail();
		System.out.println("replyToAll Test");
		//logoutFromGmail();
		//closeGmailBrowser();
	}
	@Test
	public void sentItems()
	{
		System.out.println("This is sentItems Test");
		//launchGmail();
		//loginToGmail();
		System.out.println("sentItems Test");
		//logoutFromGmail();
		//closeGmailBrowser();
		
	}
	@Test
	public void deletedItems()
	{
		System.out.println("This is deletedItems Test");
		//launchGmail();
		//loginToGmail();
		System.out.println("deletedItems Test");
		//logoutFromGmail();
		//closeGmailBrowser();
		
	}

}
