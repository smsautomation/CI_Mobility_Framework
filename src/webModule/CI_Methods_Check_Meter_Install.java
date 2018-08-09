package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Check_Meter_Install;
import utility.Log;

public class CI_Methods_Check_Meter_Install{
	
	
	
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
	* Purpose: This method adds the required responses in the Check Meter Install section for a happy
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
	
		
		// Install Check Meter
		
		CI_Objects_Check_Meter_Install.btn_isolated_supply(driver).click();  
	    {
			Log.info(sTestCaseName + " | Isolated Supply to Meter? tickbox checked");
		}
	    
	    CI_Objects_Check_Meter_Install.txt_serial_num(driver).click();
	    {
			Log.info(sTestCaseName + " | Serial Number field completed");
		}
	    
	    //Check Meter Reading
	    
	    CI_Objects_Check_Meter_Install.btn_reinstated_supply(driver).click();
	    {
			Log.info(sTestCaseName + " | Re-Instated Supply to Meter? tickbox checked");
		}
	    
	    
	    
	}	
			
		
	
//END OF METHODS
}