package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Commissioning_Wc_3ph_Lv_Ct;
import utility.Log;

public class CI_Methods_Commissioning_Wc_3ph_Lv_Ct{
	
	
	
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
	* Function: addSuccessValuesAll
	* Author: Charlotte Jones
	* Date: 08/08/2018
	* Purpose: This method adds the required responses in the Commissioning Document - HV CT
	* section for a happy path scenario
	* Arguments: 	sSerialNum
	* 				iL1L3
	* 				iL2L3
	* 				iL1Earth
	* 				iL1Neutral
	* 				iL1MeasuredVolts
	* 				iL1MeasuredIPri
	* 				iL1MeasuredISec
	* 				iL2MeasuredVolts
	* 				iL2MeasuredIPri
	* 				iL2MeasuredISec
	* 				iL3MeasuredVolts
	* 				iL3MeasuredIPri
	* 				iL3MeasuredISec
	* 				iL1MeterIndicVPri
	* 				iL1MeterIndicIPri
	* 				iL2MeterIndicVPri
	* 				iL2MeterIndicIPri
	* 				iDisplayKw
	* 				iDisplayKvar
	* 				sDisplayPf
	* 				iDisplayKva
	* 				iRisingMD
	* 				iTimeSecs
	* 				sUnit
	* 				iImpulsesKwAct
	*				iImpulsesKwTime
	*				iImpulsesKwPulseVal
	*				iImpulsesKvarAct
	*				iImpulsesKvarTime
	*				iImpulsesKvarPulseVal
	*				sTimeStart
	*				sTimeFinish
	*				sExportKwhStart
	*				sExportKwhFinish
	*				sTotalKvarhStart
	*				sTotalKvarhFinish
	*				sTotalKvahStart
	*				sTotalKvahFinish
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
	public static void addSuccessValuesAll(WebDriver driver, String sTestCaseName) throws Exception{
	
	
		// *!*!*!*!*!*!* values needed for below variables *!*!*!*!*!*!*
		
		String 	sSerialNum = "";
		Integer	iL1L3 = 123;
		Integer iL2L3 = 234;
		Integer	iL1Earth = 345;
		Integer	iL1Neutral = 456;
		Integer	iL1MeasuredVolts = 222;
		Integer iL1MeasuredIPri = 12;
		Integer	iL1MeasuredISec = 52;
		Integer iL2MeasuredVolts = 266;
		Integer	iL2MeasuredIPri = 65;
		Integer	iL2MeasuredISec = 5;
		Integer	iL3MeasuredVolts = 215;
		Integer	iL3MeasuredIPri = 7;
		Integer	iL3MeasuredISec = 68;
		Integer	iL1MeterIndicVPri = 300;
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
		Integer	iImportKwhStart = 111;
		Integer	iImportKwhFinish = 666;
		Integer	iExportKwhStart = 12;
		Integer	iExportKwhFinish = 65;
		Integer	iTotalKvarhStart = 10;
		Integer	iTotalKvarhFinish = 15;
		Integer	iTotalKvahStart = 5;
		Integer	iTotalKvahFinish = 7;
		String	sCommissDate = "";   // would need this to match the job date - so this would defos need to be included in the spreadsheet
		String	sComments = "lots of comments about commissioning";
		
				
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.btn_can_meters_be_commissioned_y(driver).click();
		{
			Log.info(sTestCaseName + " | Can meters be commissioned? - Yes radio button clicked");
		}
		
		// Meter Checks sub-section
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.cbx_serial_num(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.cbx_serial_num(driver).sendKeys(sSerialNum);
		{
			Log.info(sTestCaseName + " | Serial Number field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.btn_date_time_correct_y(driver).click();
		{
			Log.info(sTestCaseName + " | Meter time and date correct - Yes radio button selected");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.btn_operator_label_fitted_y(driver).click();
		{
			Log.info(sTestCaseName + " | Meter operator label fitted - Yes radio button selected");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.btn_wiring_connected_correctly_y(driver).click();
		{
			Log.info(sTestCaseName + " | Wiring connected correctly - Yes radio button selected");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.btn_phase_rotation_correct_y(driver).click();
		{
			Log.info(sTestCaseName + " | Phase rotation correct at meter - Yes radio button selected");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.btn_ct_polarity_correct_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Polarity correct - Yes radio button selected");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.btn_meter_advances_each_element_y(driver).click();
		{
			Log.info(sTestCaseName + " | Meter advances on each element - Yes radio button selected");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.btn_test_block_correct_n(driver).click();
		{
			Log.info(sTestCaseName + " | Test block operation correct - No radio button selected");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.btn_phase_failure_indication_working_n(driver).click();
		{
			Log.info(sTestCaseName + " | Phase failure indication working - No radio button selected");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.btn_ct_burden_less_than_ct_rating_y(driver).click();
		{
			Log.info(sTestCaseName + " | CT Burden < CT Rating - Yes radio button selected");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.btn_ct_ratio_confirmed_y(driver).click();
		{
			Log.info(sTestCaseName + " | PCT Ratio confirmed - Yes radio button selected");
		}
		
		// Phase Voltages sub-section
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_l3(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_l3(driver).sendKeys(Integer.toString(iL1L3));
		{
			Log.info(sTestCaseName + " | L1 - L3 field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l2_l3(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l2_l3(driver).sendKeys(Integer.toString(iL2L3));
		{
			Log.info(sTestCaseName + " | L2 - L3 field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_earth(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_earth(driver).sendKeys(Integer.toString(iL1Earth));
		{
			Log.info(sTestCaseName + " | L1 - Earth field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_neutral(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_neutral(driver).sendKeys(Integer.toString(iL1Neutral));
		{
			Log.info(sTestCaseName + " | L1 - Neutral field completed");
		}
		
		//Measure and Calculated Load Values (display with the Meter Indicated Values section) sub-section
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_measured_volts(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_measured_volts(driver).sendKeys(Integer.toString(iL1MeasuredVolts));
		{
			Log.info(sTestCaseName + " | L1 - Measured - Volts field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_measured_i_pri(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_measured_i_pri(driver).sendKeys(Integer.toString(iL1MeasuredIPri));
		{
			Log.info(sTestCaseName + " | L1 - Measured - I (pri) field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_measured_i_sec(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_measured_i_sec(driver).sendKeys(Integer.toString(iL1MeasuredISec));
		{
			Log.info(sTestCaseName + " | L1 - Measured - I (sec) field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l2_measured_volts(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l2_measured_volts(driver).sendKeys(Integer.toString(iL2MeasuredVolts));
		{
			Log.info(sTestCaseName + " | L2 - Measured - Volts field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l2_measured_i_pri(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l2_measured_i_pri(driver).sendKeys(Integer.toString(iL2MeasuredIPri));
		{
			Log.info(sTestCaseName + " | L2 - Measured - I (pri) field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l2_measured_i_sec(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l2_measured_i_sec(driver).sendKeys(Integer.toString(iL2MeasuredISec));
		{
			Log.info(sTestCaseName + " | L2 - Measured - I (sec) field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l3_measured_volts(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l3_measured_volts(driver).sendKeys(Integer.toString(iL3MeasuredVolts));
		{
			Log.info(sTestCaseName + " | L3 - Measured - Volts field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l3_measured_i_pri(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l3_measured_i_pri(driver).sendKeys(Integer.toString(iL3MeasuredIPri));
		{
			Log.info(sTestCaseName + " | L3 - Measured - I (pri) field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l3_measured_i_sec(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l3_measured_i_sec(driver).sendKeys(Integer.toString(iL3MeasuredISec));
		{
			Log.info(sTestCaseName + " | L3 - Measured - I (sec) field completed");
		}
		
		// Meter Indicated Values (display with the Measured and Calculated Load Values section) sub-section
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_meter_indicated_v_primary(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_meter_indicated_v_primary(driver).sendKeys(Integer.toString(iL1MeterIndicVPri));
		{
			Log.info(sTestCaseName + " | L1 - Meter Indicated - V (Primary) field completed");
		}
			
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_meter_indicated_i_pri(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l1_meter_indicated_i_pri(driver).sendKeys(Integer.toString(iL1MeterIndicIPri));
		{
			Log.info(sTestCaseName + " | L1 - Meter Indicated - I (Pri) field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l2_meter_indicated_v_primary(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l2_meter_indicated_v_primary(driver).sendKeys(Integer.toString(iL2MeterIndicVPri));
		{
			Log.info(sTestCaseName + " | L2 - Meter Indicated - V (Primary) field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l2_meter_indicated_i_pri(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l2_meter_indicated_i_pri(driver).sendKeys(Integer.toString(iL2MeterIndicIPri));
		{
			Log.info(sTestCaseName + " | L2 - Meter Indicated - I (Pri) field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l3_meter_indicated_v_primary(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l3_meter_indicated_v_primary(driver).sendKeys(Integer.toString(iL3MeterIndicVPri));
		{
			Log.info(sTestCaseName + " | L3 - Meter Indicated - V (Primary) field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l3_meter_indicated_i_pri(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_l3_meter_indicated_i_pri(driver).sendKeys(Integer.toString(iL3MeterIndicIPri));
		{
			Log.info(sTestCaseName + " | L3 - Meter Indicated - I (Pri) field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_displayed_values_kw(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_displayed_values_kw(driver).sendKeys(Integer.toString(iDisplayKw));
		{
			Log.info(sTestCaseName + " | Displayed Values - kW field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_displayed_values_kvar(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_displayed_values_kvar(driver).sendKeys(Integer.toString(iDisplayKvar));
		{
			Log.info(sTestCaseName + " | Displayed Values - kVAr field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_displayed_values_pf(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_displayed_values_pf(driver).sendKeys(sDisplayPf);
		{
			Log.info(sTestCaseName + " | Displayed Values - Pf field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_displayed_values_kva(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_displayed_values_kva(driver).sendKeys(Integer.toString(iDisplayKva));
		{
			Log.info(sTestCaseName + " | Displayed Values - kVA field completed");
		}
		
		// Timed Demand Advance
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_rising_md_value(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_rising_md_value(driver).sendKeys(Integer.toString(iRisingMD));
		{
			Log.info(sTestCaseName + " | Rising MD Value field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_time_seconds(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_rising_md_value(driver).sendKeys(Integer.toString(iTimeSecs));
		{
			Log.info(sTestCaseName + " | Time (seconds) field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.cbx_unit(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.cbx_unit(driver).sendKeys(sUnit);
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.cbx_unit(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Unit dropdown completed");
		}
		
		// Impulses/Pulses Set
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_impulses_kw_actual_num(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_impulses_kw_actual_num(driver).sendKeys(Integer.toString(iImpulsesKwAct));
		{
			Log.info(sTestCaseName + " | Impulses - kW - Actual No. field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_impulses_kw_time_taken(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_impulses_kw_time_taken(driver).sendKeys(Integer.toString(iImpulsesKwTime));
		{
			Log.info(sTestCaseName + " | Impulses - kW - Time Taken field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_impulses_kw_pulse_value_meter(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_impulses_kw_pulse_value_meter(driver).sendKeys(Integer.toString(iImpulsesKwPulseVal));
		{
			Log.info(sTestCaseName + " | Impulses - kW - Pulse Value of Meter field completed");
		}
		
		// *!*!*!*!*!*!*! need to insert method to perform check of result *!*!*!*!*!*!*!
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_impulses_kvar_actual_num(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_impulses_kvar_actual_num(driver).sendKeys(Integer.toString(iImpulsesKvarAct));
		{
			Log.info(sTestCaseName + " | Impulses - kVAr - Actual No. field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_impulses_kvar_time_taken(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_impulses_kvar_time_taken(driver).sendKeys(Integer.toString(iImpulsesKvarTime));
		{
			Log.info(sTestCaseName + " | Impulses - kVar - Time Taken field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_impulses_kvar_pulse_value_meter(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_impulses_kvar_pulse_value_meter(driver).sendKeys(Integer.toString(iImpulsesKvarPulseVal));
		{
			Log.info(sTestCaseName + " | Impulses - kVAr - Pulse Value of Meter field completed");
		}
		
		// *!*!*!*!*!*!*! need to insert method to perform check of result *!*!*!*!*!*!*!
		
		// Registers sub-section
		
		// *!*!*!*!*!*!*! Have an outstanding query with Nicky re if it's 24 hour clock for the time, or 12 hour clock *!*!*!*!*!*!*!
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_time_start(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_time_start(driver).sendKeys(sTimeStart);
		{
			Log.info(sTestCaseName + " | Time - Start field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_time_finish(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_time_finish(driver).sendKeys(sTimeFinish);
		{
			Log.info(sTestCaseName + " | Time - Start field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_import_kwh_start(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_import_kwh_start(driver).sendKeys(Integer.toString(iImportKwhStart));
		{
			Log.info(sTestCaseName + " | Import kWh - Start field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_import_kwh_finish(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_import_kwh_finish(driver).sendKeys(Integer.toString(iImportKwhFinish));
		{
			Log.info(sTestCaseName + " | Import kWh - Finish field completed");
		}
		
		// *!*!*!*!*!*!*! need to insert method to perform check of Advance result *!*!*!*!*!*!*!
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_export_kwh_start(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_export_kwh_start(driver).sendKeys(Integer.toString(iExportKwhStart));
		{
			Log.info(sTestCaseName + " | Export kWh - Start field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_export_kwh_finish(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_export_kwh_finish(driver).sendKeys(Integer.toString(iExportKwhFinish));
		{
			Log.info(sTestCaseName + " | Export kWh - Finish field completed");
		}
		
		// *!*!*!*!*!*!*! need to insert method to perform check of Advance result *!*!*!*!*!*!*!
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_total_kvarh_start(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_total_kvarh_start(driver).sendKeys(Integer.toString(iTotalKvarhStart));
		{
			Log.info(sTestCaseName + " | Total kVArh - Start field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_total_kvarh_finish(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_total_kvarh_finish(driver).sendKeys(Integer.toString(iTotalKvarhFinish));
		{
			Log.info(sTestCaseName + " | Total kVArh - Finish field completed");
		}
		
		// *!*!*!*!*!*!*! need to insert method to perform check of Advance result *!*!*!*!*!*!*!
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_total_kvah_start(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_total_kvah_start(driver).sendKeys(Integer.toString(iTotalKvahStart));
		{
			Log.info(sTestCaseName + " | Total kVAh - Start field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_total_kvah_finish(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_total_kvah_finish(driver).sendKeys(Integer.toString(iTotalKvahFinish));
		{
			Log.info(sTestCaseName + " | Total kVAh - Finish field completed");
		}
		
		// *!*!*!*!*!*!*! need to insert method to perform check of Advance result *!*!*!*!*!*!*!
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_commissioned_date(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_commissioned_date(driver).sendKeys(sCommissDate);
		{
			Log.info(sTestCaseName + " | Commissioned Date field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_signature(driver).click();
		{
			Log.info(sTestCaseName + " | Signature field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_comments(driver).click();
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.txt_comments(driver).sendKeys(sComments);
		{
			Log.info(sTestCaseName + " | Comments field completed");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.btn_save(driver).click();
		{
			Log.info(sTestCaseName + " | Save button clicked");
		}
		
		CI_Objects_Commissioning_Wc_3ph_Lv_Ct.btn_continue(driver).click();
		{
			Log.info(sTestCaseName + " | Continue button clicked");
		}
		
		
		
	// END OF ADD SUCCESS VALUES ALL METHOD
	}

		
		
	
//END OF METHODS
}