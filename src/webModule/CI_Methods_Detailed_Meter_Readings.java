package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Detailed_Meter_Readings;
import utility.Log;

public class CI_Methods_Detailed_Meter_Readings{
	
	
	
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
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.lbl_Initial_Polarity_Check_At_Meter(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Initial Polarity Check At Meter label displayed as expected");
		}
		
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Polarity_Check_At_Cut_Out_Pass(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Polarity Check At Cut Out - Pass radio button displayed as expected");
		}
		
		Objects_Electricity_Meter_Initial_Polarity_Check_At_Meter_Page.btn_Polarity_Check_At_Cut_Out_Fail(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Polarity Check At Cut Out - Fail radio button displayed as expected");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	*/
	
		
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Charlotte Jones
	* Date: 07/08/2018
	* Purpose: This method adds the required responses in the Detailed Meter Readings section for a
	* happy path scenario
	* Arguments:		sSerialNo
	* 					iDialEnd
	* 					sUnits
	* 					iTotalKwhImp
	* 					iTotalKwhExp
	* 					iQuad1
	* 					iQuad2
	* 					iQuad3
	* 					iQuad4
	* 					iTotalKvarhImp
	* 					iTotalKvarhExp
	* 					iTotalKvah
	* 					iRate1
	* 					iRate2
	* 					iRate3
	* 					iRate4
	* 					iRate5
	* 					iRate6
	* 					iKwMaxDemand
	* 					iKvaMaxDemand
	* 					iOtherRegRead
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	
	
	public static void addSuccessValues(WebDriver driver, String sTestCaseName) throws Exception{
	
		// *!*!*!*!*!*!*!* Need to add values to the below variables *!*!*!*!*!*!*!*
		
		
		String 	sSerialNo = "";
		Integer iDialEnd = 1;
		String 	sUnits = "k";
		Integer iTotalKwhImp = 123;
		Integer iTotalKwhExp = 321;
		Integer iQuad1 = 1;
		Integer iQuad2 = 2;
		Integer iQuad3 = 3;
		Integer iQuad4 = 4;
		Integer iTotalKvarhImp = 524;
		Integer iTotalKvarhExp = 425;
		Integer iTotalKvah = 900;
		Integer iRate1 = 1;
		Integer iRate2 = 2;
		Integer iRate3 = 3;
		Integer iRate4 = 4;
		Integer iRate5 = 5;
		Integer iRate6 = 6;
		Integer iKwMaxDemand = 9;
		Integer iKvaMaxDemand = 7;
		Integer iOtherRegRead = 12345;
		String 	sOtherRegName = "";
		
		CI_Objects_Detailed_Meter_Readings.cbx_serial_no_to_enter(driver).click();
		CI_Objects_Detailed_Meter_Readings.cbx_serial_no_to_enter(driver).sendKeys(sSerialNo);
		CI_Objects_Detailed_Meter_Readings.cbx_serial_no_to_enter(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Meter Serial Number To Enter Readings For dropdown completed");
		}
	        
		// Register Readings sub-section
	    
		CI_Objects_Detailed_Meter_Readings.cbx_dial_end(driver).click();
		CI_Objects_Detailed_Meter_Readings.cbx_dial_end(driver).sendKeys(Integer.toString(iDialEnd));
		CI_Objects_Detailed_Meter_Readings.cbx_dial_end(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Dial End dropdown completed");
		}
		
	    CI_Objects_Detailed_Meter_Readings.cbx_units(driver).click();
	    CI_Objects_Detailed_Meter_Readings.cbx_units(driver).sendKeys(sUnits);
		CI_Objects_Detailed_Meter_Readings.cbx_units(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Units dropdown completed");
		}
		
	    CI_Objects_Detailed_Meter_Readings.txt_total_kwh_imp(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_total_kwh_imp(driver).sendKeys(Integer.toString(iTotalKwhImp));
		{
			Log.info(sTestCaseName + " | Total kWh Imp field completed");
		}
	    
		CI_Objects_Detailed_Meter_Readings.txt_total_kwh_exp(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_total_kwh_exp(driver).sendKeys(Integer.toString(iTotalKwhExp));
		{
			Log.info(sTestCaseName + " | Total kWh Exp field completed");
		}
	    
		CI_Objects_Detailed_Meter_Readings.txt_quad_1_kvarh(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_quad_1_kvarh(driver).sendKeys(Integer.toString(iQuad1));
		{
			Log.info(sTestCaseName + " | Quad 1 kVArh field completed");
		}
	    
		CI_Objects_Detailed_Meter_Readings.txt_quad_2_kvarh(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_quad_2_kvarh(driver).sendKeys(Integer.toString(iQuad2));
		{
			Log.info(sTestCaseName + " | Quad 2 kVArh field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.txt_quad_3_kvarh(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_quad_3_kvarh(driver).sendKeys(Integer.toString(iQuad3));
		{
			Log.info(sTestCaseName + " | Quad 3 kVArh field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.txt_quad_4_kvarh(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_quad_4_kvarh(driver).sendKeys(Integer.toString(iQuad4));
		{
			Log.info(sTestCaseName + " | Quad 4 kVArh field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.txt_total_kvarh_imp(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_total_kvarh_imp(driver).sendKeys(Integer.toString(iTotalKvarhImp));
		{
			Log.info(sTestCaseName + " | Total kVArh Imp field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.txt_total_kvarh_exp(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_total_kvarh_exp(driver).sendKeys(Integer.toString(iTotalKvarhExp));
		{
			Log.info(sTestCaseName + " | Total kVArh Exp field completed");
		}
		
		// have emailed Nicky to check that the following unit should be kVAh, rather than kVArh, as above
		
		CI_Objects_Detailed_Meter_Readings.txt_total_kvah(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_total_kvah(driver).sendKeys(Integer.toString(iTotalKvah));
		{
			Log.info(sTestCaseName + " | Total kVAh field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.txt_rate_1(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_rate_1(driver).sendKeys(Integer.toString(iRate1));
		{
			Log.info(sTestCaseName + " | Rate 1 field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.txt_rate_2(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_rate_2(driver).sendKeys(Integer.toString(iRate2));
		{
			Log.info(sTestCaseName + " | Rate 2 field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.txt_rate_3(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_rate_3(driver).sendKeys(Integer.toString(iRate3));
		{
			Log.info(sTestCaseName + " | Rate 3 field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.txt_rate_4(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_rate_4(driver).sendKeys(Integer.toString(iRate4));
		{
			Log.info(sTestCaseName + " | Rate 4 field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.txt_rate_5(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_rate_5(driver).sendKeys(Integer.toString(iRate5));
		{
			Log.info(sTestCaseName + " | Rate 5 field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.txt_rate_6(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_rate_6(driver).sendKeys(Integer.toString(iRate6));
		{
			Log.info(sTestCaseName + " | Rate 6 field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.txt_kw_max_demand(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_kw_max_demand(driver).sendKeys(Integer.toString(iKwMaxDemand));
		{
			Log.info(sTestCaseName + " | kW Maximum Demand field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.txt_kva_max_demand(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_kva_max_demand(driver).sendKeys(Integer.toString(iKvaMaxDemand));
		{
			Log.info(sTestCaseName + " | kVA Maximum Demand field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.txt_other_reg_read(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_other_reg_read(driver).sendKeys(Integer.toString(iOtherRegRead));
		{
			Log.info(sTestCaseName + " | Other Register Read field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.txt_other_reg_name(driver).click();
	    CI_Objects_Detailed_Meter_Readings.txt_other_reg_name(driver).sendKeys(sOtherRegName);
		{
			Log.info(sTestCaseName + " | Other Register Name field completed");
		}
		
		CI_Objects_Detailed_Meter_Readings.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button clicked");
		}
		
		
		
	}	
			
		
	
//END OF METHODS
}