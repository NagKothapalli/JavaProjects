package InheritenceByInstance;

import org.junit.Test;

public class TestSuites 
{
	TestCases _tc = new TestCases();
	@Test
	public void smokeSuite()
	{
		_tc.composeAnEmail();
		_tc.replyMail();
	}
	@Test
	public void regressionSuite()
	{
		_tc.composeAnEmail();
		_tc.replyMail();
		_tc.replyToAll();
		_tc.sentItems();
		_tc.deletedItems();
	}
}
