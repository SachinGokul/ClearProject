package PageActions;

import BaseClass.BaseTest;
import PageObjects.HomePageObjects;

/**
 * 
 * @author Sachin SR
 * PageActions can be defined using the modules of the web applications or testcase ise page actions
 *
 */
public class TestCase01PageActions extends BaseTest{
	
	public void testCase01PageActions()
	{
		HomePageObjects home = new HomePageObjects(driver);
		home.clickOnRoundTripButton();
		home.fillTheFromInputBox("Ban");
		home.fillTheToInputBox("Mum");
		home.clickOnSerachFligthsButton();
		home.clickOnBookButton();
		
		
	}

}
