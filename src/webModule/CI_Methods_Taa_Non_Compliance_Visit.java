package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Taa_Non_Compliance_Visit;
import utility.Log;

public class CI_Methods_Taa_Non_Compliance_Visit{
	
	
	
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
	* Function: addSuccessValuesCommission
	* Author: Charlotte Jones
	* Date: 22/08/2018
	* Purpose: This method adds the required responses in the TAA Non-Compliance Visit section for
	* 	a happy path scenario
	* Metering Supply Type:		WC 3PH
	* 							LV CT
	* 							HV CT
	* 							COP5 - all
	* 							COP3 - all
	* 							COP2
	* 							COP10 WC 3PH
	* 							COP10 LV CT
	* This is part 1 - the workflow can call other tasks from this section - each time this happens, a new
	* 	part method will be created 
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
	
	
	public static void addSuccessValuesCommission(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		CI_Objects_Taa_Non_Compliance_Visit.btn_commission_meter(driver).click();
	    {
			Log.info(sTestCaseName + " | Commission the Meter? checkbox ticked");
		}
	
	// END OF ADD SUCCESS VALUES COMMISSION METHOD    
	}	
			

	/* **************************************************************************************************
	* Function: addSuccessValuesCop4Test
	* Author: Charlotte Jones
	* Date: 22/08/2018
	* Purpose: This method adds the required responses in the TAA Non-Compliance Visit section for
	* 	a happy path scenario:
	* Metering Supply Type:		WC 3PH
	* 							LV CT
	* 							HV CT
	* 	 						COP5 - all
	* 							COP3 - all
	* 							COP2
	* 							COP10 WC 3PH
	* 							COP10 LV CT
	* This is the 1st optional question in this section - the workflow can call other tasks from 
	* 	this section - each time this happens, a new part method will be created 
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
	
	
	public static void addSuccessValuesCop4Test(WebDriver driver, String sTestCaseName) throws Exception{
	
		
	    CI_Objects_Taa_Non_Compliance_Visit.btn_cop4_test(driver).click();
	    {
			Log.info(sTestCaseName + " | Are Tails Labelled? - OK pop up dismissed");
		}
 
	// END OF ADD SUCCESS VALUES COP4 Test METHOD    
	}		
	
		
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesSiteSurvey
	* Author: Charlotte Jones
	* Date: 22/08/2018
	* Purpose: This method adds the required responses in the TAA Non-Compliance Visit section for
	* 	a happy path scenario:
	* Metering Supply Type:		COP5 - all
	* 							COP3 - all
	* 							COP2
	* 							COP10 - all
	* This is the 2nd optional question in this section - the workflow can call other tasks from this
	* 	section - each time this happens, a new part method will be created 
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
	
	
	public static void addSuccessValuesSiteSurvey(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		CI_Objects_Taa_Non_Compliance_Visit.btn_site_survey_required(driver).click();
	    {
			Log.info(sTestCaseName + " | Site Survey Required? checkbox ticked");
		}

	
	// END OF ADD SUCCESS VALUES SITE SURVEY METHOD    
	}		
	
	

	/* **************************************************************************************************
	* Function: addSuccessValuesMeterRead
	* Author: Charlotte Jones
	* Date: 22/08/2018
	* Purpose: This method adds the required responses in the TAA Non-Compliance Visit section for
	* 	a happy path scenario:
	* Metering Supply Type:		COP5 - all
	* 							COP3 - all
	* 							COP2
	* 							COP10 - all
	* This is part 2 - the workflow can call other tasks from this section - each time this happens, a new
	* 	part method will be created 
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
	
	
	public static void addSuccessValuesMeterRead(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		CI_Objects_Taa_Non_Compliance_Visit.btn_meter_read_required(driver).click();
	    {
			Log.info(sTestCaseName + " | Meter Read Required? checkbox ticked");
		}

	
	// END OF ADD SUCCESS VALUES METER READ METHOD    
	}		
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEnd
	* Author: Charlotte Jones
	* Date: 22/08/2018
	* Purpose: This method adds the required responses in the TAA Non-Compliance Visit section for
	* 	a happy path scenario:
	* Metering Supply Type:		COP5 - all
	* 							COP3 - all
	* 							COP2
	* 							COP10 - all
	* This is the last part of this section and will definitely need to be called (for all applicable
	* 	supplies), regardless of the choices made in the middle of the section
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
	
	
	public static void addSuccessValuesEnd(WebDriver driver, String sTestCaseName) throws Exception{
	
		// Variables
		String sVisitOutcome = "notes about the outcome of the visit";
		
		
		CI_Objects_Taa_Non_Compliance_Visit.txt_outcome_of_visit(driver).click();
		CI_Objects_Taa_Non_Compliance_Visit.txt_outcome_of_visit(driver).sendKeys(sVisitOutcome);
	    {
			Log.info(sTestCaseName + " | Outcome of Visit textbox completed");
		}

		CI_Objects_Taa_Non_Compliance_Visit.btn_photo_evidence_1(driver).click();
	    {
			Log.info(sTestCaseName + " | 1st photo of TAA non-compliance section taken");
		}
	    
	// END OF ADD SUCCESS VALUES END METHOD    
	}		
	
	
	
	
//END OF METHODS
}