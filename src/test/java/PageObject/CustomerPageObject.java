package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPageObject {
	
	public WebDriver driver;
	
	
	/*public CustomerPageObject(WebDriver rdriver)
	{
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}*/
	
	//@FindBy(xpath ="(//li[@class='treeview']//span[text()='Customers'])[1]/following-sibling::i[@class='fa fa-angle-left pull-right']")
	
	@FindBy(xpath="(//span[text()='Customers'])[1]//following-sibling::i")
	@CacheLookup
	public WebElement lkhCustomer_menu;
	
	@FindBy(xpath="//a[@class='menu-item-link']//span[text()='Customers']")
	@CacheLookup
	public WebElement lkhCustomer_menuitem;
	
	@FindBy(xpath="//a[@class='btn bg-blue']")
	@CacheLookup
	public WebElement btnAddNew;
	
	@FindBy(id="Email")
	@CacheLookup
	public WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	public WebElement txtPassword;
	
	@FindBy(id="FirstName")
	@CacheLookup
	public WebElement txtFirestName;
	
	@FindBy(id="LastName")
	@CacheLookup
	public WebElement txtLastName;
	
	@FindBy(id="Gender_Male")
	@CacheLookup
	public WebElement rdMaleGender;
	
	@FindBy(id="Gender_Female")
	@CacheLookup
	public WebElement rdFemaleGender;
	
	@FindBy(id="DateOfBirth")
	@CacheLookup
	public WebElement txtDOB;
	
	@FindBy(id="Company")
	@CacheLookup
	public WebElement txtNameCompany;
	
	@FindBy(id="IsTaxExempt")
	@CacheLookup
	public WebElement chkIsTaxExempt;
	
	@FindBy(xpath="//input[@name='SelectedNewsletterSubscriptionStoreIds'][@value='1']")
	@CacheLookup
	public WebElement chkNewsletter1;
	
	@FindBy(xpath="//input[@name='SelectedNewsletterSubscriptionStoreIds'][@value='2']")
	@CacheLookup
	public WebElement chkNewsletter2;
	
	@FindBy(xpath="//ul[@id='SelectedCustomerRoleIds_taglist']/li/span[1]")
	@CacheLookup
	public WebElement txtCustomer_roles;
	
	@FindBy(xpath="//li[contains(text(),'Administrators')]")
	@CacheLookup
	public WebElement lstitemAdministrators;
	
	@FindBy(xpath="//li[contains(text(),'Forum Moderators')]")
	@CacheLookup
	public WebElement lstitemForum_Moderators;
	
	@FindBy(xpath="//li[contains(text(),'Guests')]")
	@CacheLookup
	public WebElement lstitemGuests;
	
	@FindBy(xpath="//li[contains(text(),'Registered')]")
	@CacheLookup
	public WebElement lstitemRegistered;
	
	@FindBy(xpath="//li[contains(text(),'Vendors')]")
	@CacheLookup
	public WebElement lstitemVendors;
	
	@FindBy(id="VendorId")
	@CacheLookup
	public WebElement drpVendor;
	
	@FindBy(id="AdminComment")
	@CacheLookup
	public WebElement txtAdminComment;
	
	@FindBy(xpath="//button[@name='save']")
	@CacheLookup
	public WebElement btnSubmit;
	

}
