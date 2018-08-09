package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Check_Meter_Removal;
import utility.Log;

public class CI_Methods_Check_Meter_Removal{
	
	
	
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
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.lbl_Initial_Polarity_Check_At_Meter(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Initial Polarity Check At Meter label displayed as expected");
		}
		
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Polarity_Check_At_Cut_Out_Pass(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Polarity Check At Cut Out - Pass radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Polarity_Check_At_Cut_Out_Fail(driver).isDisplayed();{
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
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the Check Meter Removal section for a happy
	* path scenario
	* Arguments:			
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
	
		
		// Remove Check Meter
		
		CI_Objects_Check_Meter_Removal.btn_isolated_supply_to_both(driver).click();
	    {
			Log.info(sTestCaseName + " | Isolated Supply to Both Meters? tickbox checked");
		}
	    
	    CI_Objects_Check_Meter_Removal.btn_check_meter_removed(driver).click();
	    {
			Log.info(sTestCaseName + " | Check Meter Removed tickbox checked");
		}
	    	    
	    CI_Objects_Check_Meter_Removal.btn_reinstated_supply(driver).click();
	    {
			Log.info(sTestCaseName + " | Re-Instated Supply to Billing Meter? tickbox checked");
		}
	    
	    
	    
	}	
			
		
	
//END OF METHODS
}