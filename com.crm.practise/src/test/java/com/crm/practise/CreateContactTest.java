package com.crm.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateContactTest {

	@Test (groups ="SmokeTest")
	public void createContact()
	{
		WebDriver driver=null;
		String Browser = System.getProperty("browser");
		String url = System.getProperty("url");

		if(Browser.equalsIgnoreCase("chrome"))
		{
			driver =  new ChromeDriver();
			driver.get(url);
		}
		else if (Browser.equalsIgnoreCase("fireFox"))
		{
			driver = new FirefoxDriver();
		}

		System.out.println("created contact successfully");
	}

	@Test (groups = "RegressionTest")
	public void	modifyContact()
	{
		System.out.println("Modified contact");
	}
}
