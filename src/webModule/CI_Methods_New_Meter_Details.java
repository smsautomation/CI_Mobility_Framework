package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_New_Meter_Details;
import utility.Log;

public class CI_Methods_New_Meter_Details{
	
	
	
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
	* Function: addSuccessValuesSub100Sm
	* Author: Charlotte Jones
	* Date: 22/08/2018
	* Purpose: This method adds the required responses in the New Meter Details section for a happy path scenario
	* 	This is part 1 and is applicable to all metering types that would call this section
	* 	After this method, Part 2 will need to be specific to the applicable metering type
	* Metering Supply:	All Sub100
	* 					All COP10
	* 					All COP5
	* 					All COP3
	* 					COP2
	* 					All SM			
	* Arguments: 	sMeterSerialNum
	* 				sManuLetter
	* 				sMeterType
	* 				sClass
	* 				iEdmiSerialNo
	* 				iSscCode
	* 				sMeterLocCode
	* 				iCertYearMonth
	* 				iCtRatioPrimary
	* 				iVtRatio
	* 				iBaudRate
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValuesSub100Sm(WebDriver driver, String sTestCaseName) throws Exception{
	
	
		// *!*!*!*!*!*!*!* Need to complete the below variables *!*!*!*!*!*!*!*
		
		// Variables
		String 	sMeterSerialNum = "serialnum";
		String 	sManuLetter = "";
		String 	sMeterType = "";
		String 	sClass = "";
		Integer iEdmiSerialNo = 1;
		Integer iSscCode = 3;
		String	sFeederNum = "";
		Integer	iOutstationNum = 012;
		String 	sMeterLocCode = "";
		Integer iCertYearMonth = 2;
		Integer iCtRatioPrimary = 3;
		Integer	iVtRatio = 6;
		Integer iBaudRate = 1;
		
		
		CI_Objects_New_Meter_Details.txt_serial_num(driver).click();
		CI_Objects_New_Meter_Details.txt_serial_num(driver).sendKeys(sMeterSerialNum);
		CI_Objects_New_Meter_Details.txt_serial_num(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Elec Meter Serial Number(s) field completed");
		}
		
		CI_Objects_New_Meter_Details.cbx_manufacturer_letter(driver).click();
		CI_Objects_New_Meter_Details.cbx_manufacturer_letter(driver).sendKeys(sManuLetter);
		CI_Objects_New_Meter_Details.cbx_manufacturer_letter(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Manufacturer Letter field completed");
		}
		
		CI_Objects_New_Meter_Details.cbx_meter_type(driver).click();
		CI_Objects_New_Meter_Details.cbx_meter_type(driver).sendKeys(sMeterType);
		CI_Objects_New_Meter_Details.cbx_meter_type(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Meter Type field completed");
		}
		
		CI_Objects_New_Meter_Details.cbx_class(driver).click();
		CI_Objects_New_Meter_Details.cbx_class(driver).sendKeys(sClass);
		CI_Objects_New_Meter_Details.cbx_class(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Class field completed");
		}
		
		CI_Objects_New_Meter_Details.txt_edmi_serial_num(driver).click();
		CI_Objects_New_Meter_Details.txt_edmi_serial_num(driver).sendKeys(Integer.toString(iEdmiSerialNo));
				{
			Log.info(sTestCaseName + " | EDMI Serial Number field completed");
		}
		
		CI_Objects_New_Meter_Details.txt_feeder_num(driver).click();
		CI_Objects_New_Meter_Details.txt_feeder_num(driver).sendKeys(sFeederNum);
		{
			Log.info(sTestCaseName + " | Feeder Number field completed");
		}
		
		CI_Objects_New_Meter_Details.txt_outstation_num(driver).click();
		CI_Objects_New_Meter_Details.txt_outstation_num(driver).sendKeys(Integer.toString(iOutstationNum));
		{
			Log.info(sTestCaseName + " | Outstation Number field completed");
		}
		
		// if statement for the ssc code - as only applies to certain metering types - need to see if the "contains" works,
		//  if not - can try Paul's method, which is below and commented out
		
		/*
		if ("Exchange_1_End_To_End_Chrome".equals(sTestCaseName)
				|| "Exchange_2_End_To_End_Chrome".equals(sTestCaseName)
				|| "FLTY_2_End_To_End_Chrome".equals(sTestCaseName)
				|| "INST_15_End_To_End_Chrome".equals(sTestCaseName)
				|| "INST_14_End_To_End_Chrome".equals(sTestCaseName)
				|| "FLTY_2_End_To_End_Spark_Chrome".equals(sTestCaseName))
		*/
			
		if (sTestCaseName.contains("Wc_1ph")
				|| sTestCaseName.contains("Wc_3ph"))
		{ 
			CI_Objects_New_Meter_Details.cbx_ssc_code(driver).click();
			CI_Objects_New_Meter_Details.cbx_ssc_code(driver).sendKeys(Integer.toString(iSscCode));
			CI_Objects_New_Meter_Details.cbx_ssc_code(driver).sendKeys(Keys.ENTER);
			{
				Log.info(sTestCaseName + " | SSC Code field completed");
			}	
		}		
		
		CI_Objects_New_Meter_Details.cbx_meter_loc_code(driver).click();
		CI_Objects_New_Meter_Details.cbx_meter_loc_code(driver).sendKeys(sMeterLocCode);
		CI_Objects_New_Meter_Details.cbx_meter_loc_code(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Meter Location Code field completed");
		}
		
		// *!*!*!*!*!*!* could add something later to verify the number of registers is completed *!*!*!*!*!*!*
		
		CI_Objects_New_Meter_Details.txt_cert_year_month(driver).click();
		CI_Objects_New_Meter_Details.txt_cert_year_month(driver).sendKeys(Integer.toString(iCertYearMonth));
		CI_Objects_New_Meter_Details.txt_cert_year_month(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Certification or MID Year / Month field completed");
		}
		
		// *!*!*!*!*!*!* could add something later to verify the number of dials is completed *!*!*!*!*!*!*
		
		if (sTestCaseName.contains("Lv")
				|| sTestCaseName.contains("Hv"))
		{
			CI_Objects_New_Meter_Details.cbx_ct_ratio_primary(driver).click();
			CI_Objects_New_Meter_Details.cbx_ct_ratio_primary(driver).sendKeys(Integer.toString(iCtRatioPrimary));
			CI_Objects_New_Meter_Details.cbx_ct_ratio_primary(driver).sendKeys(Keys.ENTER);
			{
				Log.info(sTestCaseName + " | CT Ratio Details Primary field completed");
			}	
		}
		
		if (sTestCaseName.contains("Hv"))
		{
			CI_Objects_New_Meter_Details.cbx_vt_ratio_details(driver).click();
			CI_Objects_New_Meter_Details.cbx_vt_ratio_details(driver).sendKeys(Integer.toString(iVtRatio));
			CI_Objects_New_Meter_Details.cbx_vt_ratio_details(driver).sendKeys(Keys.ENTER);
			{
				Log.info(sTestCaseName + " | VT Ratio Details field completed");
			}	
		}
		
		CI_Objects_New_Meter_Details.cbx_baud_rate(driver).click();
		CI_Objects_New_Meter_Details.cbx_baud_rate(driver).sendKeys(Integer.toString(iBaudRate));
		CI_Objects_New_Meter_Details.cbx_baud_rate(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Baud Rate field completed");
		}
		
		
		
	// END OF ADD SUCCESS VALUES SUB100 SM METHOD
	}	
		
		


	
	/* **************************************************************************************************
	* Function: addSuccessValuesCop5Cop3Cop2
	* Author: Charlotte Jones
	* Date: 22/08/2018
	* Purpose: This method adds the required responses in the New Meter Details section for a happy path scenario
	* Metering Supply:				
	* Arguments: 	sMeterSerialNum
	* 				sManuLetter
	* 				sMeterType
	* 				sClass
	* 				iEdmiSerialNo
	* 				iSscCode
	* 				sMeterLocCode
	* 				iCertYearMonth
	* 				iCtRatioPrimary
	* 				iVtRatio
	* 				iBaudRate
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValuesCop5Cop3Cop2(WebDriver driver, String sTestCaseName) throws Exception{
	
	
		// *!*!*!*!*!*!*!* Need to complete the below variables *!*!*!*!*!*!*!*
		
		String 	sMeterSerialNum = "serialnum";
		String 	sManuLetter = "";
		String 	sMeterType = "";
		String 	sClass = "";
		Integer iEdmiSerialNo = 1;
		String	sFeederNum = "";
		Integer	iOutstationNum = 012;
		String 	sMeterLocCode = "";
		Integer iCertYearMonth = 2;
		Integer iCtRatioPrimary = 1;
		Integer iVtRatio = 1;
		Integer iBaudRate = 1;
		
		
		CI_Objects_New_Meter_Details.txt_serial_num(driver).click();
		CI_Objects_New_Meter_Details.txt_serial_num(driver).sendKeys(sMeterSerialNum);
		CI_Objects_New_Meter_Details.txt_serial_num(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Elec Meter Serial Number(s) field completed");
		}
		
		CI_Objects_New_Meter_Details.cbx_manufacturer_letter(driver).click();
		CI_Objects_New_Meter_Details.cbx_manufacturer_letter(driver).sendKeys(sManuLetter);
		CI_Objects_New_Meter_Details.cbx_manufacturer_letter(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Manufacturer Letter field completed");
		}
		
		CI_Objects_New_Meter_Details.cbx_meter_type(driver).click();
		CI_Objects_New_Meter_Details.cbx_meter_type(driver).sendKeys(sMeterType);
		CI_Objects_New_Meter_Details.cbx_meter_type(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Meter Type field completed");
		}
		
		CI_Objects_New_Meter_Details.cbx_class(driver).click();
		CI_Objects_New_Meter_Details.cbx_class(driver).sendKeys(sClass);
		CI_Objects_New_Meter_Details.cbx_class(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Class field completed");
		}
		
		CI_Objects_New_Meter_Details.txt_edmi_serial_num(driver).click();
		CI_Objects_New_Meter_Details.txt_edmi_serial_num(driver).sendKeys(Integer.toString(iEdmiSerialNo));
				{
			Log.info(sTestCaseName + " | EDMI Serial Number field completed");
		}
		
		CI_Objects_New_Meter_Details.txt_feeder_num(driver).click();
		CI_Objects_New_Meter_Details.txt_feeder_num(driver).sendKeys(sFeederNum);
		{
			Log.info(sTestCaseName + " | Feeder Number field completed");
		}
		
		CI_Objects_New_Meter_Details.txt_outstation_num(driver).click();
		CI_Objects_New_Meter_Details.txt_outstation_num(driver).sendKeys(Integer.toString(iOutstationNum));
		{
			Log.info(sTestCaseName + " | Outstation Number field completed");
		}
		
		CI_Objects_New_Meter_Details.cbx_meter_loc_code(driver).click();
		CI_Objects_New_Meter_Details.cbx_meter_loc_code(driver).sendKeys(sMeterLocCode);
		CI_Objects_New_Meter_Details.cbx_meter_loc_code(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Meter Location Code field completed");
		}
		
		// *!*!*!*!*!*!* could add something later to verify the number of registers is completed *!*!*!*!*!*!*
		
		CI_Objects_New_Meter_Details.txt_cert_year_month(driver).click();
		CI_Objects_New_Meter_Details.txt_cert_year_month(driver).sendKeys(Integer.toString(iCertYearMonth));
		CI_Objects_New_Meter_Details.txt_cert_year_month(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Certification or MID Year / Month field completed");
		}
		
		// *!*!*!*!*!*!* could add something later to verify the number of dials is completed *!*!*!*!*!*!*
		
		if (sTestCaseName.contains("Lv")
				|| sTestCaseName.contains("Hv"))
		{
			CI_Objects_New_Meter_Details.cbx_ct_ratio_primary(driver).click();
			CI_Objects_New_Meter_Details.cbx_ct_ratio_primary(driver).sendKeys(Integer.toString(iCtRatioPrimary));
			CI_Objects_New_Meter_Details.cbx_ct_ratio_primary(driver).sendKeys(Keys.ENTER);
			{
				Log.info(sTestCaseName + " | CT Ratio Details - Primary field completed");
			}
		}
		
		if (sTestCaseName.contains("Hv"))
		{
			CI_Objects_New_Meter_Details.cbx_vt_ratio_details(driver).click();
			CI_Objects_New_Meter_Details.cbx_vt_ratio_details(driver).sendKeys(Integer.toString(iVtRatio));
			CI_Objects_New_Meter_Details.cbx_vt_ratio_details(driver).sendKeys(Keys.ENTER);
			{
				Log.info(sTestCaseName + " | VT Ratio Details field completed");
			}
		}

		CI_Objects_New_Meter_Details.cbx_baud_rate(driver).click();
		CI_Objects_New_Meter_Details.cbx_baud_rate(driver).sendKeys(Integer.toString(iBaudRate));
		CI_Objects_New_Meter_Details.cbx_baud_rate(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Baud Rate field completed");
		}

		
	// END OF ADD SUCCESS VALUES COP5 COP3 COP2 METHOD
	}
		
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesCop10
	* Author: Charlotte Jones
	* Date: 22/08/2018
	* Purpose: This method adds the required responses in the New Meter Details section for a happy path scenario
	* Metering Supply:				
	* Arguments: 	sMeterSerialNum
	* 				sManuLetter
	* 				sMeterType
	* 				sClass
	* 				iEdmiSerialNo
	* 				iSscCode
	* 				sMeterLocCode
	* 				iCertYearMonth
	* 				iCtRatioPrimary
	* 				iVtRatio
	* 				iBaudRate
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValuesCop10(WebDriver driver, String sTestCaseName) throws Exception{
	
	
		// *!*!*!*!*!*!*!* Need to complete the below variables *!*!*!*!*!*!*!*
		
		String 	sMeterSerialNum = "serialnum";
		String 	sManuLetter = "";
		String 	sMeterType = "";
		String 	sClass = "";
		Integer iEdmiSerialNo = 1;
		String	sFeederNum = "";
		Integer	iOutstationNum = 012;
		String 	sMeterLocCode = "";
		Integer iCertYearMonth = 2;
		Integer iCtRatioPrimary = 4;
		Integer iBaudRate = 1;
		
		
		CI_Objects_New_Meter_Details.txt_serial_num(driver).click();
		CI_Objects_New_Meter_Details.txt_serial_num(driver).sendKeys(sMeterSerialNum);
		CI_Objects_New_Meter_Details.txt_serial_num(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Elec Meter Serial Number(s) field completed");
		}
		
		CI_Objects_New_Meter_Details.cbx_manufacturer_letter(driver).click();
		CI_Objects_New_Meter_Details.cbx_manufacturer_letter(driver).sendKeys(sManuLetter);
		CI_Objects_New_Meter_Details.cbx_manufacturer_letter(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Manufacturer Letter field completed");
		}
		
		CI_Objects_New_Meter_Details.cbx_meter_type(driver).click();
		CI_Objects_New_Meter_Details.cbx_meter_type(driver).sendKeys(sMeterType);
		CI_Objects_New_Meter_Details.cbx_meter_type(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Meter Type field completed");
		}
		
		CI_Objects_New_Meter_Details.cbx_class(driver).click();
		CI_Objects_New_Meter_Details.cbx_class(driver).sendKeys(sClass);
		CI_Objects_New_Meter_Details.cbx_class(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Class field completed");
		}
		
		CI_Objects_New_Meter_Details.txt_edmi_serial_num(driver).click();
		CI_Objects_New_Meter_Details.txt_edmi_serial_num(driver).sendKeys(Integer.toString(iEdmiSerialNo));
				{
			Log.info(sTestCaseName + " | EDMI Serial Number field completed");
		}
		
		CI_Objects_New_Meter_Details.txt_feeder_num(driver).click();
		CI_Objects_New_Meter_Details.txt_feeder_num(driver).sendKeys(sFeederNum);
		{
			Log.info(sTestCaseName + " | Feeder Number field completed");
		}
		
		CI_Objects_New_Meter_Details.txt_outstation_num(driver).click();
		CI_Objects_New_Meter_Details.txt_outstation_num(driver).sendKeys(Integer.toString(iOutstationNum));
		{
			Log.info(sTestCaseName + " | Outstation Number field completed");
		}
		
		CI_Objects_New_Meter_Details.cbx_meter_loc_code(driver).click();
		CI_Objects_New_Meter_Details.cbx_meter_loc_code(driver).sendKeys(sMeterLocCode);
		CI_Objects_New_Meter_Details.cbx_meter_loc_code(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Meter Location Code field completed");
		}
		
		// *!*!*!*!*!*!* could add something later to verify the number of registers is completed *!*!*!*!*!*!*
		
		CI_Objects_New_Meter_Details.txt_cert_year_month(driver).click();
		CI_Objects_New_Meter_Details.txt_cert_year_month(driver).sendKeys(Integer.toString(iCertYearMonth));
		CI_Objects_New_Meter_Details.txt_cert_year_month(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Certification or MID Year / Month field completed");
		}
		
		// *!*!*!*!*!*!* could add something later to verify the number of dials is completed *!*!*!*!*!*!*
		
		if (sTestCaseName.contains("Lv"))
		{
			CI_Objects_New_Meter_Details.cbx_ct_ratio_primary(driver).click();
			CI_Objects_New_Meter_Details.cbx_ct_ratio_primary(driver).sendKeys(Integer.toString(iCtRatioPrimary));
			CI_Objects_New_Meter_Details.cbx_ct_ratio_primary(driver).sendKeys(Keys.ENTER);
			{
				Log.info(sTestCaseName + " | CT Ratio Details - Primary field completed");
			}
		}

		CI_Objects_New_Meter_Details.cbx_baud_rate(driver).click();
		CI_Objects_New_Meter_Details.cbx_baud_rate(driver).sendKeys(Integer.toString(iBaudRate));
		CI_Objects_New_Meter_Details.cbx_baud_rate(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Baud Rate field completed");
		}

		
	// END OF ADD SUCCESS VALUES COP10 METHOD
	}	
	
	
//END OF METHODS
}