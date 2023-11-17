package Stepdefinination;

import org.openqa.selenium.chrome.ChromeDriver;

import Pageobject.Loginpage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef1 extends BaseClass{
	
	
	@When("user open the browser")
	public void user_open_the_browser() {
	   System.setProperty("webdriver.chrome.driver", "D\\:chromedriver.exe");
	   driver = new ChromeDriver();
	}

	@When("Hits the given {string} into the browser")
	public void hits_the_given_into_the_browser(String string) {
		 driver.get("file:///D:/JBK/Anuradha/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	}

	@Then("User login page should open")
	public void user_login_page_should_open() {
	   String acttitle=driver.getTitle();
	   String exptitle ="JavaByKiran|Log in";
	   
	   if (acttitle==exptitle) {
		   System.out.println("Title Matched");
	   }
	   else {
		   System.out.println("Title not Matched");
	   }
	   
	}

	@When("user enter the {string} and {string}")
	public void user_enter_the_and(String string, String string2) {
		lg = new Loginpage(driver);
		lg.enterdetails(string, string2);
	   
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
	    lg.clickonbutton();
	}

	@Then("user should display the Dashboard page")
	public void user_should_display_the_dashboard_page() {
	   String title= driver.getTitle();
	    System.out.println("Title of page after login to the app: "+title);
	}


}
