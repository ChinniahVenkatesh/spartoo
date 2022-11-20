package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homeObject {
	public static WebDriver driver;
	public homeObject(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	 
	@FindBy(xpath = "//a[@id='callNumber']")
	WebElement callNumber;
	
	public WebElement callNumber()
	{
		return callNumber;
	}
	
	
	
	
	}
	


