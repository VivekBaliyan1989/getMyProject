package PageMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import PageObject.CustomerPageObject;

public class CustomerPageMethod {
	
	public WebDriver driver;
	
	public CustomerPageObject acp = new CustomerPageObject();
	

	public CustomerPageMethod(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,acp);
	}
	
	public String getPageTitle() {
		
		return driver.getTitle();
				
	}
	
	public void clickOnCustomermenu()
	{
		//System.out.println("Driver"+driver);
		acp.lkhCustomer_menu.click();
	}
	
	public void clickOnCustomermenuitem() 
	{
	
		acp.lkhCustomer_menuitem.click();
	}
	
	public void clickOnAddbtn() {
		acp.btnAddNew.click();
	}
	
	public void setEmail(String email) 
	{
		
		acp.txtEmail.sendKeys(email);
	}
	
	public void setPassword(String passwoed) 
	{
		acp.txtPassword.sendKeys(passwoed);
	}
	
	public void setFirestName(String firestName) 
	{
		acp.txtFirestName.sendKeys(firestName);
	}
	
	public void setLastName(String lastName) 
	{
		acp.txtLastName.sendKeys(lastName);
	}
	
	public void clickOnGender(String gender) 
	{
		if(gender.equals("Male"))
		{
			acp.rdMaleGender.click();
			
		}else if (gender.equals("Female")) {
			
			acp.rdFemaleGender.click();
			
		} else {
			acp.rdMaleGender.click();//Default
		}
		
	}
	public void setDOB(String DOB)
	{
		acp.txtDOB.sendKeys(DOB);
	}
	
	public void setCustomerRole(String role) throws InterruptedException 
	{
		acp.txtCustomer_roles.click();
		
		if(role.equals("Vendors"))
		{
			driver.findElement(By.xpath("//ul[@id='SelectedCustomerRoleIds_taglist']/li/span[@class='k-icon k-delete']")).clear();
		}
		
		//Thread.sleep(3000);
		
		if(role.equals("Administrators"))
		{
			acp.lstitemAdministrators.click();
		}else if(role.equals("Forum Moderators"))
		{
			acp.lstitemForum_Moderators.click();
		}else if(role.equals("Guests"))
		{
			acp.lstitemGuests.click();
		}else if(role.equals("Registered"))
		{
			acp.lstitemRegistered.click();
		}else if(role.equals("Vendors"))
		{
			acp.lstitemVendors.click();
		}else
		{
			acp.lstitemAdministrators.click();
		}
		
	}
		
	public void setManagerOfVendor(String value)
	{
		Select sel = new Select(acp.drpVendor);
		
		sel.selectByValue(value);
	}
		
	
	public void setCompany(String company) 
	{
		acp.txtNameCompany.sendKeys(company);
	}
	
	public void setAdminComment(String comment) 
	{
		acp.txtAdminComment.sendKeys(comment);
	}
	
	public void setSubmit() {
		acp.btnSubmit.click();
	}

}
