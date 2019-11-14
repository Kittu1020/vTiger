package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="user_name")
	private WebElement un;
	@FindBy(name="user_password")
	private WebElement pwd;	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginBtn;
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='More']")
	private WebElement more;
	@FindBy(xpath="//a[@name='Sales Order']")
	private WebElement sale;
	@FindBy(xpath="//img[@alt='Create Sales Order...']")
	private WebElement plus;
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subject;
	@FindBy(xpath="//select[@name='sostatus']/descendant::option[@value='Created']")
	private WebElement stat;
	@FindBy(xpath="//tr/td[@class='dvtCellInfo']/input[@type='radio']/following::span[@id='assign_user']")
	private WebElement assign;
	@FindBy(xpath="//tr/td[@class='dvtCellInfo']//input[@id='single_accountid']/following::img[@title='Select']")
	private WebElement org;
	@FindBy(xpath="//td/a[@id='1']")
	private WebElement tab;
	@FindBy(xpath="//tr/td[@class='dvtCellInfo']/select[@name='invoicestatus']/option[@value='AutoCreated']")
	private WebElement in;
	@FindBy(xpath="//td/img[@id='searchIcon1']")
	private WebElement item;
	@FindBy(xpath="//td/a[@id='popup_product_3']")
	private WebElement ipop;
	@FindBy(xpath="//td/input[@id='qty1']")
	private WebElement quan;
	@FindBy(xpath="//tr/td//input[@value='  Save  ']")
	private WebElement save;
	@FindBy(xpath="(//table[@class='lvt small']/descendant::input)[6]")
	private WebElement check;
	@FindBy(xpath="//table[@class='small']//td/input[@value='Delete']")
	private WebElement del;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inputUN(String text)
	{
		un.sendKeys(text);	
	}
	public void inputPWD(String text)
	{
		pwd.sendKeys(text);	
	}
	public void loginClick()
	{
		loginBtn.click();
	}
	public void more() {
		more.click();
	}
	public void salesOrder() {
		sale.click();
	}
	public void plusClick() {
		plus.click();
	}
	public void subjectText(String text) {
		subject.sendKeys(text);
	}
	public void status() {
		stat.click();
	}
	public void assigned() {
		assign.click();
	}
	public void organization() {
		org.click();
	}
	public void popup() {
		tab.click();
	}
	public void invoice() {
		in.click();
	}
	public void itemName() {
		item.click();
	}
	public void popItem() {
		ipop.click();
	}
	public void quantity(String text) {
		quan.sendKeys(text);
	}
	public void savebutton() {
		save.click();
	}
	public void checkBox() {
		check.click();
	}
	public void deleteBtn() {
		del.click();
	}
}

