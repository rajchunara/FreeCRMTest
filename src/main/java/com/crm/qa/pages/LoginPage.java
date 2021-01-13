package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath= "//*[text()='Login']")
	WebElement loginBtn;
	
	
	//Initialize all the web elements of this class by finding it on the webpage
	//using the driver we are providing using PageFactory.initElements
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	public void login(String Email, String pwd) {
		email.sendKeys(Email);
		password.sendKeys(pwd);
		
		loginBtn.click();
	};
	

}
