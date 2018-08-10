package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Reprogramme_Meter;
import utility.Log;

public class CI_Methods_Reprogramme_Meter{
	
	
	
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
	* Function: addSuccessValuesNoCommission
	* Author: Charlotte Jones
	* Date: 10/08/2018
	* Purpose: This method adds the required responses in the Reprogramme Meter section for a happy
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
	public static void addSuccessValuesNoCommission(WebDriver driver, String sTestCaseName) throws Exception{
	
		// *!*!*!*!*!*!*!* Need values for below variables *!*!*!*!*!*!*!* 
		
		Integer iCtRatio = 1;
		Integer iVtRatio = 2;
		Integer	iSscCode = 1241;
		
		
		CI_Objects_Reprogramme_Meter.cbx_ct_ratio(driver).click();
		CI_Objects_Reprogramme_Meter.cbx_ct_ratio(driver).sendKeys(Integer.toString(iCtRatio));
		CI_Objects_Reprogramme_Meter.cbx_ct_ratio(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Value selected from CT Ratio dropdown");
		}
		
		CI_Objects_Reprogramme_Meter.cbx_vt_ratio(driver).click();
		CI_Objects_Reprogramme_Meter.cbx_vt_ratio(driver).sendKeys(Integer.toString(iVtRatio));
		CI_Objects_Reprogramme_Meter.cbx_vt_ratio(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Value selected from VT Ratio dropdown");
		}
		
		CI_Objects_Reprogramme_Meter.cbx_ssc_code(driver).click();
		CI_Objects_Reprogramme_Meter.cbx_ssc_code(driver).sendKeys(Integer.toString(iSscCode));
		CI_Objects_Reprogramme_Meter.cbx_ssc_code(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Value selected from SSC Code dropdown");
		}
		
		// add in method to verify that the Baud Rate has defaulted to the correct value, based on the serial number
		
			
		// Re-Programme Meter
		
		CI_Objects_Reprogramme_Meter.btn_meter_reprogrammed(driver).click();
		{
			Log.info(sTestCaseName + " | Meter Re-programmed checkbox ticked");
		}
		
		// Take New Meter Readings
		
		CI_Objects_Reprogramme_Meter.btn_ct_ratio_changed(driver).click();
		{
			Log.info(sTestCaseName + " | CT Ratio Changed? checkbox ticked");
		}
		
		CI_Objects_Reprogramme_Meter.btn_vt_ratio_changed(driver).click();
		{
			Log.info(sTestCaseName + " | VT Ratio Changed? checkbox ticked");
		}
		
		CI_Objects_Reprogramme_Meter.btn_ssc_changed(driver).click();
		{
			Log.info(sTestCaseName + " | SSC Code Changed? checkbox ticked");
		}
		
		CI_Objects_Reprogramme_Meter.btn_baud_rate_changed(driver).click();
		{
			Log.info(sTestCaseName + " | Baud Rate Changed? checkbox ticked");
		}
		
		CI_Objects_Reprogramme_Meter.cbx_commissioning_required_n(driver).click();
		{
			Log.info(sTestCaseName + " | Commissioning Required? No radio button selected");
		}
		
		
		
		
	// END OF ADD SUCCESS VALUES NO COMMISION METHOD
	}

		
		
	
//END OF METHODS
}