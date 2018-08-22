package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Elec_Risk_Assessment;
import utility.Log;

public class CI_Methods_Elec_Risk_Assessment{
	
	
	
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
	* Function: addSuccessValuesAll
	* Author: Charlotte Jones
	* Date: 12/07/2018
	* Purpose: This method adds the required responses in the Electricity Risk Assessment sections for a happy path scenario
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
	public static void addSuccessValuesAll(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		CI_Objects_Elec_Risk_Assessment.btn_perform_risk_assess_y(driver).click();
		{
			Log.info(sTestCaseName + " | Perform Risk Assessment? checkbox clicked");
		}
		
		CI_Objects_Elec_Risk_Assessment.btn_risk_assess_pass_y(driver).click();
		{
			Log.info(sTestCaseName + " | Risk Assessment Pass radio button clicked");
		}
		
		
		// Risk Assessment Pass sub-section
		
		String sRiskAssessPass = "Risk assessment pass notes";
		
		CI_Objects_Elec_Risk_Assessment.txt_risk_assess_pass(driver).click();
		CI_Objects_Elec_Risk_Assessment.txt_risk_assess_pass(driver).sendKeys(sRiskAssessPass);
		{
			Log.info(sTestCaseName + " | Notes added to risk assessment pass section");
		}
		
		CI_Objects_Elec_Risk_Assessment.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button clicked");
		}
		
	// END OF ADD SUCCESS VALUES ALL METHOD
	}

		
		
	
//END OF METHODS
}