package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage; 
	HomePage homepage;
	 public LoginPageTest() 
	 {
		 		super();
	 }
	
	
	@BeforeMethod
	public void setup()
	{
		intialization();
		 loginPage= new LoginPage();		
		
	}

	
	
	@Test(priority=1)
	public void logintestTitleTest()
	{
	String verifytitle=loginPage.validateLoginpageTitel();	
	Assert.assertEquals(verifytitle, "#1 Free CRM software in the cloud for sales and service");	
	}
	
	@Test(priority=2)
	public void CrmLogoTest()
	{
		Boolean flag = loginPage.validateCrmImage();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=3)
	public void LoginTest()
	{
		homepage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown()
	{
		//close browser
		driver.quit();
	}







}
