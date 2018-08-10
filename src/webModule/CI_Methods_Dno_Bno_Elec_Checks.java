package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Dno_Bno_Elec_Checks;
import utility.Log;

public class CI_Methods_Dno_Bno_Elec_Checks{
	
	
	
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
	* Function: addSuccessValuesDnoWc3PhLvCt
	* Author: Charlotte Jones
	* Date: 10/08/2018
	* Purpose: This method adds the required responses in the Phase Rotation Test section for a happy
	* 	path scenario - this is applicable for the following meter types:
	* 		DNO WC 3PH
	* 		DNO LV CT
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
	public static void addSuccessValuesDnoWc3PhLvCt(WebDriver driver, String sTestCaseName) throws Exception{
	
	
				
		CI_Objects_Dno_Bno_Elec_Checks.btn_able_to_polarity_checks_y(driver).click();
		{
			Log.info(sTestCaseName + " | Are you able to carry out Polarity Checks? - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_polarity_checked_at_cut_out(driver).click();
		{
			Log.info(sTestCaseName + " | Polarity Checked At Service Cut Out checkbox ticked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_polarity_checked_at_test_block(driver).click();
		{
			Log.info(sTestCaseName + " | Polarity Checked At Test Block checkbox ticked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_polarity_checked_at_cust_main_switch(driver).click();
		{
			Log.info(sTestCaseName + " | Polarity Checked At Customer's Main Switch checkbox ticked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_able_to_phase_rotation_tests(driver).click();
		{
			Log.info(sTestCaseName + " | Are you able to carry out Phase Rotation Checks? - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_phase_rotation_at_cut_out(driver).click();
		{
			Log.info(sTestCaseName + " | Phase Rotation Checked At Service Cut Out checkbox ticked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_phase_rotation_at_test_block(driver).click();
		{
			Log.info(sTestCaseName + " | Phase Rotation Checked At Test Block checkbox ticked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_phase_rotation_at_cust_main_switch(driver).click();
		{
			Log.info(sTestCaseName + " | Phase Rotation Checked At Customer's Main Switch checkbox ticked");
		}
		
		
				
	// END OF ADD SUCCESS VALUES DNO WC 3PH LV CT METHOD
	}

		
	/* **************************************************************************************************
	* Function: addSuccessValuesDnoWc1Ph
	* Author: Charlotte Jones
	* Date: 10/08/2018
	* Purpose: This method adds the required responses in the Phase Rotation Test section for a happy
	* 	path scenario - this is applicable for the following meter types:
	* 		DNO WC 1PH
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

	
	public static void addSuccessValuesDnoWc1Ph(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_able_to_polarity_checks_y(driver).click();
		{
			Log.info(sTestCaseName + " | Are you able to carry out Polarity Checks? - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_polarity_checked_at_cut_out(driver).click();
		{
			Log.info(sTestCaseName + " | Polarity Checked At Service Cut Out checkbox ticked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_polarity_checked_at_test_block(driver).click();
		{
			Log.info(sTestCaseName + " | Polarity Checked At Test Block checkbox ticked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_polarity_checked_at_cust_main_switch(driver).click();
		{
			Log.info(sTestCaseName + " | Polarity Checked At Customer's Main Switch checkbox ticked");
		}
		
				
				
	// END OF ADD SUCCESS VALUES DNO WC 1PH METHOD
	}	
	
	
	
	/* **************************************************************************************************
	 * Function: addSuccessValuesDnoHvCt
	 * Author: Charlotte Jones
	 * Date: 10/08/2018
	 * Purpose: This method adds the required responses in the Phase Rotation Test section for a happy
	 * 	path scenario - this is applicable for the following meter types:
	* 		DNO HV CT
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


	public static void addSuccessValuesDnoHvCt(WebDriver driver, String sTestCaseName) throws Exception{
	
	
	
		CI_Objects_Dno_Bno_Elec_Checks.btn_able_to_phase_rotation_tests(driver).click();
		{
			Log.info(sTestCaseName + " | Are you able to carry out Phase Rotation Checks? - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_phase_rotation_at_test_block(driver).click();
		{
			Log.info(sTestCaseName + " | Phase Rotation Checked At Test Block checkbox ticked");
		}
			
			
		// END OF ADD SUCCESS VALUES DNO HV CT METHOD
	}	
	
	/* **************************************************************************************************
	 * Function: addSuccessValuesBnoWc3phLvCt
	 * Author: Charlotte Jones
	 * Date: 10/08/2018
	 * Purpose: This method adds the required responses in the Phase Rotation Test section for a happy
	 * 	path scenario - this is applicable for the following meter types:
	* 		BNO WC 3PH
	* 		BNO LV CT
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


	public static void addSuccessValuesBnoWc3phLvCt(WebDriver driver, String sTestCaseName) throws Exception{
	
	
	
		CI_Objects_Dno_Bno_Elec_Checks.btn_able_to_polarity_checks_y(driver).click();
		{
			Log.info(sTestCaseName + " | Are you able to carry out Polarity Checks? - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_polarity_checked_at_cut_out(driver).click();
		{
			Log.info(sTestCaseName + " | Polarity Checked At Service Cut Out checkbox ticked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_polarity_checked_at_test_block(driver).click();
		{
			Log.info(sTestCaseName + " | Polarity Checked At Test Block checkbox ticked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_polarity_checked_at_cust_isolation(driver).click();
		{
			Log.info(sTestCaseName + " | Polarity Checked At Customer's First Point of Isolation checkbox ticked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_able_to_phase_rotation_tests(driver).click();
		{
			Log.info(sTestCaseName + " | Are you able to carry out Phase Rotation Checks? - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_phase_rotation_at_cut_out(driver).click();
		{
			Log.info(sTestCaseName + " | Phase Rotation Checked At Service Cut Out checkbox ticked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_phase_rotation_at_test_block(driver).click();
		{
			Log.info(sTestCaseName + " | Phase Rotation Checked At Test Block checkbox ticked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_phase_rotation_at_cust_main_switch(driver).click();
		{
			Log.info(sTestCaseName + " | Phase Rotation Checked At Customer's Main Switch checkbox ticked");
		}
	
	
		// END OF ADD SUCCESS VALUES BNO WC 3PH LV CT METHOD
		}
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesBnoWc1Ph
	* Author: Charlotte Jones
	* Date: 10/08/2018
	* Purpose: This method adds the required responses in the Phase Rotation Test section for a happy
	* 	path scenario - this is applicable for the following meter types:
	* 		BNO WC 1PH
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

	
	public static void addSuccessValuesBnoWc1Ph(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_able_to_polarity_checks_y(driver).click();
		{
			Log.info(sTestCaseName + " | Are you able to carry out Polarity Checks? - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_polarity_checked_at_cut_out(driver).click();
		{
			Log.info(sTestCaseName + " | Polarity Checked At Service Cut Out checkbox ticked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_polarity_checked_at_test_block(driver).click();
		{
			Log.info(sTestCaseName + " | Polarity Checked At Test Block checkbox ticked");
		}
		
		CI_Objects_Dno_Bno_Elec_Checks.btn_polarity_checked_at_cust_isolation(driver).click();
		{
			Log.info(sTestCaseName + " | Polarity Checked At Customer's First Point of Isolation checkbox ticked");
		}
		
				
				
	// END OF ADD SUCCESS VALUES BNO WC 1PH METHOD
	}	
	
	
	
	/* **************************************************************************************************
	 * Function: addSuccessValuesBnoHvCt
	 * Author: Charlotte Jones
	 * Date: 10/08/2018
	 * Purpose: This method adds the required responses in the Phase Rotation Test section for a happy
	 * 	path scenario - this is applicable for the following meter types:
	* 		BNO HV CT
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


	public static void addSuccessValuesBnoHvCt(WebDriver driver, String sTestCaseName) throws Exception{
	
	
	
		CI_Objects_Dno_Bno_Elec_Checks.btn_able_to_phase_rotation_tests(driver).click();
		{
			Log.info(sTestCaseName + " | Are you able to carry out Phase Rotation Checks? - Yes radio button clicked");
		}
			
		CI_Objects_Dno_Bno_Elec_Checks.btn_phase_rotation_at_test_block(driver).click();
		{
			Log.info(sTestCaseName + " | Phase Rotation Checked At Test Block checkbox ticked");
		}
		
				
			
		// END OF ADD SUCCESS VALUES BNO HV CT METHOD
	}	
	
	
//END OF METHODS
}