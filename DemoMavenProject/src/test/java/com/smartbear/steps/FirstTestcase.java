package com.smartbear.steps;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.smartbear.method.LoginPage;

public class FirstTestcase 
{
	
	LoginPage lp ;//= new LoginPage();
	@Test
	public void Login()
	{
		
		
		  System.setProperty("webdriver.chrome.driver",
		  "F:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		 
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		lp.loginSuccess();
		
		
		
	}
}
