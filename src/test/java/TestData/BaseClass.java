 package TestData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public	static WebDriver driver;
	
public static  WebDriver  BrowserInvoke(){	
driver = WebDriverManager.chromedriver().create();
return driver;
}
}
