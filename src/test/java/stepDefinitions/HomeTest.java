package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Objects.homeObject;
import TestData.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeTest extends BaseClass{
	public static WebDriver driver;
	
	 @Given("^Access the url \"([^\"]*)\"$")
	    public void access_the_url_something(String strArg1) throws Throwable {
	        driver = BaseClass.BrowserInvoke();
	        driver.get(strArg1);
	    }

	@When("Page loads the page")
	public void page_loads_the_page() {
	driver.getCurrentUrl();
	}

	@Then("Maximize the page")
	public void maximize_the_page() {
	  driver.manage().window().maximize();
	}

	@Then("check the customer service {string}")
	public void check_the_customer_service(String string) {
	  homeObject ho = new homeObject(driver);
	  String callNumber = ho.callNumber().getAttribute("href");
	  System.out.println(callNumber);
	}



}
