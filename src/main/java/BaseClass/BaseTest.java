package BaseClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import GenericFunctions.GenericFunctions;
import Utilities.PropertyReader;

public class BaseTest {

	public static WebDriver driver;
	
	//startTest method used to initate the driver instance
	@BeforeClass
	public void startTest() {
		driver = GenericFunctions.initiatebrowser(PropertyReader.getProperty("Browser"));

	}
	
	//tearDown method to terminate the browser instance
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
