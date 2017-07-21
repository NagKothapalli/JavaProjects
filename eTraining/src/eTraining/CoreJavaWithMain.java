package eTraining;

public class CoreJavaWithMain
{
	int rollNumber;
	int _rollNum;
	int $num;
	//int %num;
	
	public static void main(String args[])
	{
		System.out.println("Gmail With PSVM");
		runTestSuite("regression");
		//smokeSuite();
		//regressionSuite();
		/*composeAnEmail();
		replyMail();
		replyToAll();
		sentItems();
		deletedItems();*/
		//all class members should follow camel casing
		//all class members should start with _  or $
		//all class members can start with a-z  or A-Z
		//return 22;
	}
		public static void launchGmail()
		{
			System.out.println("Lauch Gamil Component");
		}
		public static void loginToGmail()
		{
			System.out.println("Login To Gamil Component");
		}
		public static void logoutFromGmail()
		{
			System.out.println("logoutFromGmail Component");
		}
		public static void closeGmailBrowser()
		{
			System.out.println("closeGmailBrowser Component");
		}
		
		public static void runTestSuite(String testSuite)
		{
			if(testSuite.equals("smoke"))
			{
				smokeSuite();
			}
			else
			{
				regressionSuite();
			}
		}
		
		public static void smokeSuite()
		{
			composeAnEmail();
			replyMail();
		}
		
		public static void regressionSuite()
		{
			composeAnEmail();
			replyMail();
			replyToAll();
			sentItems();
			deletedItems();
		}
		
		public static void composeAnEmail()
		{
			System.out.println("This is composeAnEmail Test");
			launchGmail();
			loginToGmail();
			System.out.println("composeAnEmail and Send");
			logoutFromGmail();
			closeGmailBrowser();
		}
		public static void replyMail()
		{
			System.out.println("This is replyMail Test");
			launchGmail();
			loginToGmail();
			System.out.println("replyMail Test");
			logoutFromGmail();
			closeGmailBrowser();
		}
		public static void replyToAll()
		{
			
			System.out.println("This is replyToAll Test");
			launchGmail();
			loginToGmail();
			System.out.println("replyToAll Test");
			logoutFromGmail();
			closeGmailBrowser();
			
		}
		public static void sentItems()
		{
			System.out.println("This is sentItems Test");
			launchGmail();
			loginToGmail();
			System.out.println("sentItems Test");
			logoutFromGmail();
			closeGmailBrowser();
			
		}
		public static void deletedItems()
		{
			System.out.println("This is deletedItems Test");
			launchGmail();
			loginToGmail();
			System.out.println("deletedItems Test");
			logoutFromGmail();
			closeGmailBrowser();
			
		}
		
	
}


