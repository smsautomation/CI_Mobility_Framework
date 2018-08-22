package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Complete_Job;
import utility.Log;

public class CI_Methods_Complete_Job{
	
	
	
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
	* Function: addSuccessValuesAll
	* Author: Charlotte Jones
	* Date: 21/08/2018
	* Purpose: This method adds the required responses in the final section - Complete Job - for a happy
	* 	path scenario
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
	
	
	public static void addSuccessValuesAll(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		String sCustRepSigned = "c";
		String sCustSignatureNotes = "notes about signing";
		String sVisitOutcome = "w";
		String sComments = "comments about the visit outcome";
		
		
		CI_Objects_Complete_Job.btn_cust_agree_to_info_displayed(driver).click();
	    {
			Log.info(sTestCaseName + " | Customer Agreement to Information Displayed checkbox selected");
		}
	    
	    CI_Objects_Complete_Job.txt_cust_signature(driver).click();
	    {
			Log.info(sTestCaseName + " | Customer Signature box clicked");
		}
		
	    CI_Objects_Complete_Job.cbx_cust_or_rep_signed(driver).click();
	    CI_Objects_Complete_Job.cbx_cust_or_rep_signed(driver).sendKeys(sCustRepSigned);
	    CI_Objects_Complete_Job.cbx_cust_or_rep_signed(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Customer or Representative Signed option completed");
		}
		
	    CI_Objects_Complete_Job.txt_cust_signature_notes(driver).click();
	    CI_Objects_Complete_Job.txt_cust_signature_notes(driver).sendKeys(sCustSignatureNotes);
	    {
			Log.info(sTestCaseName + " | Additional notes/Remarks - Customer Signature Capture section completed");
		}
	    
	    CI_Objects_Complete_Job.btn_job_completed(driver).click();
	    {
			Log.info(sTestCaseName + " | Job Completed checkbox selected");
		}
	    
	    CI_Objects_Complete_Job.cbx_visit_outcome(driver).click();
	    CI_Objects_Complete_Job.cbx_visit_outcome(driver).sendKeys(sVisitOutcome);
	    CI_Objects_Complete_Job.cbx_visit_outcome(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Job Completed checkbox selected");
		}
	    
	    CI_Objects_Complete_Job.txt_comments(driver).click();
	    CI_Objects_Complete_Job.txt_comments(driver).sendKeys(sComments);
	    {
			Log.info(sTestCaseName + " | Comments textbox filled in");
		}
	    
	    CI_Objects_Complete_Job.btn_ci_exit_card_left(driver).click();
	    {
			Log.info(sTestCaseName + " | C&I Exit Card left On Site? checkbox selected");
		}
	    
	    CI_Objects_Complete_Job.btn_job_complete_and_submit(driver).click();
	    {
			Log.info(sTestCaseName + " | Job Complete and Submit button clicked");
		}
	    
	    
	
	// END OF ADD SUCCESS VALUES ALL METHOD    
	}	
			
		
	
//END OF METHODS
}