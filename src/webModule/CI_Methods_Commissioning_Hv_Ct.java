package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Commissioning_Hv_Ct;
import utility.Log;

public class CI_Methods_Commissioning_Hv_Ct{
	
	
	
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
	* Function: addSuccessValuesAllPart1
	* Author: Charlotte Jones
	* Date: 08/08/2018
	* Purpose: This method adds the required responses in the Commissioning Document - HV CT
	* section for a happy path scenario
	* Arguments: 	sSerialNum
		 			iL1L2
					iL1L3
		 			iL2L3
					iL1Earth
					iL1Neutral
		 			iL1MeasuredVoltsSec
		 			iL1MeasuredIPri
					iL1MeasuredISec
		 			iL3MeasuredVoltsSec
		 			iL1MeasuredVoltsLv
					iL1MeasuredILv
					iL1MeasuredVoltsSecHv
					iL1MeasuredISecHv
					iL2MeasuredVoltsLv
					iL2MeasuredILv
					iL3MeasuredVoltsLv
					iL3MeasuredILv
		 			iL3MeasuredVoltsSecHv
					iL3MeasuredISecHv
					iL1MeasuredVolts
					iL1MeasuredKvaP
					iL1MeasuredKvaS
					iL2MeasuredVolts
					iL2MeasuredIPri
					iL2MeasuredISec
					iL2MeasuredKvaP
					iL2MeasuredKvaS
					iL3MeasuredVolts
					iL3MeasuredIPri
					iL3MeasuredISec
					iL3MeasuredKvaP
					iL3MeasuredKvaS
					iL1MeterIndicVPri
		 			iL1MeterIndicIPri
		 			iL2MeterIndicVPri
					iL2MeterIndicIPri
					iL3MeterIndicVPri
					iL3MeterIndicIPri
					iDisplayKw
		 			iDisplayKvar
		  			sDisplayPf
					iDisplayKva
					iRisingMD
					iTimeSecs
					sUnit
		 			iImpulsesKwAct
					iImpulsesKwTime
	*				iImpulsesKwPulseVal
	*				iImpulsesKvarAct
	*				iImpulsesKvarTime
	*				iImpulsesKvarPulseVal
	*				sTimeStart
	*				sTimeFinish
	*	 			iImportKwhStart
	*	 			iImportKwhFinish
	*				iExportKwhStart
	*				iExportKwhFinish
	*				iTotalKvarhStart
	*				iTotalKvarhFinish
	*				iTotalKvahStart
	*				iTotalKvahFinish
	*				sCommissDate
	*				sComments
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValuesAllPart1(WebDriver driver, String sTestCaseName) throws Exception{
	
	
		// *!*!*!*!*!*!* values needed for below variables *!*!*!*!*!*!*
		
		String 	sSerialNum = "";
		Integer iL1L2 = 111;
		Integer	iL1L3 = 123;
		Integer iL2L3 = 234;
		Integer	iL1Earth = 345;
		Integer	iL1Neutral = 456;
		Integer iL1MeasuredVoltsSec = 45;
		Integer iL1MeasuredIPri = 12;
		Integer	iL1MeasuredISec = 52;
		Integer iL3MeasuredVoltsSec = 5;
		Integer	iL3MeasuredIPri = 7;
		Integer	iL3MeasuredISec = 68;
		
				
		CI_Objects_Commissioning_Hv_Ct.btn_can_meters_be_commissioned_y(driver).click();
		{
			Log.info(sTestCaseName + " | Can meters be commissioned? - Yes radio button clicked");
		}
		
		// Meter Checks sub-section
		
		CI_Objects_Commissioning_Hv_Ct.cbx_serial_num(driver).click();
		CI_Objects_Commissioning_Hv_Ct.cbx_serial_num(driver).sendKeys(sSerialNum);
		{
			Log.info(sTestCaseName + " | Serial Number field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.btn_date_time_correct_n(driver).click();
		{
			Log.info(sTestCaseName + " | Meter time and date correct - No radio button selected");
		}
		
		CI_Objects_Commissioning_Hv_Ct.btn_operator_label_fitted_y(driver).click();
		{
			Log.info(sTestCaseName + " | Meter operator label fitted - Yes radio button selected");
		}
		
		CI_Objects_Commissioning_Hv_Ct.btn_wiring_connected_correctly_n(driver).click();
		{
			Log.info(sTestCaseName + " | Wiring connected correctly - No radio button selected");
		}
		
		CI_Objects_Commissioning_Hv_Ct.btn_phase_rotation_correct_y(driver).click();
		{
			Log.info(sTestCaseName + " | Phase rotation correct at meter - Yes radio button selected");
		}
		
		CI_Objects_Commissioning_Hv_Ct.btn_ct_polarity_correct_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Polarity correct - Yes radio button selected");
		}
		
		CI_Objects_Commissioning_Hv_Ct.btn_meter_advances_each_element_y(driver).click();
		{
			Log.info(sTestCaseName + " | Meter advances on each element - Yes radio button selected");
		}
		
		CI_Objects_Commissioning_Hv_Ct.btn_test_block_correct_y(driver).click();
		{
			Log.info(sTestCaseName + " | Test block operation correct - Yes radio button selected");
		}
		
		CI_Objects_Commissioning_Hv_Ct.btn_phase_failure_indication_working_n(driver).click();
		{
			Log.info(sTestCaseName + " | Phase failure indication working - No radio button selected");
		}
		
		CI_Objects_Commissioning_Hv_Ct.btn_ct_burden_less_than_ct_rating_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Burden < CT Rating - Yes radio button selected");
		}
		
		CI_Objects_Commissioning_Hv_Ct.btn_vt_burden_less_than_vt_rating_n(driver).click();
		{
			Log.info(sTestCaseName + " | VT Burden < VT Rating - No radio button selected");
		}
		
		CI_Objects_Commissioning_Hv_Ct.btn_ct_ratio_confirmed_y(driver).click();
		{
			Log.info(sTestCaseName + " | PCT Ratio confirmed - Yes radio button selected");
		}
		
		// Phase Voltages sub-section
		
		CI_Objects_Commissioning_Hv_Ct.txt_l1_l2(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l1_l2(driver).sendKeys(Integer.toString(iL1L2));
		{
			Log.info(sTestCaseName + " | L1 - L2 field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l1_l3(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l1_l3(driver).sendKeys(Integer.toString(iL1L3));
		{
			Log.info(sTestCaseName + " | L1 - L3 field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l2_l3(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l2_l3(driver).sendKeys(Integer.toString(iL2L3));
		{
			Log.info(sTestCaseName + " | L2 - L3 field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l1_earth(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l1_earth(driver).sendKeys(Integer.toString(iL1Earth));
		{
			Log.info(sTestCaseName + " | L1 - Earth field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l1_neutral(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l1_neutral(driver).sendKeys(Integer.toString(iL1Neutral));
		{
			Log.info(sTestCaseName + " | L1 - Neutral field completed");
		}
		
		// Measured and Calculated Load Values
		
		CI_Objects_Commissioning_Hv_Ct.cbx_primary_currents_measured_hv(driver).click();
		{
			Log.info(sTestCaseName + " | Which Primary Currents Can Be Measured? - HV radio button selected");
		}
		
		// Measured and Calculated Load Values with HV Currents (display with the Meter Indicated Values section) sub-section
		
		CI_Objects_Commissioning_Hv_Ct.txt_l1_measured_volts_sec(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l1_measured_volts_sec(driver).sendKeys(Integer.toString(iL1MeasuredVoltsSec));
		{
			Log.info(sTestCaseName + " | L1 - Measured - Volts (sec) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l1_measured_i_pri(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l1_measured_i_pri(driver).sendKeys(Integer.toString(iL1MeasuredIPri));
		{
			Log.info(sTestCaseName + " | L1 - Measured - I (pri) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l1_measured_i_sec(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l1_measured_i_sec(driver).sendKeys(Integer.toString(iL1MeasuredISec));
		{
			Log.info(sTestCaseName + " | L1 - Measured - I (sec) field completed");
		}
		CI_Objects_Commissioning_Hv_Ct.txt_l3_measured_volts_sec(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l3_measured_volts_sec(driver).sendKeys(Integer.toString(iL3MeasuredVoltsSec));
		{
			Log.info(sTestCaseName + " | L3 - Measured - Volts field completed");
		}
			
		CI_Objects_Commissioning_Hv_Ct.txt_l3_measured_i_pri(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l3_measured_i_pri(driver).sendKeys(Integer.toString(iL3MeasuredIPri));
		{
			Log.info(sTestCaseName + " | L3 - Measured - I (pri) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l3_measured_i_sec(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l3_measured_i_sec(driver).sendKeys(Integer.toString(iL3MeasuredISec));
		{
			Log.info(sTestCaseName + " | L3 - Measured - I (sec) field completed");
		}		
	
		
		
	// END OF ADD SUCCESS VALUES ALL PART 1 METHODS 	
	}		
		
	/* **************************************************************************************************
	* Function: addSuccessValuesAllPart1
	* Author: Charlotte Jones
	* Date: 08/08/2018
	* Purpose: This method adds the required responses in the Commissioning Document - HV CT
	* section for a happy path scenario
	* Arguments: 	sSerialNum
			 			iL1L2
						iL1L3
			 			iL2L3
						iL1Earth
						iL1Neutral
			 			iL1MeasuredVoltsSec
			 			iL1MeasuredIPri
						iL1MeasuredISec
			 			iL3MeasuredVoltsSec
			 			iL1MeasuredVoltsLv
						iL1MeasuredILv
						iL1MeasuredVoltsSecHv
						iL1MeasuredISecHv
						iL2MeasuredVoltsLv
						iL2MeasuredILv
						iL3MeasuredVoltsLv
						iL3MeasuredILv
			 			iL3MeasuredVoltsSecHv
						iL3MeasuredISecHv
						iL1MeasuredVolts
						iL1MeasuredKvaP
						iL1MeasuredKvaS
						iL2MeasuredVolts
						iL2MeasuredIPri
						iL2MeasuredISec
						iL2MeasuredKvaP
						iL2MeasuredKvaS
						iL3MeasuredVolts
						iL3MeasuredIPri
						iL3MeasuredISec
						iL3MeasuredKvaP
						iL3MeasuredKvaS
						iL1MeterIndicVPri
			 			iL1MeterIndicIPri
			 			iL2MeterIndicVPri
						iL2MeterIndicIPri
						iL3MeterIndicVPri
						iL3MeterIndicIPri
						iDisplayKw
			 			iDisplayKvar
			  			sDisplayPf
						iDisplayKva
						iRisingMD
						iTimeSecs
						sUnit
			 			iImpulsesKwAct
						iImpulsesKwTime
						iImpulsesKwPulseVal
						iImpulsesKvarAct
						iImpulsesKvarTime
						iImpulsesKvarPulseVal
						sTimeStart
						sTimeFinish
			 			iImportKwhStart
			 			iImportKwhFinish
						iExportKwhStart
						iExportKwhFinish
						iTotalKvarhStart
						iTotalKvarhFinish
						iTotalKvahStart
						iTotalKvahFinish
						sCommissDate
					sComments
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValuesLvCurrents(WebDriver driver, String sTestCaseName) throws Exception{
		
	
		// *!*!*!*!*!*!* values needed for below variables *!*!*!*!*!*!*
		
		Integer	iL1MeasuredVoltsLv = 67;
		Integer	iL1MeasuredILv = 95;
		Integer	iL1MeasuredVoltsSecHv = 45;
		Integer	iL1MeasuredISecHv = 6;
		Integer	iL2MeasuredVoltsLv = 1;
		Integer	iL2MeasuredILv = 3;
		Integer	iL3MeasuredVoltsLv = 8;
		Integer	iL3MeasuredILv = 8;
		Integer iL3MeasuredVoltsSecHv = 9;
		Integer	iL3MeasuredISecHv = 7;
		
		
		// Measured and Calculated Load Values with LV Currents (display with the Meter Indicated Values section) sub-section
		
		CI_Objects_Commissioning_Hv_Ct.txt_l1_measured_volts_lv(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l1_measured_volts_lv(driver).sendKeys(Integer.toString(iL1MeasuredVoltsLv));
		{
			Log.info(sTestCaseName + " | L1 - Measured - Volts (LV) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l1_measured_i_lv(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l1_measured_i_lv(driver).sendKeys(Integer.toString(iL1MeasuredILv));
		{
			Log.info(sTestCaseName + " | L1 - Measured - I (LV) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l1_measured_volts_sec_hv(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l1_measured_volts_sec_hv(driver).sendKeys(Integer.toString(iL1MeasuredVoltsSecHv));
		{
			Log.info(sTestCaseName + " | L1 - Measured - Volts (sec HV) field completed");
		}
				
		CI_Objects_Commissioning_Hv_Ct.txt_l1_measured_i_sec_hv(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l1_measured_i_sec_hv(driver).sendKeys(Integer.toString(iL1MeasuredISecHv));
		{
			Log.info(sTestCaseName + " | L1 - Measured - I (sec HV) field completed");
		}
		
		// *!*!*!*!*!*!* Need to include method for Read Only kVA (LV) check *!*!*!*!*!*!*
		// *!*!*!*!*!*!* Need to include method for Read Only kVA (HV) check *!*!*!*!*!*!*
		
		CI_Objects_Commissioning_Hv_Ct.txt_l2_measured_volts_lv(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l2_measured_volts_lv(driver).sendKeys(Integer.toString(iL2MeasuredVoltsLv));
		{
			Log.info(sTestCaseName + " | L2 - Measured - Volts (LV) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l2_measured_i_lv(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l2_measured_i_lv(driver).sendKeys(Integer.toString(iL2MeasuredILv));
		{
			Log.info(sTestCaseName + " | L2 - Measured - I (LV) field completed");
		}
		
		// *!*!*!*!*!*!* Need to include method for Read Only kVA (LV) check *!*!*!*!*!*!*
		
		CI_Objects_Commissioning_Hv_Ct.txt_l3_measured_volts_lv(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l3_measured_volts_lv(driver).sendKeys(Integer.toString(iL3MeasuredVoltsLv));
		{
			Log.info(sTestCaseName + " | L3 - Measured - Volts (LV) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l3_measured_i_lv(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l3_measured_i_lv(driver).sendKeys(Integer.toString(iL3MeasuredILv));
		{
			Log.info(sTestCaseName + " | L3 - Measured - I (LV) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l3_measured_volts_sec_hv(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l3_measured_volts_sec_hv(driver).sendKeys(Integer.toString(iL3MeasuredVoltsSecHv));
		{
			Log.info(sTestCaseName + " | L3 - Measured - Volts (LV) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l3_measured_i_sec_hv(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l3_measured_i_sec_hv(driver).sendKeys(Integer.toString(iL3MeasuredISecHv));
		{
			Log.info(sTestCaseName + " | L3 - Measured - I (sec) field completed");
		}
		
		// *!*!*!*!*!*!* Need to include method for Read Only kVA (LV) check *!*!*!*!*!*!*
		// *!*!*!*!*!*!* Need to include method for Read Only kVA (HV) check *!*!*!*!*!*!*
		
		
		// *!*!*!*!*!*!* Need to include method for Read Only kVA (LV) - TOTAL check *!*!*!*!*!*!*
		// *!*!*!*!*!*!* Need to include method for Read Only kVA (HV) - TOTAL check *!*!*!*!*!*!*
	
		
	// END OF ADD SUCCESS VALUES LV CURRENTS METHOD	
	}	
	

	/* **************************************************************************************************
	* Function: addSuccessValuesAllPart1
	* Author: Charlotte Jones
	* Date: 08/08/2018
	* Purpose: This method adds the required responses in the Commissioning Document - HV CT
	* section for a happy path scenario
	* Arguments: 	sSerialNum
			 			iL1L2
						iL1L3
			 			iL2L3
						iL1Earth
						iL1Neutral
			 			iL1MeasuredVoltsSec
			 			iL1MeasuredIPri
						iL1MeasuredISec
			 			iL3MeasuredVoltsSec
			 			iL1MeasuredVoltsLv
						iL1MeasuredILv
						iL1MeasuredVoltsSecHv
						iL1MeasuredISecHv
						iL2MeasuredVoltsLv
						iL2MeasuredILv
						iL3MeasuredVoltsLv
						iL3MeasuredILv
			 			iL3MeasuredVoltsSecHv
						iL3MeasuredISecHv
						iL1MeasuredVolts
						iL1MeasuredKvaP
						iL1MeasuredKvaS
						iL2MeasuredVolts
						iL2MeasuredIPri
						iL2MeasuredISec
						iL2MeasuredKvaP
						iL2MeasuredKvaS
						iL3MeasuredVolts
						iL3MeasuredIPri
						iL3MeasuredISec
						iL3MeasuredKvaP
						iL3MeasuredKvaS
						iL1MeterIndicVPri
			 			iL1MeterIndicIPri
			 			iL2MeterIndicVPri
						iL2MeterIndicIPri
						iL3MeterIndicVPri
						iL3MeterIndicIPri
						iDisplayKw
			 			iDisplayKvar
			  			sDisplayPf
						iDisplayKva
						iRisingMD
						iTimeSecs
						sUnit
			 			iImpulsesKwAct
						iImpulsesKwTime
						iImpulsesKwPulseVal
						iImpulsesKvarAct
						iImpulsesKvarTime
						iImpulsesKvarPulseVal
						sTimeStart
						sTimeFinish
			 			iImportKwhStart
			 			iImportKwhFinish
						iExportKwhStart
						iExportKwhFinish
						iTotalKvarhStart
						iTotalKvarhFinish
						iTotalKvahStart
						iTotalKvahFinish
						sCommissDate
					sComments
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValuesHvCurrents(WebDriver driver, String sTestCaseName) throws Exception{
		
		// *!*!*!*!*!*!* values needed for below variables *!*!*!*!*!*!*
		

		Integer iL1MeasuredIPri = 12;
		Integer	iL1MeasuredISec = 52;
		Integer	iL1MeasuredVolts = 4;
		Integer	iL1MeasuredKvaP = 2;
		Integer	iL1MeasuredKvaS = 5;
		Integer	iL2MeasuredVolts = 6;
		Integer	iL2MeasuredIPri = 8;
		Integer	iL2MeasuredISec = 4;
		Integer	iL2MeasuredKvaP = 6;
		Integer	iL2MeasuredKvaS = 44;
		Integer	iL3MeasuredVolts = 215;
		Integer	iL3MeasuredIPri = 7;
		Integer	iL3MeasuredISec = 68;
		Integer	iL3MeasuredKvaP = 5;
		Integer	iL3MeasuredKvaS = 6;
	
	
	
		// Measured and Calculated Load Values With HV 4 Wire Currents (display with the Meter Indicated Values section)
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l1_measured_volts(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l1_measured_volts(driver).sendKeys(Integer.toString(iL1MeasuredVolts));
		{
			Log.info(sTestCaseName + " | L1 - Measured - Volts (HV4 section) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l1_measured_i_pri(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l1_measured_i_pri(driver).sendKeys(Integer.toString(iL1MeasuredIPri));
		{
			Log.info(sTestCaseName + " | L1 - Measured - I (pri) (HV4 section) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l1_measured_i_sec(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l1_measured_i_sec(driver).sendKeys(Integer.toString(iL1MeasuredISec));
		{
			Log.info(sTestCaseName + " | L1 - Measured - I (sec) (HV4 section) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l1_measured_kva_p(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l1_measured_kva_p(driver).sendKeys(Integer.toString(iL1MeasuredKvaP));
		{
			Log.info(sTestCaseName + " | L1 - Measured - kVA (P) (HV4 section) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l1_measured_kva_s(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l1_measured_kva_s(driver).sendKeys(Integer.toString(iL1MeasuredKvaS));
		{
			Log.info(sTestCaseName + " | L1 - Measured - kVA (S) (HV4 section) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l2_measured_volts(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l2_measured_volts(driver).sendKeys(Integer.toString(iL2MeasuredVolts));
		{
			Log.info(sTestCaseName + " | L2 - Measured - Volts (HV4 section) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l2_measured_i_pri(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l2_measured_i_pri(driver).sendKeys(Integer.toString(iL2MeasuredIPri));
		{
			Log.info(sTestCaseName + " | L2 - Measured - I (pri) (HV4 section) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l2_measured_i_sec(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l2_measured_i_sec(driver).sendKeys(Integer.toString(iL2MeasuredISec));
		{
			Log.info(sTestCaseName + " | L2 - Measured - I (sec) (HV4 section) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l2_measured_kva_p(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l2_measured_kva_p(driver).sendKeys(Integer.toString(iL2MeasuredKvaP));
		{
			Log.info(sTestCaseName + " | L2 - Measured - kVA (P) (HV4 section) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l2_measured_kva_s(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l2_measured_kva_s(driver).sendKeys(Integer.toString(iL2MeasuredKvaS));
		{
			Log.info(sTestCaseName + " | L2 - Measured - kVA (S) (HV4 section) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l3_measured_volts(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l3_measured_volts(driver).sendKeys(Integer.toString(iL3MeasuredVolts));
		{
			Log.info(sTestCaseName + " | L3 - Measured - Volts (HV4 section) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l3_measured_i_pri(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l3_measured_i_pri(driver).sendKeys(Integer.toString(iL3MeasuredIPri));
		{
			Log.info(sTestCaseName + " | L3 - Measured - I (pri) (HV4 section) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l3_measured_i_sec(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l3_measured_i_sec(driver).sendKeys(Integer.toString(iL3MeasuredISec));
		{
			Log.info(sTestCaseName + " | L3 - Measured - I (sec) (HV4 section) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l3_measured_kva_p(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l3_measured_kva_p(driver).sendKeys(Integer.toString(iL3MeasuredKvaP));
		{
			Log.info(sTestCaseName + " | L3 - Measured - kVA (P) (HV4 section) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l3_measured_kva_s(driver).click();
		CI_Objects_Commissioning_Hv_Ct.WITH_HV_4_WIRE_CURRENTS.txt_l3_measured_kva_s(driver).sendKeys(Integer.toString(iL3MeasuredKvaS));
		{
			Log.info(sTestCaseName + " | L3 - Measured - kVA (S) (HV4 section) field completed");
		}
		
		// *!*!*!*!*!*!* Need to include method for Read Only kVA (P) check *!*!*!*!*!*!*
		// *!*!*!*!*!*!* Need to include method for Read Only kVA (S) check *!*!*!*!*!*!*
	
		
		
	// END OF ADD SUCCESS VALUES HV CURRENTS METHOD 	
	}
		
	/* **************************************************************************************************
	* Function: addSuccessValuesAllPart1
	* Author: Charlotte Jones
	* Date: 08/08/2018
	* Purpose: This method adds the required responses in the Commissioning Document - HV CT
	* section for a happy path scenario
	* Arguments: 	sSerialNum
			 			iL1L2
						iL1L3
			 			iL2L3
						iL1Earth
						iL1Neutral
			 			iL1MeasuredVoltsSec
			 			iL1MeasuredIPri
						iL1MeasuredISec
			 			iL3MeasuredVoltsSec
			 			iL1MeasuredVoltsLv
						iL1MeasuredILv
						iL1MeasuredVoltsSecHv
						iL1MeasuredISecHv
						iL2MeasuredVoltsLv
						iL2MeasuredILv
						iL3MeasuredVoltsLv
						iL3MeasuredILv
			 			iL3MeasuredVoltsSecHv
						iL3MeasuredISecHv
						iL1MeasuredVolts
						iL1MeasuredKvaP
						iL1MeasuredKvaS
						iL2MeasuredVolts
						iL2MeasuredIPri
						iL2MeasuredISec
						iL2MeasuredKvaP
						iL2MeasuredKvaS
						iL3MeasuredVolts
						iL3MeasuredIPri
						iL3MeasuredISec
						iL3MeasuredKvaP
						iL3MeasuredKvaS
						iL1MeterIndicVPri
			 			iL1MeterIndicIPri
			 			iL2MeterIndicVPri
						iL2MeterIndicIPri
						iL3MeterIndicVPri
						iL3MeterIndicIPri
						iDisplayKw
			 			iDisplayKvar
			  			sDisplayPf
						iDisplayKva
						iRisingMD
						iTimeSecs
						sUnit
			 			iImpulsesKwAct
						iImpulsesKwTime
						iImpulsesKwPulseVal
						iImpulsesKvarAct
						iImpulsesKvarTime
						iImpulsesKvarPulseVal
						sTimeStart
						sTimeFinish
			 			iImportKwhStart
			 			iImportKwhFinish
						iExportKwhStart
						iExportKwhFinish
						iTotalKvarhStart
						iTotalKvarhFinish
						iTotalKvahStart
						iTotalKvahFinish
						sCommissDate
					sComments
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValuesAllPart2(WebDriver driver, String sTestCaseName) throws Exception{
		
		// *!*!*!*!*!*!* values needed for below variables *!*!*!*!*!*!*
		
		Integer	iL1MeterIndicVPri = 66;
		Integer iL1MeterIndicIPri = 44;
		Integer iL2MeterIndicVPri = 200;
		Integer	iL2MeterIndicIPri = 3;
		Integer	iL3MeterIndicVPri = 268;
		Integer	iL3MeterIndicIPri = 5555;
		Integer	iDisplayKw = 99999;
		Integer iDisplayKvar = 123456;
		String  sDisplayPf = "0.00001";
		Integer	iDisplayKva = 654;
		Integer	iRisingMD = 65449;
		Integer	iTimeSecs = 18000;
		String	sUnit = "kw";
		Integer iImpulsesKwAct = 91;
		Integer	iImpulsesKwTime = 6;
		Integer	iImpulsesKwPulseVal = 1;
		Integer	iImpulsesKvarAct = 647;
		Integer	iImpulsesKvarTime = 222;
		Integer	iImpulsesKvarPulseVal = 451;
		String	sTimeStart = "12:30";
		String	sTimeFinish = "14:00";
		Integer iImportKwhStart = 1;
		Integer iImportKwhFinish = 2;
		Integer	iExportKwhStart = 15;
		Integer	iExportKwhFinish = 18;
		Integer	iTotalKvarhStart = 19;
		Integer	iTotalKvarhFinish = 119;
		Integer	iTotalKvahStart = 555;
		Integer	iTotalKvahFinish = 6478;
		String	sCommissDate = "";   // would need this to match the job date - so this would defos need to be included in the spreadsheet
		String	sComments = "lots of comments about commissioning";	
	
	
		// Meter Indicated Values (display with the Measured and Calculated Load Values section) sub-section
		
		CI_Objects_Commissioning_Hv_Ct.txt_l1_meter_indicated_v_primary(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l1_meter_indicated_v_primary(driver).sendKeys(Integer.toString(iL1MeterIndicVPri));
		{
			Log.info(sTestCaseName + " | L1 - Meter Indicated - V (Primary) field completed");
		}
			
		CI_Objects_Commissioning_Hv_Ct.txt_l1_meter_indicated_i_pri(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l1_meter_indicated_i_pri(driver).sendKeys(Integer.toString(iL1MeterIndicIPri));
		{
			Log.info(sTestCaseName + " | L1 - Meter Indicated - I (Pri) field completed");
		}
		
		// *!*!*!*!*!*!* Need to include method for Read Only kVA check *!*!*!*!*!*!*
		
		CI_Objects_Commissioning_Hv_Ct.txt_l2_meter_indicated_v_primary(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l2_meter_indicated_v_primary(driver).sendKeys(Integer.toString(iL2MeterIndicVPri));
		{
			Log.info(sTestCaseName + " | L2 - Meter Indicated - V (Primary) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l2_meter_indicated_i_pri(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l2_meter_indicated_i_pri(driver).sendKeys(Integer.toString(iL2MeterIndicIPri));
		{
			Log.info(sTestCaseName + " | L2 - Meter Indicated - I (Pri) field completed");
		}
		
		// *!*!*!*!*!*!* Need to include method for Read Only kVA check *!*!*!*!*!*!*
		
		CI_Objects_Commissioning_Hv_Ct.txt_l3_meter_indicated_v_primary(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l3_meter_indicated_v_primary(driver).sendKeys(Integer.toString(iL3MeterIndicVPri));
		{
			Log.info(sTestCaseName + " | L3 - Meter Indicated - V (Primary) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_l3_meter_indicated_i_pri(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_l3_meter_indicated_i_pri(driver).sendKeys(Integer.toString(iL3MeterIndicIPri));
		{
			Log.info(sTestCaseName + " | L3 - Meter Indicated - I (Pri) field completed");
		}
		
		// *!*!*!*!*!*!* Need to include method for Read Only kVA check *!*!*!*!*!*!*
		
		// *!*!*!*!*!*!* Need to include method for Read Only kVA  - TOTAL check *!*!*!*!*!*!*
		
		CI_Objects_Commissioning_Hv_Ct.txt_displayed_values_kw(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_displayed_values_kw(driver).sendKeys(Integer.toString(iDisplayKw));
		{
			Log.info(sTestCaseName + " | Displayed Values - kW field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_displayed_values_kvar(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_displayed_values_kvar(driver).sendKeys(Integer.toString(iDisplayKvar));
		{
			Log.info(sTestCaseName + " | Displayed Values - kVAr field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_displayed_values_pf(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_displayed_values_pf(driver).sendKeys(sDisplayPf);
		{
			Log.info(sTestCaseName + " | Displayed Values - Pf field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_displayed_values_kva(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_displayed_values_kva(driver).sendKeys(Integer.toString(iDisplayKva));
		{
			Log.info(sTestCaseName + " | Displayed Values - kVA field completed");
		}
		
		// Timed Demand Advance
		
		CI_Objects_Commissioning_Hv_Ct.txt_rising_md_value(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_rising_md_value(driver).sendKeys(Integer.toString(iRisingMD));
		{
			Log.info(sTestCaseName + " | Rising MD Value field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_time_seconds(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_rising_md_value(driver).sendKeys(Integer.toString(iTimeSecs));
		{
			Log.info(sTestCaseName + " | Time (seconds) field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.cbx_unit(driver).click();
		CI_Objects_Commissioning_Hv_Ct.cbx_unit(driver).sendKeys(sUnit);
		CI_Objects_Commissioning_Hv_Ct.cbx_unit(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Unit dropdown completed");
		}
		
		// Impulses/Pulses Set
		
		CI_Objects_Commissioning_Hv_Ct.txt_impulses_kw_actual_num(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_impulses_kw_actual_num(driver).sendKeys(Integer.toString(iImpulsesKwAct));
		{
			Log.info(sTestCaseName + " | Impulses - kW - Actual No. field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_impulses_kw_time_taken(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_impulses_kw_time_taken(driver).sendKeys(Integer.toString(iImpulsesKwTime));
		{
			Log.info(sTestCaseName + " | Impulses - kW - Time Taken field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_impulses_kw_pulse_value_meter(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_impulses_kw_pulse_value_meter(driver).sendKeys(Integer.toString(iImpulsesKwPulseVal));
		{
			Log.info(sTestCaseName + " | Impulses - kW - Pulse Value of Meter field completed");
		}
		
		// *!*!*!*!*!*!*! need to insert method to perform check of result *!*!*!*!*!*!*!
		
		CI_Objects_Commissioning_Hv_Ct.txt_impulses_kvar_actual_num(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_impulses_kvar_actual_num(driver).sendKeys(Integer.toString(iImpulsesKvarAct));
		{
			Log.info(sTestCaseName + " | Impulses - kVAr - Actual No. field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_impulses_kvar_time_taken(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_impulses_kvar_time_taken(driver).sendKeys(Integer.toString(iImpulsesKvarTime));
		{
			Log.info(sTestCaseName + " | Impulses - kVar - Time Taken field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_impulses_kvar_pulse_value_meter(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_impulses_kvar_pulse_value_meter(driver).sendKeys(Integer.toString(iImpulsesKvarPulseVal));
		{
			Log.info(sTestCaseName + " | Impulses - kVAr - Pulse Value of Meter field completed");
		}
		
		// *!*!*!*!*!*!*! need to insert method to perform check of result *!*!*!*!*!*!*!
		
		// Registers sub-section
				
		CI_Objects_Commissioning_Hv_Ct.txt_time_start(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_time_start(driver).sendKeys(sTimeStart);
		{
			Log.info(sTestCaseName + " | Time - Start field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_time_finish(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_time_finish(driver).sendKeys(sTimeFinish);
		{
			Log.info(sTestCaseName + " | Time - Start field completed");
		}
			
		CI_Objects_Commissioning_Hv_Ct.txt_import_kwh_start(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_import_kwh_start(driver).sendKeys(Integer.toString(iImportKwhStart));
		{
			Log.info(sTestCaseName + " | Import kWh - Start field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_import_kwh_finish(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_import_kwh_finish(driver).sendKeys(Integer.toString(iImportKwhFinish));
		{
			Log.info(sTestCaseName + " | Import kWh - Finish field completed");
		}
		
		// *!*!*!*!*!*!*! need to insert method to perform check of Advance result *!*!*!*!*!*!*!
		
		CI_Objects_Commissioning_Hv_Ct.txt_export_kwh_start(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_export_kwh_start(driver).sendKeys(Integer.toString(iExportKwhStart));
		{
			Log.info(sTestCaseName + " | Export kWh - Start field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_export_kwh_finish(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_export_kwh_finish(driver).sendKeys(Integer.toString(iExportKwhFinish));
		{
			Log.info(sTestCaseName + " | Export kWh - Finish field completed");
		}
		
		// *!*!*!*!*!*!*! need to insert method to perform check of Advance result *!*!*!*!*!*!*!
		
		CI_Objects_Commissioning_Hv_Ct.txt_total_kvarh_start(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_total_kvarh_start(driver).sendKeys(Integer.toString(iTotalKvarhStart));
		{
			Log.info(sTestCaseName + " | Total kVArh - Start field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_total_kvarh_finish(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_total_kvarh_finish(driver).sendKeys(Integer.toString(iTotalKvarhFinish));
		{
			Log.info(sTestCaseName + " | Total kVArh - Finish field completed");
		}
		
		// *!*!*!*!*!*!*! need to insert method to perform check of Advance result *!*!*!*!*!*!*!
		
		CI_Objects_Commissioning_Hv_Ct.txt_total_kvah_start(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_total_kvah_start(driver).sendKeys(Integer.toString(iTotalKvahStart));
		{
			Log.info(sTestCaseName + " | Total kVAh - Start field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_total_kvah_finish(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_total_kvah_finish(driver).sendKeys(Integer.toString(iTotalKvahFinish));
		{
			Log.info(sTestCaseName + " | Total kVAh - Finish field completed");
		}
		
		// *!*!*!*!*!*!*! need to insert method to perform check of Advance result *!*!*!*!*!*!*!
		
		CI_Objects_Commissioning_Hv_Ct.txt_commissioned_date(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_commissioned_date(driver).sendKeys(sCommissDate);
		{
			Log.info(sTestCaseName + " | Commissioned Date field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_signature(driver).click();
		{
			Log.info(sTestCaseName + " | Signature field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.txt_comments(driver).click();
		CI_Objects_Commissioning_Hv_Ct.txt_comments(driver).sendKeys(sComments);
		{
			Log.info(sTestCaseName + " | Comments field completed");
		}
		
		CI_Objects_Commissioning_Hv_Ct.btn_save(driver).click();
		{
			Log.info(sTestCaseName + " | Save button clicked");
		}
		
		CI_Objects_Commissioning_Hv_Ct.btn_continue(driver).click();
		{
			Log.info(sTestCaseName + " | Continue button clicked");
		}
		
		
	}	
	// END OF ADD SUCCESS VALUES ALL PART 2 METHOD

	
}
	
//END OF METHODS
