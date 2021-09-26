package PageObjects;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	
	WebDriver driver;
	public HomePageObjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//div[p[contains(text(),'Round trip')]]/preceding-sibling::div/span")
	public WebElement roundTripButton;
	
	
	@FindBy(xpath = "(//*[contains(@placeholder,'Any worldwide city')])[1]")
	public WebElement fromInputBox;
	
	@FindBy(xpath = "(//*[contains(@placeholder,'Any worldwide city')])[2]")
	public WebElement toInputBox;
	
	@FindBy(xpath="//div[text()='Suggestions']/../li/p")
	public List<WebElement> dropDown;
	
	@FindBy(xpath="//*[contains(text(),'Search flights')]")
	public WebElement searchFlightsButton;
	
	@FindBy(xpath="//*[contains(text(),'Book')]")
	public WebElement bookButton;
	
	public void clickOnRoundTripButton()
	{
		roundTripButton.click();
	}
	
	public void fillTheFromInputBox(String value)
	{
		fromInputBox.click();
		fromInputBox.sendKeys(value);
		dropDown.get(0).click();
	}
	
	public void fillTheToInputBox(String value)
	{
		toInputBox.click();
		toInputBox.sendKeys(value);
		dropDown.get(0).click();
	}
	
	public void clickOnSerachFligthsButton()
	{
		searchFlightsButton.click();
	}
	
	public void clickOnBookButton()
	{
		bookButton.click();
	}
	
	
	

}
