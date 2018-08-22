package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Initial_Phase_Rotation_Test;
import utility.Log;

public class CI_Methods_Initial_Phase_Rotation_Test{
	
	
	
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
	* Function: addSuccessValuesNonDnoBno
	* Author: Charlotte Jones
	* Date: 06/08/2018
	* Purpose: This method adds the required responses in the Initial Phase Rotation Test section for
	* 	a happy path scenario - for non-DNO/BNO metering:
	* 		WC 3PH
	* 		LV CT
	* 		HV CT
	* 		All COP5
	* 		All COP3
	* 		All COP2
	* 		COP10 WC 3PH
	* 		COP10 LV CT
	* 		SM WC 3PH
	* 		SM LV CT
	* 		SM PM
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
	
	
	public static void addSuccessValuesNonDnoBno(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		CI_Objects_Initial_Phase_Rotation_Test.btn_phase_rotation_correct_at_meter_y(driver).click();  
	    {
			Log.info(sTestCaseName + " | Is Phase Rotation Correct at Service Cut Out? - Yes radio button clicked");
		}
	    
	    CI_Objects_Initial_Phase_Rotation_Test.btn_are_tails_labelled_ok(driver).click();  
	    {
			Log.info(sTestCaseName + " | Are Tails Labelled? - OK pop up dismissed");
		}
		
	   
	    
	
	// END OF ADD SUCCESS VALUES NON DNO BNO METHOD    
	}	
			
		
	
//END OF METHODS
}