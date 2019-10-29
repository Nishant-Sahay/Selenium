package com.assigment.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class TestBase {
	
	private static final JavascriptExecutor JavascriptExecutor = null;
	private static final BY_TYPE BY_XPATH = null;
	public static WebDriver driver = null;
	
	
	
//		public static WebDriver getWebDriver() {
//			return webDriver;
//		}
//		
//		
//		
//		public static void setWebDriver(WebDriver webDriver) {
//			TestBase.webDriver = webDriver;
//		}
//	
	
	
	
	
	
	public static enum BY_TYPE {BY_XPATH, BY_LINKTEXT, BY_ID, BY_CLASSNAME,
		BY_NAME, BY_CSSSELECTOR, BY_PARTIALLINKTEXT, BY_TAGNAME};

	
	
	public static WebDriver setMyBrowser() 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\reach\\eclipse-workspace\\Nishant\\driver\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		String baseUrl= "http://www.google.com";
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		
		
		return driver;
	
		
	}
	
	public static void scroll(WebDriver driver) {
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("scroll(0, 500);");

	    }
	
	
	

	public static void selectDropDownByIndex(By locator, int index, WebDriver driver)
	{
		try 
		{
			Select dropDown = new Select(driver.findElement(locator));
			dropDown.selectByIndex(index);

		} 
		catch (NoSuchElementException e)
		{
			e.fillInStackTrace();
			
			throw new NoSuchElementException("The element with"
					+ locator.toString().replace("By.", " ")
					+ " not found");
		}
	}
	
	
	
	
	
	
	

	public static By getLocator(String locator, BY_TYPE type,WebDriver driver){
		switch (type) {
		case BY_XPATH:
			return By.xpath(locator);
		case BY_LINKTEXT:
			return By.linkText(locator);
		case BY_ID:
			return By.id(locator);
		case BY_CSSSELECTOR:
			return By.cssSelector(locator);
		case BY_CLASSNAME:
			return By.className(locator);
		case BY_NAME:
			return By.name(locator);
		case BY_PARTIALLINKTEXT:
			return By.partialLinkText(locator);
		case BY_TAGNAME:
			return By.tagName(locator);


		}
		throw new IllegalArgumentException("Invalid By Type, Please provide correct locator type");

	}

	
		
	
	public static void click(By locator, WebDriver driver)  
	{
		try
		{
			driver.findElement(locator).click();

		}
		catch(NoSuchElementException e)
		{

			throw new NoSuchElementException("The element with"
					+ locator.toString().replace("By.", " ")
					+ " not found");
		}
	}
	
	
	
	
	
	
	
	
}
	
	
	
	
	


