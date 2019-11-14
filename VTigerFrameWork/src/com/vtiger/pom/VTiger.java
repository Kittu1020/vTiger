package com.vtiger.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.vtiger.generic.IAutoConstant;
import com.vtiger.generic.ScreenShot;

public class VTiger implements IAutoConstant {
	public VTiger(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void verifyHomePageIsDisplayed(WebDriver driver,long ETO,String title) 
			throws EncryptedDocumentException, InvalidFormatException 
	{	
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("HomePage is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("Home Page is not displayed",true);
			try {
				ScreenShot.getScreenShot(driver, title);
			}
			catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}
	public void SalesOrderPageIsDisplayed(WebDriver driver,long ETO,String title) 
			throws EncryptedDocumentException, InvalidFormatException 
	{	
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("Sales Order Page is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("Sales Order Page is not displayed",true);
			try {
				ScreenShot.getScreenShot(driver, title);
			}
			catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}
	public void SalesOrderPageIsDisplayed1(WebDriver driver,long ETO,String title) 
			throws EncryptedDocumentException, InvalidFormatException 
	{	
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("Newly Created Sales Order  is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("Newly Created Sales Order  is not displayed",true);
			try {
				ScreenShot.getScreenShot(driver, title);
			}
			catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}

}
