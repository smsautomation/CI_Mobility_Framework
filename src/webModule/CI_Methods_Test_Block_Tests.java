package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Test_Block_Tests;
import utility.Log;

public class CI_Methods_Test_Block_Tests{
	
	
	
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
	* Purpose: This method adds the required responses in the Carry Out Terminal Test Block Tests section
	* 	for a happy path scenario - for the following metering:
	* 		WC 3PH?
	* 		HV CT
	* 		LV CT
	* 		COP10 LV CT
	* 		COP10 WC 3PH?
	* 		COP5 LV
	* 		COP5 HV
	* 		COP3 LV
	* 		COP3 HV
	* 		COP2
	* 		SM WC 3PH?
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
	
		
		// *!*!*!*!*!* need values for the below variables *!*!*!*!*!*
		
		String	sTestBlockNotes = "";
		
		
		CI_Objects_Test_Block_Tests.txt_terminal_test_block(driver).click();
		CI_Objects_Test_Block_Tests.txt_terminal_test_block(driver).sendKeys(sTestBlockNotes);
		{
			Log.info(sTestCaseName + " | Additional Notes/Remarks - Terminal Test Block field completed");
		}
		
		CI_Objects_Test_Block_Tests.btn_phase_corrected_at_meter_y(driver).click();
		{
			Log.info(sTestCaseName + " | Has Phase Rotation Been Corrected At Meter? - Yes radio button clicked");
		}
		
	
	// END OF ADD SUCCESS VALUES NON DNO BNO  METHOD	
	}	
			

	
	
			
	
//END OF METHODS
}