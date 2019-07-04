package com.jtv.qa.TestCases;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jtv.qa.baseClass.BaseClass;
import com.jtv.qa.pages.CreateAccountPage;
import com.jtv.qa.pages.HomePage;

public class HomePageTest extends BaseClass {
	HomePage h;
	CreateAccountPage c;
	
	@BeforeMethod
	public void setUp()
	{
		BaseClass.initialize("chrome");
		 h=new HomePage();
	}
	
	@Test
	public void goToCreatePage()
	{
	   c = h.goToCreateAccountPage();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
