package com.jtv.qa.util;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil {
	WebDriver driver;
	public static long imp_wait=30;
	
	public static void takeSS(WebDriver driver, String ScreenShotName)
	{
		try 
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
	    File des=new File("./Shots/"+ScreenShotName+".png");
	    FileUtils.copyFile(src,des);
	    System.out.println("Screenshot taken");
		} 
		catch (IOException e) {
			
			System.out.println("Error while printing screenshot= "+ e.getMessage());
		}
	

	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


