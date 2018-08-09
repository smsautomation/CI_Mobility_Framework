package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Final_Meter_Reading;
import utility.Log;

public class CI_Methods_Final_Meter_Reading{
	
	
	
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
	* Date: 06/08/2018
	* Purpose: This method adds the required responses in the Call Forward section for a happy path scenario 
	* Arguments:		iDialEnd
	* 					sUnits
	* 					iTotalKwhImp
	* 					iTotalKwhExp
	* 					iQuad1
	* 					iQuad2
	*					iQuad3 					
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
	* 					sOtherRegName
	* 					sAssetStatus
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
	public static void addSuccessValues(WebDriver driver, String sTestCaseName) throws Exception{
	
 
		// *!*!*!*!*!*!*!* These variables need to be given values! *!*!*!*!*!*!*!*
		
	    Integer iDialEnd = 1;
	    String 	sUnits = "k";
	    Integer iTotalKwhImp = 12;
	    Integer iTotalKwhExp = 14;
	    Integer iQuad1 = 1;
	    Integer iQuad2 = 2;
	    Integer iQuad3 = 3;
	    Integer iQuad4 = 4;
	    Integer iTotalKvarhImp = 52; 
	    Integer iTotalKvarhExp = 53;
	    Integer	iTotalKvah = 20;
	    Integer iRate1 = 1;
	    Integer iRate2 = 2;
	    Integer iRate3 = 3;
	    Integer iRate4 = 4;
	    Integer iRate5 = 5;
	    Integer iRate6 = 6;
	    Integer iKwMaxDemand = 66; 
	    Integer iKvaMaxDemand = 75;
	    Integer iOtherRegRead = 123;
	    String 	sOtherRegName = "";
	    String 	sAssetStatus = "no";
	    
	    
		CI_Objects_Final_Meter_Reading.cbx_dial_end(driver).click();
		CI_Objects_Final_Meter_Reading.cbx_dial_end(driver).sendKeys(Integer.toString(iDialEnd));
		CI_Objects_Final_Meter_Reading.cbx_dial_end(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Dial End field completed");
		}
		
		CI_Objects_Final_Meter_Reading.cbx_units(driver).click();
		CI_Objects_Final_Meter_Reading.cbx_units(driver).sendKeys(sUnits);
		CI_Objects_Final_Meter_Reading.cbx_units(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Units field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_total_kwh_imp(driver).click();
		CI_Objects_Final_Meter_Reading.txt_total_kwh_imp(driver).sendKeys(Integer.toString(iTotalKwhImp));
		CI_Objects_Final_Meter_Reading.txt_total_kwh_imp(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Total kWh Imp field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_total_kwh_exp(driver).click();
		CI_Objects_Final_Meter_Reading.txt_total_kwh_exp(driver).sendKeys(Integer.toString(iTotalKwhExp));
		CI_Objects_Final_Meter_Reading.txt_total_kwh_exp(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Total kWh Exp field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_quad_1_kvarh(driver).click();
		CI_Objects_Final_Meter_Reading.txt_quad_1_kvarh(driver).sendKeys(Integer.toString(iQuad1));
		CI_Objects_Final_Meter_Reading.txt_quad_1_kvarh(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Quad 1 kVArh field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_quad_2_kvarh(driver).click();
		CI_Objects_Final_Meter_Reading.txt_quad_2_kvarh(driver).sendKeys(Integer.toString(iQuad2));
		CI_Objects_Final_Meter_Reading.txt_quad_2_kvarh(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Quad 2 kVArh field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_quad_3_kvarh(driver).click();
		CI_Objects_Final_Meter_Reading.txt_quad_3_kvarh(driver).sendKeys(Integer.toString(iQuad3));
		CI_Objects_Final_Meter_Reading.txt_quad_3_kvarh(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Quad 3 kVArh field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_quad_4_kvarh(driver).click();
		CI_Objects_Final_Meter_Reading.txt_quad_4_kvarh(driver).sendKeys(Integer.toString(iQuad4));
		CI_Objects_Final_Meter_Reading.txt_quad_4_kvarh(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Quad 4 kVArh field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_total_kvarh_imp(driver).click();
		CI_Objects_Final_Meter_Reading.txt_total_kvarh_imp(driver).sendKeys(Integer.toString(iTotalKvarhImp));
		CI_Objects_Final_Meter_Reading.txt_total_kvarh_imp(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Total kVArh Imp field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_total_kvarh_exp(driver).click();
		CI_Objects_Final_Meter_Reading.txt_total_kvarh_exp(driver).sendKeys(Integer.toString(iTotalKvarhExp));
		CI_Objects_Final_Meter_Reading.txt_total_kvarh_exp(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Total kVArh Exp field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_total_kvah(driver).click();
		CI_Objects_Final_Meter_Reading.txt_total_kvah(driver).sendKeys(Integer.toString(iTotalKvah));
		CI_Objects_Final_Meter_Reading.txt_total_kvah(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Total kVArh field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_rate_1(driver).click();
		CI_Objects_Final_Meter_Reading.txt_rate_1(driver).sendKeys(Integer.toString(iRate1));
		CI_Objects_Final_Meter_Reading.txt_rate_1(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Rate 1 field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_rate_2(driver).click();
		CI_Objects_Final_Meter_Reading.txt_rate_2(driver).sendKeys(Integer.toString(iRate2));
		CI_Objects_Final_Meter_Reading.txt_rate_2(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Rate 2 field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_rate_3(driver).click();
		CI_Objects_Final_Meter_Reading.txt_rate_3(driver).sendKeys(Integer.toString(iRate3));
		CI_Objects_Final_Meter_Reading.txt_rate_3(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Rate 3 field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_rate_4(driver).click();
		CI_Objects_Final_Meter_Reading.txt_rate_4(driver).sendKeys(Integer.toString(iRate4));
		CI_Objects_Final_Meter_Reading.txt_rate_4(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Rate 4 field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_rate_5(driver).click();
		CI_Objects_Final_Meter_Reading.txt_rate_5(driver).sendKeys(Integer.toString(iRate5));
		CI_Objects_Final_Meter_Reading.txt_rate_5(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Rate 5 field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_rate_6(driver).click();
		CI_Objects_Final_Meter_Reading.txt_rate_6(driver).sendKeys(Integer.toString(iRate6));
		CI_Objects_Final_Meter_Reading.txt_rate_6(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Rate 6 field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_kw_max_demand(driver).click();
		CI_Objects_Final_Meter_Reading.txt_kw_max_demand(driver).sendKeys(Integer.toString(iKwMaxDemand));
		CI_Objects_Final_Meter_Reading.txt_kw_max_demand(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | kW Maximum Demand field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_kva_max_demand(driver).click();
		CI_Objects_Final_Meter_Reading.txt_kva_max_demand(driver).sendKeys(Integer.toString(iKvaMaxDemand));
		CI_Objects_Final_Meter_Reading.txt_kva_max_demand(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | kVA Maximum Demand field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_other_reg_read(driver).click();
		CI_Objects_Final_Meter_Reading.txt_other_reg_read(driver).sendKeys(Integer.toString(iOtherRegRead));
		CI_Objects_Final_Meter_Reading.txt_other_reg_read(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Other Register Read field completed");
		}
		
		CI_Objects_Final_Meter_Reading.txt_other_reg_name(driver).click();
		CI_Objects_Final_Meter_Reading.txt_other_reg_name(driver).sendKeys(sOtherRegName);
		CI_Objects_Final_Meter_Reading.txt_other_reg_name(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Other Register Name field completed");
		}
		
		CI_Objects_Final_Meter_Reading.cbx_status_of_asset(driver).click();
		CI_Objects_Final_Meter_Reading.cbx_status_of_asset(driver).sendKeys(sAssetStatus);
		CI_Objects_Final_Meter_Reading.cbx_status_of_asset(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Status of Asset field completed");
		}
		
		CI_Objects_Final_Meter_Reading.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button clicked");
		}
		
		
	}	
			
		
	
//END OF METHODS
}