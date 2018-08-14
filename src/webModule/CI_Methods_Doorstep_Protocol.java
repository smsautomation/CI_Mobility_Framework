package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Access_To_Site_Or_Meter_Gained;
import pageObjectRepositories.CI_Objects_Arrive;
import utility.Log;

public class CI_Methods_Doorstep_Protocol{
	
	
	
/* **** This hasn't yet been modified - if decide to include a viewPage section, will need to edit as necessary,
* and then add into the POM the required labels etc ****** */
 
	
	
	
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 15/06/2017
	* Purpose: This method checks the main page elements on the Electricity Meter Initial Polarity Check At 
	* Meter page upon initial landing
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
	
	/*
	
	public static void viewPage(WebDriver driver, String sTestCaseName) throws Exception{
	

		//Check that all of the elements of that are expected are displayed
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.lbl_Initial_Polarity_Check_At_Meter(driver)
				.isDisplayed();
		{
			Log.info(sTestCaseName + " | Initial Polarity Check At Meter label displayed as expected");
		}

		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Polarity_Check_At_Cut_Out_Pass(driver)
				.isDisplayed();
		{
			Log.info(sTestCaseName + " | Polarity Check At Cut Out - Pass radio button displayed as expected");
		}

		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Polarity_Check_At_Cut_Out_Fail(driver)
				.isDisplayed();
		{
			Log.info(sTestCaseName + " | Polarity Check At Cut Out - Fail radio button displayed as expected");
		}

		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	*/
		
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Charlotte Jones
	* Date: 06/07/2018
	* Purpose: This method adds the required responses in the Doorstep Protocol section for a happy path scenario
	* This comprises the following sections from the workflow document:
	*   Arrival On Site
	*   Arrive
	*   Access to Site or Meter Gained
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
	
	// No risks identified	
		
		// Arrival On Site section
		
		CI_Objects_Arrive.btn_arrive(driver).click();
		{
			Log.info(sTestCaseName + " | Arrive button clicked");
		}
		
		// Arrive section
		
		CI_Objects_Arrive.btn_access_gained_y(driver).click();
		{
			Log.info(sTestCaseName + " | Access to Site Gained? radio button clicked");
		}
		
		CI_Objects_Arrive.btn_cust_on_site_y(driver).click();
		{
			Log.info(sTestCaseName + " | Customer On Site? radio button clicked");
		}
		
		// Access to Site or Meter Gained - separate POM
		
		CI_Objects_Access_To_Site_Or_Meter_Gained.btn_on_site(driver).click();
		{
			Log.info(sTestCaseName + " | On Site button clicked");
		}
		
	// END OF ADD SUCCESS VALUES METHOD
	}	
		
	
//END OF METHODS
}