package com.jtv.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jtv.qa.baseClass.BaseClass;

public class CreateAccountPage extends BaseClass{
	public CreateAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='firstName']") WebElement fn;
	@FindBy(xpath="//input[@id='lastName']") WebElement ln ;
	@FindBy(xpath="//input[@id='email']") WebElement email ;
	@FindBy(xpath="//input[@type='tel']") WebElement tel ;
	@FindBy(xpath="//input[@id='password']") WebElement pwd ;
	@FindBy(xpath="//input[@id='password-confirm']") WebElement cpwd ;
	@FindBy(xpath="//input[@type='submit']") WebElement submit;
	
	public void createAnAccount()
	{
		fn.sendKeys("vaishnu");
		ln.sendKeys("gundu");
		email.sendKeys("vm@gmail.com");
		tel.sendKeys("1234567899");
		pwd.sendKeys("test123");
		cpwd.sendKeys("test123");
		submit.click();
		
	}

}
