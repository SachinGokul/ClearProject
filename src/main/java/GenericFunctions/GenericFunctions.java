package GenericFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Sachin SR,
 * @Designation: Candidate, This GenericFunctions Class: The commonly used
 *               methods in the framework.
 *
 */
public class GenericFunctions {

	/**
	 * Initiate the Browser with capablities
	 * 
	 * @param Browser
	 * @return WebDriver Instance
	 * 
	 */
	public static WebDriver initiatebrowser(String browser) {
		WebDriver driver;
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();

			// Set the capablities of the ChromeDriver
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-popup-blocking");

			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

}
