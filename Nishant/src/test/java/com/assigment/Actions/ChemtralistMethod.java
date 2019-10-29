package com.assigment.Actions;

import com.assigment.PageLocator.Chemtrails1;
import com.assigment.base.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;


public class ChemtralistMethod implements Chemtrails1 {
	
	static By locator;
	

	
	public void btn_search(WebDriver driver) throws Exception {
		
		locator = TestBase.getLocator(btn_search, TestBase.BY_TYPE.BY_NAME, driver);
		//TestBase.click(locator, driver);
		
		driver.findElement(locator).sendKeys("chemtrails");
		
	}
	
	
	

	
	
	

	
	
	
}
