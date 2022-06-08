package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SheredStepsUI {
	WebDriver driver; 
	
	
	
	
	@FindBy(name= "email") WebElement Email;
	@FindBy(name= "pass") WebElement Pass;
	@FindBy(name= "login") WebElement Login;
	
	public void SharedStepsUI(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver, this);
    }
	
	public void Email(String name) {
		Email.sendKeys(name);
	}
	public void PsswordsFieldsEnters(String psword) {
		Pass.sendKeys(psword);
	}
	
	public void LoginButton() {
		Login.click();
	}
	
	
	
	

	    
		@Before
	    public void beforeClass() {
	        String browser = "Chrome";
	        
	    }

	    @After
	    public void afterClass() {
	        driver.close();
	    }

	    
	    
	  

}
