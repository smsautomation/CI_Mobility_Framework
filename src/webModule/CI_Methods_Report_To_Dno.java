package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Report_To_Dno;
import utility.Log;

public class CI_Methods_Report_To_Dno{
	
	
	
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
	* Date: 10/08/2018
	* Purpose: This method adds the required responses in the Report to DNO section for a happy path
	* 	scenario
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
	
	
		// *!*!*!*!*!*!* Need to provide values for below variables *!*!*!*!*!*!*
		
		String	sAirlineRef = "";
		String	sDnoRef = "";
				
		CI_Objects_Report_To_Dno.btn_called_airline_y(driver).click();
		{
			Log.info(sTestCaseName + " | Called/Updated H&S (AIRline) - Yes radio button selected");
		}
		
		CI_Objects_Report_To_Dno.txt_airline_ref(driver).click();
		CI_Objects_Report_To_Dno.txt_airline_ref(driver).sendKeys(sAirlineRef);
		{
			Log.info(sTestCaseName + " | AIRline Ref Number field completed");
		}
		
		CI_Objects_Report_To_Dno.btn_reported_to_dno_y(driver).click();
		{
			Log.info(sTestCaseName + " | Reported Risk to DNO? - Yes radio button selected");
		}
		
		CI_Objects_Report_To_Dno.txt_dno_ref(driver).click();
		CI_Objects_Report_To_Dno.txt_dno_ref(driver).sendKeys(sDnoRef);
		{
			Log.info(sTestCaseName + " | DNO Job Ref field completed");
		}
		
		CI_Objects_Report_To_Dno.btn_stay_on_site_y(driver).click();
		{
			Log.info(sTestCaseName + " | Stay on Site? Y/N - Yes radio button selected");
		}
		
		CI_Objects_Report_To_Dno.btn_work_can_be_completed_y(driver).click();
		{
			Log.info(sTestCaseName + " | Work can be Completed? - Yes radio button selected");
		}
		
		CI_Objects_Report_To_Dno.txt_risk_assess_fail_dno(driver).click();
		{
			Log.info(sTestCaseName + " | Additional Notes/Remarks - Risk Assessment Fail DNO Issue");
		}
	
				
	// END OF ADD SUCCESS VALUES METHOD
	}

		
		
	
//END OF METHODS
}