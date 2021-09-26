package GenericFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Sachin SR,
 * @Designation: Candidate,
 * This GenericFunctions Class: The commonly used methods in the framework.
 *
 */
public class GenericFunctions {
	
	
	
	
	/**
	 * Initiate the Browser with capablities
	 * @param Browser
	 * @return WebDriver Instance
	 * 
	 */
	public static WebDriver initiatebrowser(String browser)
	{
		WebDriverManager.chromedriver().setup();
		
		//Set the capablities of the ChromeDriver
		ChromeOptions options  = new ChromeOptions();
	    options.addArguments("--disable-popup-blocking");
	    
	    DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability(ChromeOptions.CAPABILITY, options);
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		return driver;
	}

	
	
	
	
	
	
}
