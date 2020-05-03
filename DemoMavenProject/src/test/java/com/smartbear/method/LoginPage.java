package com.smartbear.method;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.smartbear.object.LoginPageObject;
import com.smartbear.object.WebOrderPageObject;

public class LoginPage {
	
	
	WebDriver driver = new ChromeDriver();
	
	LoginPageObject lpo = new LoginPageObject();
	//WebOrderPageObject wopo = new WebOrderPageObject();
	
	public LoginPage(WebDriver driver) {

		//super(driver);
		PageFactory.initElements(driver, LoginPage.class);
		this.driver=driver;
	}

	public void loginSuccess() 
	{
		lpo.userName.sendKeys("Tester");
		lpo.passWord.sendKeys("test");
		lpo.loginButton.click();
	}

}
