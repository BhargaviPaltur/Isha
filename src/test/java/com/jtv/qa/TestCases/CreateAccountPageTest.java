package com.jtv.qa.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jtv.qa.baseClass.BaseClass;
import com.jtv.qa.pages.CreateAccountPage;
import com.jtv.qa.pages.HomePage;

public class CreateAccountPageTest extends BaseClass{
	CreateAccountPage c;
	HomePage h;
	
	@BeforeMethod
	public void startBrowser()
	
	{
		BaseClass.initialize("chrome");
	    c=new CreateAccountPage();
	     h=new HomePage();
	     c=	  h.goToCreateAccountPage();
	}
	
	@Test
	public void letsLogin()
	{
		c.createAnAccount();
	}

}
