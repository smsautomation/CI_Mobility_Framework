package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Post_Install_Checks_WC;
import utility.Log;

public class CI_Methods_Post_Install_Checks_Wc{
	
	
	
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
	* Function: addSuccessValues1ph
	* Author: Charlotte Jones
	* Date: 07/08/2018
	* Purpose: This method adds the required responses in the Post Install Checks (for Whole Current
	* 1PH/3PH Metering) at the Meter section for a happy path scenario - where the meter has 1Ph
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
	public static void addSuccessValues1ph(WebDriver driver, String sTestCaseName) throws Exception{
	

		String 	sEarthType = "n";
		
		
		
				
		CI_Objects_Post_Install_Checks_WC.btn_polarity_check_correct(driver).click();
		{
			Log.info(sTestCaseName + " | Polarity Check Correct tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_approved_cable_markers(driver).click();
		{
			Log.info(sTestCaseName + " | Approved Siemens Cable Markers Installed correct tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_terminal_screw_tightness(driver).click();
		{
			Log.info(sTestCaseName + " | Terminal Screw Tightness Checked tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_all_seals_intact(driver).click();
		{
			Log.info(sTestCaseName + " | All Seals Intact - Including Blocks and Isolators tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_visual_inspection_completed(driver).click();
		{
			Log.info(sTestCaseName + " | Visual Inspection Completed tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.cbx_earth_type(driver).click();
		CI_Objects_Post_Install_Checks_WC.cbx_earth_type(driver).sendKeys(sEarthType);
		CI_Objects_Post_Install_Checks_WC.cbx_earth_type(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Earth Type dropdown completed");
		}
		
		// Additional Maintenance Work Carried Out sub-section
		
		CI_Objects_Post_Install_Checks_WC.btn_replacement_meter_board(driver).click();
		{
			Log.info(sTestCaseName + " | Replacement Meter Board tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_meter_tails_changed(driver).click();
		{
			Log.info(sTestCaseName + " | Meter Tails Changed tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_replaced_main_fuse(driver).click();
		{
			Log.info(sTestCaseName + " | Replaced Main Fuse tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_emergency_job(driver).click();
		{
			Log.info(sTestCaseName + " | Emergency Job tickbox checked");
		}
		
		
		// Final Photographic Evidence sub-section
		
		// *!*!*!*!*!*!* Not sure if this will be the same button and therefore the elements need changing *!*!*!*!*!*!*
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_martindale_test_1(driver).click();
		{
			Log.info(sTestCaseName + " | 1st photo captured for the Martindale Test");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_martindale_test_2(driver).click();
		{
			Log.info(sTestCaseName + " | 2nd photo captured for the Martindale Test");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_martindale_test_3(driver).click();
		{
			Log.info(sTestCaseName + " | 3rd photo captured for the Martindale Test");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_final_meter_install_1(driver).click();
		{
			Log.info(sTestCaseName + " | 1st photo captured for the Final Meter Installation");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_final_meter_install_2(driver).click();
		{
			Log.info(sTestCaseName + " | 2nd photo captured for the Final Meter Installation");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_final_meter_install_3(driver).click();
		{
			Log.info(sTestCaseName + " | 3rd photo captured for the Final Meter Installation");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_close_up_1(driver).click();
		{
			Log.info(sTestCaseName + " | 1st photo captured for the Close up for Meter + Witness Sticker");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_close_up_2(driver).click();
		{
			Log.info(sTestCaseName + " | 2nd photo captured for the Close up for Meter + Witness Sticker");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_close_up_3(driver).click();
		{
			Log.info(sTestCaseName + " | 3rd photo captured for the Close up for Meter + Witness Sticker");
		}
		
		
		
		
				
	// END OF ADD SUCCESS VALUES 1PH METHOD
	}

	/* **************************************************************************************************
	* Function: addSuccessValues3ph
	* Author: Charlotte Jones
	* Date: 07/08/2018
	* Purpose: This method adds the required responses in the Post Install Checks (for Whole Current
	* 1PH/3PH Metering) at the Meter section for a happy path scenario - where the meter has > 1PH
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
	public static void addSuccessValues3ph(WebDriver driver, String sTestCaseName) throws Exception{
	
	
		String 	sEarthType = "n";
		
				
		CI_Objects_Post_Install_Checks_WC.btn_polarity_check_correct(driver).click();
		{
			Log.info(sTestCaseName + " | Polarity Check Correct tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_phase_rotation_correct(driver).click();
		{
			Log.info(sTestCaseName + " | Phase Rotation Correct tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_terminal_screw_tightness(driver).click();
		{
			Log.info(sTestCaseName + " | Terminal Screw Tightness Checked tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_visual_inspection_completed(driver).click();
		{
			Log.info(sTestCaseName + " | Visual Inspection Completed tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.cbx_earth_type(driver).click();
		CI_Objects_Post_Install_Checks_WC.cbx_earth_type(driver).sendKeys(sEarthType);
		CI_Objects_Post_Install_Checks_WC.cbx_earth_type(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Earth Type dropdown completed");
		}
		
		
		// Additional Maintenance Work Carried Out sub-section
		
		CI_Objects_Post_Install_Checks_WC.btn_replacement_meter_board(driver).click();
		{
			Log.info(sTestCaseName + " | Replacement Meter Board tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_meter_tails_changed(driver).click();
		{
			Log.info(sTestCaseName + " | Meter Tails Changed tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_replaced_main_fuse(driver).click();
		{
			Log.info(sTestCaseName + " | Replaced Main Fuse tickbox checked");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_emergency_job(driver).click();
		{
			Log.info(sTestCaseName + " | Emergency Job tickbox checked");
		}
		
		
		// Final Photographic Evidence sub-section
		
		// *!*!*!*!*!*!* Not sure if this will be the same button and therefore the elements need changing *!*!*!*!*!*!*
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_martindale_test_1(driver).click();
		{
			Log.info(sTestCaseName + " | 1st photo captured for the Martindale Test");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_martindale_test_2(driver).click();
		{
			Log.info(sTestCaseName + " | 2nd photo captured for the Martindale Test");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_martindale_test_3(driver).click();
		{
			Log.info(sTestCaseName + " | 3rd photo captured for the Martindale Test");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_final_meter_install_1(driver).click();
		{
			Log.info(sTestCaseName + " | 1st photo captured for the Final Meter Installation");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_final_meter_install_2(driver).click();
		{
			Log.info(sTestCaseName + " | 2nd photo captured for the Final Meter Installation");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_final_meter_install_3(driver).click();
		{
			Log.info(sTestCaseName + " | 3rd photo captured for the Final Meter Installation");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_close_up_1(driver).click();
		{
			Log.info(sTestCaseName + " | 1st photo captured for the Close up for Meter + Witness Sticker");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_close_up_2(driver).click();
		{
			Log.info(sTestCaseName + " | 2nd photo captured for the Close up for Meter + Witness Sticker");
		}
		
		CI_Objects_Post_Install_Checks_WC.btn_photo_close_up_3(driver).click();
		{
			Log.info(sTestCaseName + " | 3rd photo captured for the Close up for Meter + Witness Sticker");
		}		
						
		
		
		
		
	// END OF ADD SUCCESS VALUES 3PH METHOD
	}	
		
	
//END OF METHODS
}