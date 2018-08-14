package webModule;

import org.openqa.selenium.WebDriver;
import pageObjectRepositories.Objects_Login_Page;
import utility.Log;
import utility.Utils;

public class CI_Methods_Login{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 29/06/2017
	* Purpose: This method checks the main page elements on the Login page
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void viewPage(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that all of the elements of that are expected are displayed
		Objects_Login_Page.Username(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Username displayed as expected");
		}
		
		Objects_Login_Page.Password(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Password displayed as expected");
		}
		
		Objects_Login_Page.btn_Login(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Login button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewMainPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 13/08/2018
	* Purpose: This method adds the required responses in the Login page in order to log in to FeedHenry
	* successfully
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValues(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Add correct responses for a successful login Procedure
		
		Objects_Login_Page.Username(driver).click();
		Objects_Login_Page.Username(driver).sendKeys("111011");{
		//Objects_Login_Page.Username(driver).sendKeys("Automation");{
		Log.info(sTestCaseName + " | Username entered");
		}
		Objects_Login_Page.Password(driver).click();
		Objects_Login_Page.Password(driver).sendKeys("111Siemens");{
		//Objects_Login_Page.Password(driver).sendKeys("Aut0m4t1on");{
		Log.info(sTestCaseName + " | Password entered");
		}
		Objects_Login_Page.btn_Login(driver).click();{
		Log.info(sTestCaseName + " | Login button clicked");
		}
		Thread.sleep(5000);
						
		//Take a screenshot to show what we've done
		//Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
	//END OF ADD SUCCESS VALUES METHOD
	}
	
//END OF METHODS
}