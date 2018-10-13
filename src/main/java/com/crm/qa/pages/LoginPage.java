package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

//page factory - object repositry 

@FindBy (xpath = "//input[@placeholder='Username']")
WebElement username;

@FindBy (xpath = "//input[@placeholder='Password']")
WebElement password;

@FindBy (xpath = "//input[@type='submit']")
WebElement loginbtn;

@FindBy (xpath = "//font[text()='Sign Up']")
WebElement signupbtn;

@FindBy (xpath = "//img[@src='https://d19rqa8v8yb76c.cloudfront.net/img/freecrm.jpg']")
WebElement crmlogo;


//intialziling the page objects 
public LoginPage()
{
	PageFactory.initElements(driver, this);
}

//Actions 
public String validateLoginpageTitel()
{
	return driver.getTitle();
}

public Boolean validateCrmImage()
{
	return crmlogo.isDisplayed();
}

public HomePage login(String UN, String PWD)
{
	username.sendKeys(UN);
	password.sendKeys(PWD);
	//loginbtn.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", loginbtn);
	return new HomePage();
	
}
}
