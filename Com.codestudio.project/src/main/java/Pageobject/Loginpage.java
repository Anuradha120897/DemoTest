package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	
	public Loginpage(WebDriver dv){
		
		PageFactory.initElements(dv, this);
	
	}
	
	
	@FindBy(id="email")
	WebElement emailid;
	
	@FindBy(id="password")
	WebElement password;

	@FindBy(xpath="//button")
	WebElement click_on_signin_button;
	
	
	public void enterdetails(String email,String pass) {
		emailid.sendKeys(email);
		password.sendKeys(pass);
	}
	
	public void clickonbutton() {
		click_on_signin_button.click();
	}
}
