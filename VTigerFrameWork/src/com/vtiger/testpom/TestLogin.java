package com.vtiger.testpom;

import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.vtiger.generic.BaseTest;
import com.vtiger.generic.Excel;
import com.vtiger.pom.LoginPage;
import com.vtiger.pom.VTiger;

public class TestLogin extends BaseTest{
	@Test
	public static void validLogin() throws EncryptedDocumentException, InvalidFormatException, Exception
	{
	String un = Excel.getData(XL_PATH,SHEET_NAME,1,0);
	String pwd = Excel.getData(XL_PATH,SHEET_NAME,1,1);
	String title= Excel.getData(XL_PATH,SHEET_NAME,1,2);
	LoginPage lp = new LoginPage(driver);
	lp.inputUN(un);
	lp.inputPWD(pwd);
	lp.loginClick();
	System.out.println(un +"	"+pwd+"	"+ title);
	VTiger ett = new VTiger(driver);
	ett.verifyHomePageIsDisplayed(driver, 5 , title);
	lp.more();                                          
	lp.salesOrder();
	lp.plusClick();
	String name = Excel.getData(XL_PATH, SHEET_NAME, 2, 0);
	lp.subjectText(name);
	lp.status();
	lp.assigned();
	lp.organization();
	String parent = driver.getWindowHandle();
	Set<String> subtab = driver.getWindowHandles();
	for(String name1:subtab)
	{
		driver.switchTo().window(name1);
	}
	lp.popup();
	driver.switchTo().alert().accept();
	driver.switchTo().window(parent);
	lp.invoice();
	lp.itemName();
	String parent1 = driver.getWindowHandle();
	Set<String> subtab1 = driver.getWindowHandles();
	for(String name2:subtab1)
	{
		driver.switchTo().window(name2);
	}
	lp.popItem();
	driver.switchTo().window(parent1);
	String qty = Excel.getData(XL_PATH, SHEET_NAME, 3, 0);
	lp.quantity(qty);
	lp.savebutton();
	String title1 = Excel.getData(XL_PATH, SHEET_NAME, 2, 2);
	VTiger ett1 = new VTiger(driver);
	ett1.SalesOrderPageIsDisplayed1(driver, 5, title1);
	Thread.sleep(2000);
	lp.more();
	lp.salesOrder();
	lp.checkBox();
	lp.deleteBtn();
	driver.switchTo().alert().accept();
	}
}
