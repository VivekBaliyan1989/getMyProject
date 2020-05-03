package com.smartbear.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject 
{

	@FindBy(id="ctl00_MainContent_username")
	public WebElement userName;
	
	@FindBy(id="ctl00_MainContent_password")
	public WebElement passWord;
	
	@FindBy(id="ctl00_MainContent_login_button")
	public WebElement loginButton;
	
	
}
