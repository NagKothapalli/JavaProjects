package InheritenceByExtends;

public class TestCases extends ReusableComponents
{
	public void composeAnEmail()
	{
		System.out.println("This is composeAnEmail Test");
		launchGmail();
		loginToGmail();
		inbox();
		composeAndSend();
		logoutFromGmail();
		closeGmailBrowser();
	}
	
	public void replyMail()
	{
		System.out.println("This is replyMail Test");
		launchGmail();
		loginToGmail();
		inbox();
		openMail();
		reply();
		logoutFromGmail();
		closeGmailBrowser();
	}
	
	public void replyToAll()
	{
		System.out.println("This is replyToAll Test");
		launchGmail();
		loginToGmail();
		inbox();
		openMail();
		replyAll();
		logoutFromGmail();
		closeGmailBrowser();
	}
	
	public void sentItems()
	{
		System.out.println("This is sentItems Test");
		launchGmail();
		loginToGmail();
		inbox();
		openMail();
		replyAll();
		sent();
		logoutFromGmail();
		closeGmailBrowser();
		
	}
	
	public void deletedItems()
	{
		System.out.println("This is deletedItems Test");
		launchGmail();
		loginToGmail();
		inbox();
		openMail();
		replyAll();
		delete();
		logoutFromGmail();
		closeGmailBrowser();
		
	}
}
