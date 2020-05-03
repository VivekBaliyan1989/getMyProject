package PageDefination;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageMethod.CustomerPageMethod;
import PageObject.LoginPage;

public class CommonFeature {
	
	public WebDriver driver;
	public LoginPage lp;
	public CustomerPageMethod addCust;
	
	
	//created for generated random string for unique email
	public static String randomstring() {
		
		String genratedString = RandomStringUtils.randomAlphabetic(5);
		
		return(genratedString);
		
	}

}
