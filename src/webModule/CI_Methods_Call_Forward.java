package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Call_Forward;
import utility.Log;

public class CI_Methods_Call_Forward{
	
	
	
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
	* Date: 06/07/2018
	* Purpose: This method adds the required responses in the Call Forward section for a happy path scenario 
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
	
		// Select Call Forward button
		CI_Objects_Call_Forward.btn_call_forward(driver).click();{
			Log.info(sTestCaseName + " | Call Forward button clicked");
		}
		System.out.println("call forward button clicked");
		
		
		
		// Next section - Display Call Forward
		CI_Objects_Call_Forward.btn_contact_made_y(driver).click();{
			Log.info(sTestCaseName + " | Contact Made radio button clicked");
		}
		System.out.println("contact made clicked");
		Thread.sleep(500);
		
		CI_Objects_Call_Forward.btn_appt_confirm_y(driver).click();{
			Log.info(sTestCaseName + " | Appointment Confirm - Yes radio button clicked");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
		
		System.out.println("appointment confirm clicked");
		
		CI_Objects_Call_Forward.btn_depart(driver).click();{
			Log.info(sTestCaseName + " | Depart button clicked");
		}
		System.out.println("depart button clicked");
		
		CI_Objects_Call_Forward.btn_ok(driver).click();{
			Log.info(sTestCaseName + " | OK (pop up) button clicked");
		}
		System.out.println("ok button clicked");
		
	}	
		
	
//END OF METHODS
}