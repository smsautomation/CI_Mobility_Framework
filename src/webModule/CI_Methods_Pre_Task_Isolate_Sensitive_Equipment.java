package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Pre_Task_Isolate_Sensitive_Equipment;
import utility.Log;

public class CI_Methods_Pre_Task_Isolate_Sensitive_Equipment{
	
	
	
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
	* Function: addSuccessValuesSub100Wc
	* Author: Charlotte Jones
	* Date: 06/08/2018
	* Purpose: This method adds the required responses in the Pre Task - Determine if Customer Needs To
	* Isolate Sensitive Equipment sections for a happy path scenario
	* Metering Types:				WC 1PH
	* 								WC 3PH
	* Arguments: sRiskAssessPass
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
	public static void addSuccessValuesSub100Wc(WebDriver driver, String sTestCaseName) throws Exception{
	
		String	sCustIsolateNotes = "";
		
		
		CI_Objects_Pre_Task_Isolate_Sensitive_Equipment.btn_cust_isolated_equipment_na(driver).click();
		{
			Log.info(sTestCaseName + " | Has the customer isolated sensitive equipment? - N/A radio button clicked");
		}
		
		CI_Objects_Pre_Task_Isolate_Sensitive_Equipment.txt_cust_isolated_equipment(driver).click();
		CI_Objects_Pre_Task_Isolate_Sensitive_Equipment.txt_cust_isolated_equipment(driver).sendKeys(sCustIsolateNotes);
		{
			Log.info(sTestCaseName + " | Has the customer isolated sensitive equipment? - N/A radio button clicked");
		}
		
		CI_Objects_Pre_Task_Isolate_Sensitive_Equipment.btn_photo_current_install(driver).click();
		{
			Log.info(sTestCaseName + " | Capture photo of current full meter installation button clicked");
		}
		
		
			
		
		
	// END OF ADD SUCCESS VALUES SUB100 WC METHOD
	}

		
		
	
//END OF METHODS
}