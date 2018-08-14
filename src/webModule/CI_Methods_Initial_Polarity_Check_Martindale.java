package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Initial_Polarity_Check_Martindale;
import utility.Log;

public class CI_Methods_Initial_Polarity_Check_Martindale{
	
	
	
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
	* Function: addSuccessValuesSub100Wc
	* Author: Charlotte Jones
	* Date: 06/08/2018
	* Purpose: This method adds the required responses in the Initial Polarity Check - Martindale Test
	* 	section for a happy path scenario 
	* Meter Supply Types:					WC 1PH
	* 										WC 3PH
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
	
	
	// *!*!*!*!*!*!*!*!*!* sSocketTestLoc needs defining - depends on the standing data list! *!*!*!*!*!*!*!*!*!*
	
	public static void addSuccessValuesSub100Wc(WebDriver driver, String sTestCaseName) throws Exception{
	
		String 	sPolarityTested = "p";
		String 	sSocketTestLoc = "";
		String	sCustWitnessInfo = "";
	    
	    
	    CI_Objects_Initial_Polarity_Check_Martindale.cbx_polarity_check_plug_in_test(driver).click();
	    CI_Objects_Initial_Polarity_Check_Martindale.cbx_polarity_check_plug_in_test(driver).sendKeys(sPolarityTested);
	    CI_Objects_Initial_Polarity_Check_Martindale.cbx_polarity_check_plug_in_test(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Polarity tested with plug in test device selected");
		}
	    
		
	    CI_Objects_Initial_Polarity_Check_Martindale.btn_socket_safety_test_pass(driver).click();
	    {
			Log.info(sTestCaseName + " | Has the Socket Safety Test Passed/Failed? - Pass button clicked");
		}
		
	    CI_Objects_Initial_Polarity_Check_Martindale.cbx_socket_test_location(driver).click();
	    CI_Objects_Initial_Polarity_Check_Martindale.cbx_socket_test_location(driver).sendKeys(sSocketTestLoc);
	    CI_Objects_Initial_Polarity_Check_Martindale.cbx_socket_test_location(driver).sendKeys(Keys.ENTER);
	    
	    CI_Objects_Initial_Polarity_Check_Martindale.btn_photo_socket_test(driver).click();
	    {
			Log.info(sTestCaseName + " | Capture ? - Pass button clicked");
		}
	    
	    // *!*!*!*!*!* going to need to work out how to take multiple photos *!*!*!*!*!*
	    
	    CI_Objects_Initial_Polarity_Check_Martindale.btn_socket_reverse_polarity_n(driver).click();
	    {
			Log.info(sTestCaseName + " | Any Sockets Found as Reverse Polarity? - No button clicked");
		}
	    
	    CI_Objects_Initial_Polarity_Check_Martindale.txt_cust_witness_info(driver).click();
	    CI_Objects_Initial_Polarity_Check_Martindale.txt_cust_witness_info(driver).sendKeys(sCustWitnessInfo);
	    {
			Log.info(sTestCaseName + " | Has the Socket Safety Test Passed/Failed? - Pass button clicked");
		}
	    
	    
	}	
			
		
	
//END OF METHODS
}