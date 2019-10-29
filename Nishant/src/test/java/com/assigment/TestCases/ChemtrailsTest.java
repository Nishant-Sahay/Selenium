package com.assigment.TestCases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assigment.Actions.ChemtralistMethod;
import com.assigment.base.TestBase;

public class ChemtrailsTest extends ChemtralistMethod{


	WebDriver driver;
	


	@BeforeMethod
	public void beforemethod() throws MalformedURLException {
		
		TestBase.setMyBrowser();
		
		
		
		
	}
	
	
	@Test
	public void ChemtrailsTest() throws Exception{
		
		
		btn_search(driver);
		
		
	}
	
	
	
	
	
}
