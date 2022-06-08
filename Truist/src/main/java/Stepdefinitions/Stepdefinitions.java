package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitions {
	 WebDriver driver;
	 SheredStepsUI sharedStepsUI;
	 String name;
	 String psword;
	 
	// SheredStepsUI sharedStepsUI;
	 public Stepdefinitions() {
	 //SheredStepsUI sharedStepsUI =new SheredStepsUI();
		 sharedStepsUI  =new SheredStepsUI();
	        }
	 
	 
	@Given("I am on facebook sign-in page")
	public void i_am_on_facebook_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
		  String windows =System.getProperty("user.dir");
		  System.out.println(windows);
		  System.setProperty("webdriver.chrome.driver", windows+"\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  driver.manage().window().maximize();
	}

	@When("I entered username {string} into field")
	public void i_entered_username_into_field(String name) {
	    
	   System.out.println("This is username="+name);
	  //driver.findElement(By.id("email")).sendKeys("name");
	   sharedStepsUI.Email(name);
	   //this.name=name;
	   
	   
	   
	}

	@And("I entered password {string} into field")
	public void i_entered_password_into_field(String psword) {
	    
		System.out.println("This is pssword="+psword);
		//driver.findElement(By.id("pass")).sendKeys("psword");
		sharedStepsUI.PsswordsFieldsEnters(psword);
       //this.psword=psword;
	}

	@And("I clickedd on sign-in button")
	public void i_clickedd_on_sign_in_button() {
	    
		//driver.findElement(By.name("login")).click();
		
		sharedStepsUI.LoginButton();
	}

	@Then("User logged-in successfully")
	public void user_logged_in_successfully() {
	    
	   
	}
}
