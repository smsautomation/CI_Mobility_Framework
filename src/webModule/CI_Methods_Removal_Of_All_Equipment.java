package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Removal_Of_All_Equipment;
import utility.Log;

public class CI_Methods_Removal_Of_All_Equipment{
	
	
	
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
	* Function: addSuccessValuesHv
	* Author: Charlotte Jones
	* Date: 06/08/2018
	* Purpose: This method adds the required responses in the Removal of All Equipment section for a happy
	* 	path scenario where the metering supply is HV:
	* 		HV CT
	* 		COP5 HV
	* 		COP3 HV
	* 		COP2
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
	public static void addSuccessValuesHv(WebDriver driver, String sTestCaseName) throws Exception{
	
	
				
		CI_Objects_Removal_Of_All_Equipment.btn_supply_de_energised_y(driver).click();
		{
			Log.info(sTestCaseName + " | Has the Supply Already Been De-energised? - Yes radio button clicked");
		}
		
				
	// END OF ADD SUCCESS VALUES HV METHOD
	}

	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesLv
	* Author: Charlotte Jones
	* Date: 06/08/2018
	* Purpose: This method adds the required responses in the Removal of All Equipment section for a happy
	* 	path scenario where the metering supply is LV:
	* 		WC 1PH
	* 		WC 3PH
	* 		LV CT
	* 		COP5 WC 3PH
	* 		COP5 LV
	* 		COP10 WC 1PH
	* 		COP10 WC 3PH
	* 		COP10 LV CT
	* 		COP3 LV
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


	
	// there are no questions for this section for low voltage metering - the workflow doc shows a list of
	//	tasks to be called
		
	
//END OF METHODS
}