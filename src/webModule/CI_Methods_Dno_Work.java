package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Dno_Bno_Work;
import utility.Log;

public class CI_Methods_Dno_Work{
	
	
	
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
	* Function: addSuccessValuesBno1
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a BNO 1 - Wire and Connect Metering Termination Box to EHV/HV metering unit BSC COP2 job
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
	public static void addSuccessValuesBno1(WebDriver driver, String sTestCaseName) throws Exception{
	
	
				
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_wire_connect_box_cop2_y(driver).click();
		{
			Log.info(sTestCaseName + " | Wire and Connect Metering Box COP3 - Yes radio button clicked");
		}
	
				
	// END OF ADD SUCCESS VALUES BNO 1 METHOD
	}

	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesBno2
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a BNO 2 - Wire and Connect Metering Termination Box to EHV/HV metering unit BSC COP3 job
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
	public static void addSuccessValuesBno2(WebDriver driver, String sTestCaseName) throws Exception{
	
	
				
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_wire_connect_box_cop3_y(driver).click();
		{
			Log.info(sTestCaseName + " |Wire and Connect Metering Box COP3 - Yes radio button clicked");
		}
		
				
	// END OF ADD SUCCESS VALUES BNO 2 METHOD
	}	
		
	
	/* **************************************************************************************************
	* Function: addSuccessValuesBno3
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a BNO 3 -  Wire and Connect Metering Termination Box to EHV/HV metering unit BSC COP5 job
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
	public static void addSuccessValuesBno3(WebDriver driver, String sTestCaseName) throws Exception{
	
	
				
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_wire_connect_box_cop5_y(driver).click();
		{
			Log.info(sTestCaseName + " | Wire and Connect Metering Box COP5 - Yes radio button clicked");
		}
		
		
				
	// END OF ADD SUCCESS VALUES BNO 3 METHOD
	}
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesBno4
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a BNO 4 - Reposition Metering Termination Box - for an existing service job
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
	public static void addSuccessValuesBno4(WebDriver driver, String sTestCaseName) throws Exception{
	
	
				
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_replace_reposition_metering_termination_box_y(driver).click();
		{
			Log.info(sTestCaseName + " | Replace/Reposition Metering Termination Box - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_replace_reconnect_metering_multi_core_y(driver).click();
		{
			Log.info(sTestCaseName + " | Replace/Reconnect Metering Multi Core - Yes radio button clicked");
		}
		
				
	// END OF ADD SUCCESS VALUES BNO 4 METHOD
	}

	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesBno5
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a BNO 5 - Reposition existing CT Cabinet job
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
	
	public static void addSuccessValuesBno5(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_re_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect/Reconnect Tails - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_install_replace_reposition_chamber_y(driver).click();
		{
			Log.info(sTestCaseName + " | Install/Replace Reposition Chamber - Yes radio button clicked");
		}
		
				
	// END OF ADD SUCCESS VALUES BNO 5 METHOD
	}	
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesBno6
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a BNO 6 - Install CV cabinet only job
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
	
	public static void addSuccessValuesBno6(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_install_replace_reposition_chamber_y(driver).click();
		{
			Log.info(sTestCaseName + " | Install/Replace/Reposition Chamber - Yes radio button clicked");
		}
		
				
				
	// END OF ADD SUCCESS VALUES BNO 6 METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesBno7
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a BNO 7 - Provide and install 200A CTs into existing CT chamber and perform all
	* 	secondary wiring job
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
	
	public static void addSuccessValuesBno7(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_ct_install_change_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Install/Change - Yes radio button clicked");
		}	
		
				
	// END OF ADD SUCCESS VALUES BNO 7 METHOD
	}	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesBno8
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a BNO 8 - Provide and install 400A CTs into existing CT chamber and perform all
	* 	secondary wiring job
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
	
	public static void addSuccessValuesBno8(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_ct_install_change_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Install/Change - Yes radio button clicked");
		}
				
	// END OF ADD SUCCESS VALUES BNO 8 METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesBno9
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a BNO 9 - Install 200A CTs into existing CT chamber and perform all
	* 	secondary wiring job
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
	
	public static void addSuccessValuesBno9(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_re_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect/Reconnect Tails - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_install_replace_reposition_chamber_y(driver).click();
		{
			Log.info(sTestCaseName + " | Install/Replace/Reposition Chamber - Yes radio button clicked");
		}		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_ct_install_change_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Install/Change - Yes radio button clicked");
		}		
	
				
	// END OF ADD SUCCESS VALUES BNO 9 METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesBno10
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a BNO 10 - Install 400A CTs into existing CT chamber and perform all
	* 	secondary wiring job
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
	
	public static void addSuccessValuesBno10(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_re_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect/Reconnect Tails - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_install_replace_reposition_chamber_y(driver).click();
		{
			Log.info(sTestCaseName + " | Install/Replace/Reposition Chamber - Yes radio button clicked");
		}		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_ct_install_change_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Install/Change - Yes radio button clicked");
		}		
		
				
	// END OF ADD SUCCESS VALUES BNO 10 METHOD
	}
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesBno11
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a BNO 11 - Connect customer Tails to Existing CT Cabinet only job
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
	
	public static void addSuccessValuesBno11(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_re_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect/Reconnect Tails - Yes radio button clicked");
		}	
				
	// END OF ADD SUCCESS VALUES BNO 11 METHOD
	}
	
		
	
	/* **************************************************************************************************
	* Function: addSuccessValuesBno12
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a BNO 12 - Change CT ratio, Prove and & Recommission job
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
	
	public static void addSuccessValuesBno12(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_de_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | De-energise - Yes radio button clicked");
		}			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_re_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect/Reconnect Tails - Yes radio button clicked");
		}	
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | Energise - Yes radio button clicked");
		}	
		
				
	// END OF ADD SUCCESS VALUES BNO 12 METHOD
	}
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesBno13
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a BNO 13 - Site Survey job
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

	public static void addSuccessValuesBno13(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_survey_work_y(driver).click();
		{
			Log.info(sTestCaseName + " | Survey Work - Yes radio button clicked");
		}		
				
	// END OF ADD SUCCESS VALUES BNO 13 METHOD
	}
	
	
	
	
	
	
	
//END OF METHODS
}