package InheritenceByExtends;

import org.junit.Test;

public class TestingType extends TestCases
{
	@Test
	public void smokeSuite()
	{
		composeAnEmail();
		replyMail();
	}
	@Test
	public void regressionSuite()
	{
		composeAnEmail();
		replyMail();
		replyToAll();
		sentItems();
		deletedItems();
	}

}
