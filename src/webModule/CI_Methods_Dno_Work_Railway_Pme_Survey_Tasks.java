package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Dno_Bno_Work;
import utility.Log;

public class CI_Methods_Dno_Work_Railway_Pme_Survey_Tasks{
	
	
	
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
	* Function: addSuccessValuesAc
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.37 - Railway PME Survey - with these methods to be invoked after the
	* 	completed tasks have been checked off - for an AC traction system
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
	public static void addSuccessValuesAc(WebDriver driver, String sTestCaseName) throws Exception{
	
	
				
		CI_Objects_Dno_Bno_Work.RAILWAY_PME_SURVEY_JOB_TASKS.btn_other_dno_supplies_n(driver).click();
		{
			Log.info(sTestCaseName + " | 3.1 Other DNO Supplies - No radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.RAILWAY_PME_SURVEY_JOB_TASKS.btn_installation_complies_y(driver).click();
		{
			Log.info(sTestCaseName + " | 3.2 Installation Complies with BS 7671? - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.RAILWAY_PME_SURVEY_JOB_TASKS.btn_intake_cubicle_metallic_y(driver).click();
		{
			Log.info(sTestCaseName + " | 3.3 Intake Cubicle Metallic? - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.RAILWAY_PME_SURVEY_JOB_TASKS.btn_ext_touch_potentials_controlled_y(driver).click();
		{
			Log.info(sTestCaseName + " | 3.3 External Touch Potentials Controlled? - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.RAILWAY_PME_SURVEY_JOB_TASKS.btn_railway_electrified_y(driver).click();
		{
			Log.info(sTestCaseName + " | 3.4 Is Railway Electrified? - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.RAILWAY_PME_SURVEY_JOB_TASKS.btn_ac_dc_traction_system_ac(driver).click();
		{
			Log.info(sTestCaseName + " | 3.5/3.6 AC or DC Traction System? - AC radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.RAILWAY_PME_SURVEY_JOB_TASKS.btn_assoc_dc_traction_sys_y(driver).click();
		{
			Log.info(sTestCaseName + " | 4.1a - Associated DC Traction System? - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.RAILWAY_PME_SURVEY_JOB_TASKS.btn_transfer_track_between_ac_dc_n(driver).click();
		{
			Log.info(sTestCaseName + " | 4.1b Transfer Track Between AC and DC Systems? - No radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.RAILWAY_PME_SURVEY_JOB_TASKS.btn_earth_terminal_bonded_y(driver).click();
		{
			Log.info(sTestCaseName + " | 4.2 Earth Terminal Bonded to Running Rails? - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.RAILWAY_PME_SURVEY_JOB_TASKS.btn_bonding_adequate_y(driver).click();
		{
			Log.info(sTestCaseName + " | 4.3 Bonding Adequate? - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.RAILWAY_PME_SURVEY_JOB_TASKS.btn_traction_supply_point_n(driver).click();
		{
			Log.info(sTestCaseName + " | 4.4 Traction Supply Point? - No radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.RAILWAY_PME_SURVEY_JOB_TASKS.btn_reop_less_than_430v_n(driver).click();
		{
			Log.info(sTestCaseName + " | 4.5 REOP >430V (>0.2s) Or >650V (<=0.2s)? - No radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.RAILWAY_PME_SURVEY_JOB_TASKS.btn_traction_return_less_than_25v_y(driver).click();
		{
			Log.info(sTestCaseName + " | 4.6 Traction Return Rail Voltage <25V? - Yes radio button clicked");
		}
		
		// *!*!*!*!*!*!* Need to include a method to verify that the "PME ACCEPTABLE" alert comes up in the workflow *!*!*!*!*!*!*
		
		
		
	// END OF ADD SUCCESS VALUES RAILWAY PME SURVEY METHOD
	}

	
	//*****************************************************************************************************************************
	// Need to go into CI_Methods_Dno_Bno_Work for the Job Summary Details sub-section of the DNO/BNO Work section of the workflow doc
	//*****************************************************************************************************************************	
	
	
	
//END OF METHODS
}