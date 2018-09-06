package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Initial_Polarity_Check_At_Meter_Cut_Out;
import utility.Log;

public class CI_Methods_Initial_Polarity_Check_At_Meter_Cut_Out{
	
	
	
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
	* Function: addSuccessValuesSub100Cop10Cop5SmWc
	* Author: Charlotte Jones
	* Date: 13/08/2018
	* Purpose: This method adds the required responses in the Initial Polarity Check - At Meter and Cut Out section for
	* 	a happy path scenario - for Sub100 metering:
	* 		WC 1PH
	* 		WC 3PH
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
	
	
	public static void addSuccessValuesSub100Cop10Cop5SmWc(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		CI_Objects_Initial_Polarity_Check_At_Meter_Cut_Out.btn_polarity_check_at_cut_out_pass(driver).click();
	    {
			Log.info(sTestCaseName + " | Polarity Check at Cut Out? - PASS radio button clicked");
		}
		
		CI_Objects_Initial_Polarity_Check_At_Meter_Cut_Out.btn_polarity_check_at_meter_pass(driver).click();
	    {
			Log.info(sTestCaseName + " | Polarity Check at Meter(s)? - PASS radio button clicked");
		}
	    
	   
	    
	
	// END OF ADD SUCCESS VALUES SUB100 COP10 Cop5 SM WC METHOD    
	}	
			
		
	
//END OF METHODS
}