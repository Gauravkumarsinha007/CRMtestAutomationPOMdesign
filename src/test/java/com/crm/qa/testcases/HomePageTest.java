package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TaskPage;
import com.crm.qa.pages.TextSmsPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage; 
	HomePage  homepage;
	ContactsPage contactspage;
	DealsPage dealslink;
	TaskPage tasklink;
	TextSmsPage textsmslink;
	TestUtil testutil;
	public HomePageTest() 
	 {
		 		super();
	 }
	
	
	@BeforeMethod
	public void setup()
	{
		intialization();
		testutil = new TestUtil();
		contactspage = new ContactsPage();
		dealslink =new DealsPage();
		tasklink = new TaskPage();
		textsmslink =new TextSmsPage();
		
		 loginPage= new LoginPage();	
		 homepage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	@Test(priority=1)
	public void verifyhomepagetitleTest()
	{
		String homepagetitle= homepage.verifyhomepageTitle();
		Assert.assertEquals(homepagetitle, "CRMPRO","Home page title is not match");
		}
	
	@Test(priority=2)
	public void verifyusernameTest()
	{
		testutil.switchtoframe();
		Assert.assertTrue(homepage.verifyusername());
	}
	
	@Test(priority=3)
	public void verifycontactlinkTest()
	{
		testutil.switchtoframe();
		contactspage=homepage.clickoncontactlist();
	}
	
	@Test(priority=4)
	public void verifyDeallinkTest()
	{
		testutil.switchtoframe();
		dealslink=homepage.clickondealslink();
	}
	
	@Test(priority=5)
	public void verifytasklink()
	{
		testutil.switchtoframe();
		tasklink=homepage.clickonTaskslink();
	}
	
	@Test(priority=6)
	public void verifytexttasklink()
	{
		testutil.switchtoframe();
		textsmslink=homepage.clickontextsmslink();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
