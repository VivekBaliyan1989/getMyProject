package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver rdriver)
	{
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	public WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	public WebElement txtPassword;
	
	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	public WebElement btnSubmit;
	
	@FindBy(linkText = "Logout")
	@CacheLookup
	public WebElement lnkLogout;
	
	public void setEmail(String email)
	{
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() 
	{
		btnSubmit.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	

}
