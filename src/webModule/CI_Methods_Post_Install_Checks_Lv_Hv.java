package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Post_Install_Checks_LV_HV;
import utility.Log;

public class CI_Methods_Post_Install_Checks_Lv_Hv{
	
	
	
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
	* Function: addSuccessValuesLvHv
	* Author: Charlotte Jones
	* Date: 06/08/2018
	* Purpose: This method adds the required responses in the Post Installation Checks (for LV/HV
	* Metering) section for a happy path scenario
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
	public static void addSuccessValuesLvHv(WebDriver driver, String sTestCaseName) throws Exception{
	
	
		// *!*!*!*!*!*!*! Need values for the variables below *!*!*!*!*!*!*!
		
		String 	sMaintenanceWork = "notes about maintenance";
				
					
		CI_Objects_Post_Install_Checks_LV_HV.btn_phase_rotation_correct(driver).click();
		{
			Log.info(sTestCaseName + " | Phase Rotation Correct checkbox ticked");
		}
		
		CI_Objects_Post_Install_Checks_LV_HV.btn_terminal_screw_tightness(driver).click();
		{
			Log.info(sTestCaseName + " | Terminal Screw Tightness Checked checkbox ticked");
		}
		
		CI_Objects_Post_Install_Checks_LV_HV.btn_ct_run_position(driver).click();
		{
			Log.info(sTestCaseName + " | CTs left in run position - all seals intact checkbox ticked");
		}
		
		CI_Objects_Post_Install_Checks_LV_HV.cbx_earth_type(driver).click();
		{
			Log.info(sTestCaseName + " | Earth Type checkbox ticked");
		}
		
		CI_Objects_Post_Install_Checks_LV_HV.btn_addnl_maintenance_work(driver).click();
		{
			Log.info(sTestCaseName + " | Additional Maintence checkbox ticked");
		}
		
		CI_Objects_Post_Install_Checks_LV_HV.txt_notes_maintenance_work(driver).click();
		CI_Objects_Post_Install_Checks_LV_HV.txt_notes_maintenance_work(driver).sendKeys(sMaintenanceWork);
		{
			Log.info(sTestCaseName + " | Additional Notes/Remarks - Maintenance Work Carried Out field completed");
		}
		
		// Final Photographic Evidence sub-section
		
		CI_Objects_Post_Install_Checks_LV_HV.btn_photo_final_meter_install_1(driver).click();
		{
			Log.info(sTestCaseName + " | 1st Photo of Final Meter Installation taken");
		}
		
		CI_Objects_Post_Install_Checks_LV_HV.btn_photo_final_meter_install_2(driver).click();
		{
			Log.info(sTestCaseName + " | 2nd Photo of Final Meter Installation taken");
		}
		
		CI_Objects_Post_Install_Checks_LV_HV.btn_photo_final_meter_install_3(driver).click();
		{
			Log.info(sTestCaseName + " | 3rd Photo of Final Meter Installation taken");
		}
		
		CI_Objects_Post_Install_Checks_LV_HV.btn_photo_close_up_1(driver).click();
		{
			Log.info(sTestCaseName + " | 1st Photo of Close Up of Meter taken");
		}
		
		CI_Objects_Post_Install_Checks_LV_HV.btn_photo_close_up_2(driver).click();
		{
			Log.info(sTestCaseName + " | 2nd Photo of Close Up of Meter taken");
		}
		
		CI_Objects_Post_Install_Checks_LV_HV.btn_photo_close_up_3(driver).click();
		{
			Log.info(sTestCaseName + " | 3rd Photo of Close Up of Meter taken");
		}
		
		
		
		
				
	// END OF ADD SUCCESS VALUES LV HV METHOD
	}

		
		
	
//END OF METHODS
}