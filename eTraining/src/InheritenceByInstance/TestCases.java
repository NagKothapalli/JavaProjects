package InheritenceByInstance;

public class TestCases 
{
	ReusableComponents _rc = new ReusableComponents();
	public void composeAnEmail()
	{
		System.out.println("This is composeAnEmail Test");
		_rc.launchGmail();
		_rc.loginToGmail();
		_rc.inbox();
		_rc.composeAndSend();
		_rc.logoutFromGmail();
		_rc.closeGmailBrowser();
	}
	
	public void replyMail()
	{
		System.out.println("This is replyMail Test");
		_rc.launchGmail();
		_rc.loginToGmail();
		_rc.inbox();
		_rc.openMail();
		_rc.reply();
		_rc.logoutFromGmail();
		_rc.closeGmailBrowser();
	}
	
	public void replyToAll()
	{
		System.out.println("This is replyToAll Test");
		_rc.launchGmail();
		_rc.loginToGmail();
		_rc.inbox();
		_rc.openMail();
		_rc.replyAll();
		_rc.logoutFromGmail();
		_rc.closeGmailBrowser();
	}
	
	public void sentItems()
	{
		System.out.println("This is sentItems Test");
		_rc.launchGmail();
		_rc.loginToGmail();
		_rc.inbox();
		_rc.openMail();
		_rc.replyAll();
		_rc.sent();
		_rc.logoutFromGmail();
		_rc.closeGmailBrowser();
	}
	
	public void deletedItems()
	{
		System.out.println("This is deletedItems Test");
		_rc.launchGmail();
		_rc.loginToGmail();
		_rc.inbox();
		_rc.openMail();
		_rc.replyAll();
		_rc.delete();
		_rc.logoutFromGmail();
		_rc.closeGmailBrowser();
		
	}
}
