package PageDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import PageMethod.CustomerPageMethod;
import PageObject.LoginPage;
import cucumber.api.java.en.*;

public class CustomerPageSteps extends CommonFeature {
	

	@Given("^User launch browser$")
	public void user_launch_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		lp = new LoginPage(driver);
		addCust = new CustomerPageMethod(driver);
	}

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String url) throws Throwable {
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("^User Enter Email \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_Enter_Email_and_Password(String email, String password) throws Throwable {
		lp.setEmail(email);
		lp.setPassword(password);
	}

	@When("^User Click on Login$")
	public void user_Click_on_Login() throws Throwable {
		lp.clickLogin();
	}

	@Then("^Page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String title) throws Throwable {
	    if (driver.getPageSource().contains("Login was unsuccessful."))
	    {
	    	driver.close();
	    	Assert.assertTrue(false);
	    }else {
			Assert.assertEquals(title, driver.getTitle());
		}

	}

	@When("^User click on Logout$")
	public void user_click_on_Logout() throws Throwable {
		lp.clickLogout();
		
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
	}
	
	//Customer feature step definitions 
	
	@Then("^User can view Dashbord$")
	public void user_can_view_Dashbord() throws Throwable {
	    
		//addCust = new CustomerPageMethod(driver);
		
		if (driver.getPageSource().contains("Login was unsuccessful."))
	    {
	    	driver.close();
	    	Assert.assertTrue(false);
	    }else {
			Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
		}
	}

	@When("^User click on customers menu$")
	public void user_click_on_customers_menu() throws Throwable {
		//Thread.sleep(10000);
	   addCust.clickOnCustomermenu();
	   
	}

	@When("^Click on customers menu item$")
	public void click_on_customers_menu_item() throws Throwable {
	    addCust.clickOnCustomermenuitem();
	}

	@When("^Click on Add new button$")
	public void click_on_Add_new_button() throws Throwable {
	    addCust.clickOnAddbtn();
	}

	@Then("^User can view add new customers page$")
	public void user_can_view_add_new_customers_page() throws Throwable {
		
			Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	}

	@When("^User enter customer info$")
	public void user_enter_customer_info() throws Throwable {
		String email = randomstring()+"@gmail.com"; // Get random value from CommonFeature class
		addCust.setEmail(email);
		addCust.setPassword("test123");
		addCust.setFirestName("Rajan");
		addCust.setLastName("Roy");
		addCust.clickOnGender("Male");
		addCust.setDOB("07/20/1989"); //mm/dd/yyyy
		addCust.setCompany("busyQA");
		addCust.setCustomerRole("Guest");
		addCust.setManagerOfVendor("1");
		addCust.setAdminComment("This is used for testing purpose............ ");
	}

	@When("^Click on Save button$")
	public void click_on_Save_button() throws Throwable {
	   addCust.setSubmit();
	}

	@Then("^User can view conformation message \"([^\"]*)\"$")
	public void user_can_view_conformation_message(String mag) throws Throwable {
	    
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
		
	}

}
