package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Dno_Bno_Work;
import utility.Log;

public class CI_Methods_Bno_Work{
	
	
	
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
	* Function: addSuccessValuesEpsc01
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.01 - Repair wiring defects job
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
	public static void addSuccessValuesEpsc01(WebDriver driver, String sTestCaseName) throws Exception{
	
	
				
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_repair_wiring_defects_y(driver).click();
		{
			Log.info(sTestCaseName + " | Repair Wiring Defects - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_p283_y(driver).click();
		{
			Log.info(sTestCaseName + " | P283 - Yes radio button clicked");
		}
		
				
	// END OF ADD SUCCESS VALUES EPSC.01 METHOD
	}

	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc02
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.02 - Replace/upgrade existing LV CTs only job
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
	public static void addSuccessValuesEpsc02(WebDriver driver, String sTestCaseName) throws Exception{
	
	
				
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_de_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | De-energise - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_ct_install_change_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Install/Change - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_p283_y(driver).click();
		{
			Log.info(sTestCaseName + " | P283 - Yes radio button clicked");
		}
		
				
	// END OF ADD SUCCESS VALUES EPSC.02 METHOD
	}	
		
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc03
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.03 - Replace Metering Termination Box job
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
	public static void addSuccessValuesEpsc03(WebDriver driver, String sTestCaseName) throws Exception{
	
	
				
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_replace_metering_termination_box_y(driver).click();
		{
			Log.info(sTestCaseName + " | Replace Metering Termination Box - Yes radio button clicked");
		}
		
		
				
	// END OF ADD SUCCESS VALUES EPSC.03 METHOD
	}
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc04
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.04 - Wire and Connect Metering Box COP2 job
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
	public static void addSuccessValuesEpsc04(WebDriver driver, String sTestCaseName) throws Exception{
	
	
				
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_wire_connect_box_cop2_y(driver).click();
		{
			Log.info(sTestCaseName + " | Wire and Connect Metering Box COP2 - Yes radio button clicked");
		}
		
		
				
	// END OF ADD SUCCESS VALUES EPSC.04 METHOD
	}

	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc05
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.05 - CTS into customer CT Chamber and connect COP5 panel job
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
	
	public static void addSuccessValuesEpsc05(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_ct_install_change_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Install/Change - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_wire_connect_box_cop5_y(driver).click();
		{
			Log.info(sTestCaseName + " | Wire and Connect Metering Box COP5 - Yes radio button clicked");
		}
		
				
	// END OF ADD SUCCESS VALUES EPSC.05 METHOD
	}	
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc06
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.06 - Replace Metering Multi Core job
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
	
	public static void addSuccessValuesEpsc06(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_replace_metering_multi_core_y(driver).click();
		{
			Log.info(sTestCaseName + " | Replace Metering Multi Core - Yes radio button clicked");
		}
		
				
				
	// END OF ADD SUCCESS VALUES EPSC.06 METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc07
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.07 - Removal of UKPN metering assets job
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
	
	public static void addSuccessValuesEpsc07(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_de_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | De-energise - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_equipment_removal_y(driver).click();
		{
			Log.info(sTestCaseName + " | Equipment Removal - Yes radio button clicked");
		}
		
		
		
				
	// END OF ADD SUCCESS VALUES EPSC.07 METHOD
	}	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc08
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.08 - HV Injection Test job
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
	
	public static void addSuccessValuesEpsc08(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_hv_injection_test_y(driver).click();
		{
			Log.info(sTestCaseName + " | HV Injection Test - Yes radio button clicked");
		}		
		
				
	// END OF ADD SUCCESS VALUES EPSC.08 METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc09
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.09 - Replace/upgrade existing CT Chamber and CT job
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
	
	public static void addSuccessValuesEpsc09(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_install_replace_chamber_y(driver).click();
		{
			Log.info(sTestCaseName + " | Install/Replace Chamber - Yes radio button clicked");
		}		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_ct_install_change_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Install/Change - Yes radio button clicked");
		}		
		
		
				
	// END OF ADD SUCCESS VALUES EPSC.09 METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc10
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.10 - Install, Connect COP3 Metering Box job
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
	
	public static void addSuccessValuesEpsc10(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_wire_connect_box_cop3_y(driver).click();
		{
			Log.info(sTestCaseName + " | Wire and Connect Metering Box COP3 - Yes radio button clicked");
		}		
				
				
	// END OF ADD SUCCESS VALUES EPSC.10 METHOD
	}
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc11
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.11 - Install, Connect COP5 Metering Box job
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
	
	public static void addSuccessValuesEpsc11(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_wire_connect_box_cop5_y(driver).click();
		{
			Log.info(sTestCaseName + " | Wire and Connect Metering Box COP5 - Yes radio button clicked");
		}		
				
				
	// END OF ADD SUCCESS VALUES EPSC.11 METHOD
	}
	
		
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc12
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.12 - Change CT ratio, Prove and & Recommission job
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
	
	public static void addSuccessValuesEpsc12(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_ct_install_change_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Install/Change - Yes radio button clicked");
		}		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_p283_y(driver).click();
		{
			Log.info(sTestCaseName + " | P283 - Yes radio button clicked");
		}	
				
	// END OF ADD SUCCESS VALUES EPSC.12 METHOD
	}
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc13
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.13 - Reposition existing CT cabinet job
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

	public static void addSuccessValuesEpsc13(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_de_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | De-energise - Yes radio button clicked");
		}		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect Tails - Yes radio button clicked");
		}	
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_install_replace_chamber_y(driver).click();
		{
			Log.info(sTestCaseName + " | Install/Replace Chamber - Yes radio button clicked");
		}		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | Energise - Yes radio button clicked");
		}	
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_p283_y(driver).click();
		{
			Log.info(sTestCaseName + " | P283 - Yes radio button clicked");
		}
				
	// END OF ADD SUCCESS VALUES EPSC.13 METHOD
	}
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc14
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.14 - Reposition Meter Termination Box job
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

	public static void addSuccessValuesEpsc14(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_de_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | De-energise - Yes radio button clicked");
		}		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_wire_connect_box_cop2_y(driver).click();
		{
			Log.info(sTestCaseName + " | Wire and Connect Metering Box COP2 - Yes radio button clicked");
		}	
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_wire_connect_box_cop3_y(driver).click();
		{
			Log.info(sTestCaseName + " | Wire and Connect Metering Box COP3 - Yes radio button clicked");
		}		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_wire_connect_box_cop5_y(driver).click();
		{
			Log.info(sTestCaseName + " | Wire and Connect Metering Box COP5 - Yes radio button clicked");
		}	
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | Energise - Yes radio button clicked");
		}
				
	// END OF ADD SUCCESS VALUES EPSC.14 METHOD
	}

	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc15
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.15 - Install UKPN CT Chamber, Connect & Energise job
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

	public static void addSuccessValuesEpsc15(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect Tails - Yes radio button clicked");
		}		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_install_replace_chamber_y(driver).click();
		{
			Log.info(sTestCaseName + " | Install/Replace Chamber - Yes radio button clicked");
		}	
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_ct_install_change_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Install/Change - Yes radio button clicked");
		}		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | Energise - Yes radio button clicked");
		}	
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_p283_y(driver).click();
		{
			Log.info(sTestCaseName + " | P283 - Yes radio button clicked");
		}
				
	// END OF ADD SUCCESS VALUES EPSC.15 METHOD
	}

	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc16
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.16 - Install UKPN CT Chamber, Connect only job
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

	public static void addSuccessValuesEpsc16(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect Tails - Yes radio button clicked");
		}		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_install_replace_chamber_y(driver).click();
		{
			Log.info(sTestCaseName + " | Install/Replace Chamber - Yes radio button clicked");
		}	
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_ct_install_change_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Install/Change - Yes radio button clicked");
		}		
			
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_p283_y(driver).click();
		{
			Log.info(sTestCaseName + " | P283 - Yes radio button clicked");
		}
				
	// END OF ADD SUCCESS VALUES EPSC.16 METHOD
	}

	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc17
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.17 - Install UKPN CT Chamber, Prove only job
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

	public static void addSuccessValuesEpsc17(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_install_replace_chamber_y(driver).click();
		{
			Log.info(sTestCaseName + " | Install/Replace Chamber - Yes radio button clicked");
		}	
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_ct_install_change_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Install/Change - Yes radio button clicked");
		}		
			
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_p283_y(driver).click();
		{
			Log.info(sTestCaseName + " | P283 - Yes radio button clicked");
		}
				
	// END OF ADD SUCCESS VALUES EPSC.17 METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc18
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.18 - Connect customer tails to CT Chamber only job
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

	public static void addSuccessValuesEpsc18(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect Tails - Yes radio button clicked");
		}		
		
				
	// END OF ADD SUCCESS VALUES EPSC.18 METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc19
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.19 - Connect customer tails to CT Chamber & Energise job
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

	public static void addSuccessValuesEpsc19(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect Tails - Yes radio button clicked");
		}		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | Energise - Yes radio button clicked");
		}		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_p283_y(driver).click();
		{
			Log.info(sTestCaseName + " | P283 - Yes radio button clicked");
		}		
		
		
				
	// END OF ADD SUCCESS VALUES EPSC.19 METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc20
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.20 - Energise Meter Point or BNO boundary job
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

	public static void addSuccessValuesEpsc20(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect Tails - Yes radio button clicked");
		}		
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | Energise - Yes radio button clicked");
		}			
		
		
				
	// END OF ADD SUCCESS VALUES EPSC.20 METHOD
	}	
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc21
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.21 - Replace UKPN fuses with specific size job
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

	public static void addSuccessValuesEpsc21(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_de_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | De-energise - Yes radio button clicked");
		}			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | Energise - Yes radio button clicked");
		}			
		
				
	// END OF ADD SUCCESS VALUES EPSC.21 METHOD
	}	
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc22
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.22 - De-energise Meter Point or BNO boundary job
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

	public static void addSuccessValuesEpsc22(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_de_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | De-energise - Yes radio button clicked");
		}			
	
				
	// END OF ADD SUCCESS VALUES EPSC.22 METHOD
	}	
	
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc23
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.23 - Change customer tails (temporary De-energise/Re-energise) job
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

	public static void addSuccessValuesEpsc23(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_de_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | De-energise - Yes radio button clicked");
		}			
	
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect Tails - Yes radio button clicked");
		}			
	
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | Energise - Yes radio button clicked");
		}			
	
				
	// END OF ADD SUCCESS VALUES EPSC.23 METHOD
	}	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc24
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.24 - Isolation only (De-energise/Re-energise) job
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

	public static void addSuccessValuesEpsc24(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_de_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | De-energise - Yes radio button clicked");
		}			
	
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | Energise - Yes radio button clicked");
		}			
	
				
	// END OF ADD SUCCESS VALUES EPSC.24 METHOD
	}	
		
		
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc25
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.25 - Connect & Energise <=100A BNO Network job
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

	public static void addSuccessValuesEpsc25(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect Tails - Yes radio button clicked");
		}			
	
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | Energise - Yes radio button clicked");
		}			
	
				
	// END OF ADD SUCCESS VALUES EPSC.25 METHOD
	}	
		
		
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc26
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.26 -  Connect & Energise >100A BNO Network job
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

	public static void addSuccessValuesEpsc26(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect Tails - Yes radio button clicked");
		}			
	
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | Energise - Yes radio button clicked");
		}			
	
				
	// END OF ADD SUCCESS VALUES EPSC.26 METHOD
	}	
		
	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc27
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.27 -  Site safety inspection of BNO Network job
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

	public static void addSuccessValuesEpsc27(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_survey_work_y(driver).click();
		{
			Log.info(sTestCaseName + " | Survey Work - Yes radio button clicked");
		}				
	
				
	// END OF ADD SUCCESS VALUES EPSC.27 METHOD
	}	
		
				
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc28
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.28 -  Inspect & Commission Change Over switch job
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

	public static void addSuccessValuesEpsc28(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_survey_work_y(driver).click();
		{
			Log.info(sTestCaseName + " | Survey Work - Yes radio button clicked");
		}				
	
				
	// END OF ADD SUCCESS VALUES EPSC.28 METHOD
	}	

	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc29
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.29 -  Customer Advisory visit job
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

	public static void addSuccessValuesEpsc29(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_survey_work_y(driver).click();
		{
			Log.info(sTestCaseName + " | Survey Work - Yes radio button clicked");
		}				
	
				
	// END OF ADD SUCCESS VALUES EPSC.29 METHOD
	}	

	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc30
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.30 -  Site investigation visit job
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

	public static void addSuccessValuesEpsc30(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_survey_work_y(driver).click();
		{
			Log.info(sTestCaseName + " | Survey Work - Yes radio button clicked");
		}				
	
				
	// END OF ADD SUCCESS VALUES EPSC.30 METHOD
	}	

	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc31
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.31 -  Railway PME survey job
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

	public static void addSuccessValuesEpsc31(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_survey_work_y(driver).click();
		{
			Log.info(sTestCaseName + " | Survey Work - Yes radio button clicked");
		}				
	
				
	// END OF ADD SUCCESS VALUES EPSC.31 METHOD
	}	

	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc33
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.33 -  Inspect adoptable CT metering system job
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

	public static void addSuccessValuesEpsc33(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_survey_work_y(driver).click();
		{
			Log.info(sTestCaseName + " | Survey Work - Yes radio button clicked");
		}				
	
				
	// END OF ADD SUCCESS VALUES EPSC.33 METHOD
	}	

	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc35
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.35 -  P283 Commission only job
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

	public static void addSuccessValuesEpsc35(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_p283_y(driver).click();
		{
			Log.info(sTestCaseName + " | P283 - Yes radio button clicked");
		}				
	
				
	// END OF ADD SUCCESS VALUES EPSC.35 METHOD
	}	

	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc36
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.36 -  Combined Unit, Connect tails and P283 job
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

	public static void addSuccessValuesEpsc36(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect Tails - Yes radio button clicked");
		}				
	
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_p283_y(driver).click();
		{
			Log.info(sTestCaseName + " | P283 - Yes radio button clicked");
		}				
	
				
	// END OF ADD SUCCESS VALUES EPSC.36 METHOD
	}	

	
	/* **************************************************************************************************
	* Function: addSuccessValuesEpsc37
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario for a DNO EPSC.37 -  Combined Unit, Connect tails, Energise and P283 job
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

	public static void addSuccessValuesEpsc37(WebDriver driver, String sTestCaseName) throws Exception{
			
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_connect_tails_y(driver).click();
		{
			Log.info(sTestCaseName + " | Connect Tails - Yes radio button clicked");
		}				
	
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_energise_y(driver).click();
		{
			Log.info(sTestCaseName + " | Energise - Yes radio button clicked");
		}
		
		CI_Objects_Dno_Bno_Work.DNO_BNO_TASKS.btn_p283_y(driver).click();
		{
			Log.info(sTestCaseName + " | P283 - Yes radio button clicked");
		}				
	
				
	// END OF ADD SUCCESS VALUES EPSC.37 METHOD
	}	

	
	
	
//END OF METHODS
}