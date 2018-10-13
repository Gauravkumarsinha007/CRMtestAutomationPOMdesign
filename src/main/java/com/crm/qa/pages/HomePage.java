package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	
	//page factory - object repositry 
	
	@FindBy (xpath="//td[contains(text(),'User: gaurav kumar')]")
	WebElement username;
	
	@FindBy (xpath= "//a[contains(text(),'Contacts')]")
	WebElement contactlink;
	
	@FindBy (xpath = "//a[contains(text(),'Deals')]")
	WebElement Dealslink;
	
	@FindBy (xpath= "//a[contains(text(),'Tasks')]")
	WebElement Tasklink;
	
	
	@FindBy (xpath = "//a[@title='Text/SMS']")
	WebElement TextSmsLink;
	
	//intialziling the page objects 
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Boolean verifyusername()
	{
		return username.isDisplayed();
	}
	
	
	public String verifyhomepageTitle()
	{
		return driver.getTitle();
	}
	
	public ContactsPage clickoncontactlist()
	{
		contactlink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickondealslink()
	{
		Dealslink.click();
		return new DealsPage();
	}
	
	public TaskPage clickonTaskslink()
	{
		Tasklink.click();
		return new TaskPage();
	}
	
	public TextSmsPage clickontextsmslink()
	{
		TextSmsLink.click();
		return new TextSmsPage();
	}
	
	
}
