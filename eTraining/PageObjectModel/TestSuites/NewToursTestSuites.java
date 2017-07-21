package TestSuites;

import org.junit.Test;

import TestScenarios.NewToursScenarios;

public class NewToursTestSuites extends NewToursScenarios
{
	
	@Test
	public void smokeSuite()
	{
		bookOnewayAirTravel();
		//bookCruiseWithAirTravel();
	}

}
