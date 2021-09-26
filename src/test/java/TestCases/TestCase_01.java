package TestCases;

import org.testng.annotations.Test;

import BaseClass.BaseTest;
import PageActions.TestCase01PageActions;

/**
 * 
 * @author Sachin S R
 * Added the test case of the particular test
 *
 */
public class TestCase_01 extends BaseTest
{
	@Test
	public void testCase_01()
	{
	TestCase01PageActions test1 = new TestCase01PageActions();
	test1.testCase_01();
	
	}
	
}
