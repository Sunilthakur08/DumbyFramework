package com.crm.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateContactTest {

	@Test (groups ="SmokeTest")
	public void createContact()
	{

		System.out.println("created contact successfully");
	}

	@Test (groups = "RegressionTest")
	public void	modifyContact()
	{
		System.out.println("Modified contact");
	}
}
