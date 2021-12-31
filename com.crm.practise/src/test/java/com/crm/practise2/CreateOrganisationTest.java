package com.crm.practise2;

import org.testng.annotations.Test;

public class CreateOrganisationTest {
	@Test (groups ="SmokeTest")
	public void createOrg()
	{
		System.out.println("created org successfully");
	}

	@Test (groups ="RegressionTest")
	public void	modifyOrg()
	{
		System.out.println("Modified org");
	}
}
