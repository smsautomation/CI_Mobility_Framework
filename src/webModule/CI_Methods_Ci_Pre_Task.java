package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Ci_Pre_Task;
import utility.Log;

public class CI_Methods_Ci_Pre_Task{
	
	
	
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
	* Function: addSuccessValuesSub100
	* Author: Charlotte Jones
	* Date: 06/07/2018
	* Purpose: The follwoing methods add the required responses in the C&I Pre Task section for a happy
	*          path scenario, selecting the various Sub100 metering supplies
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
	public static void addSuccessValuesSub100Wc1ph(WebDriver driver, String sTestCaseName) throws Exception{
				
		CI_Objects_Ci_Pre_Task.cbx_sub100_meter_supply(driver).click();
		CI_Objects_Ci_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys("WC 1");
		CI_Objects_Ci_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Sub100 WC 1PH metering supply selected");
		}

		CI_Objects_Ci_Pre_Task.btn_photos_allowed_y(driver).click();
		{
			Log.info(sTestCaseName + " | Are Photographs Allowed For This Site? - Yes radio button selected");
		}
		
		CI_Objects_Ci_Pre_Task.btn_confirm_supply_type_y(driver).click();
		{
			Log.info(sTestCaseName + " | Supply Type Confirmed: - Yes radio button selected");
		}

		CI_Objects_Ci_Pre_Task.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button selected");
		}
		
	// END OF Sub100 WC 1PH Add Success Values method		
	}	
		
	public static void addSuccessValuesSub100Wc3ph(WebDriver driver, String sTestCaseName) throws Exception{
		
		CI_Objects_Ci_Pre_Task.cbx_sub100_meter_supply(driver).click();
		CI_Objects_Ci_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys("WC 3");
		CI_Objects_Ci_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Sub100 WC 3PH metering supply selected");
		}
		
		CI_Objects_Ci_Pre_Task.btn_photos_allowed_y(driver).click();
		{
			Log.info(sTestCaseName + " | Are Photographs Allowed For This Site? - Yes radio button selected");
		}

		CI_Objects_Ci_Pre_Task.btn_confirm_supply_type_y(driver).click();
		{
			Log.info(sTestCaseName + " | Supply Type Confirmed: - Yes radio button selected");
		}
		
		CI_Objects_Ci_Pre_Task.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button selected");
		}
		
	// END OF Sub100 WC 3PH Add Success Values method		
		
	}
		
	public static void addSuccessValuesSub100LvCt(WebDriver driver, String sTestCaseName) throws Exception{
		
		CI_Objects_Ci_Pre_Task.cbx_sub100_meter_supply(driver).click();
		CI_Objects_Ci_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys("CT L");
		CI_Objects_Ci_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Sub100 LV CT metering supply selected");
		}
		
		CI_Objects_Ci_Pre_Task.btn_photos_allowed_y(driver).click();
		{
			Log.info(sTestCaseName + " | Are Photographs Allowed For This Site? - Yes radio button selected");
		}
		
		CI_Objects_Ci_Pre_Task.btn_confirm_supply_type_y(driver).click();
		{
			Log.info(sTestCaseName + " | Supply Type Confirmed: - Yes radio button selected");
		}

		CI_Objects_Ci_Pre_Task.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button selected");
		}
		
	// END OF Sub100 LV CT Add Success Values method		
		
	}
			
	public static void addSuccessValuesSub100HvCt(WebDriver driver, String sTestCaseName) throws Exception{
		
		CI_Objects_Ci_Pre_Task.cbx_sub100_meter_supply(driver).click();
		CI_Objects_Ci_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys("CT H");
		CI_Objects_Ci_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Sub100 HV CT metering supply selected");
		}
		
		CI_Objects_Ci_Pre_Task.btn_photos_allowed_y(driver).click();
		{
			Log.info(sTestCaseName + " | Are Photographs Allowed For This Site? - Yes radio button selected");
		}
		
		CI_Objects_Ci_Pre_Task.btn_confirm_supply_type_y(driver).click();
		{
			Log.info(sTestCaseName + " | Supply Type Confirmed: - Yes radio button selected");
		}
		
		CI_Objects_Ci_Pre_Task.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button selected");
		}

	// END OF Sub100 HV CT Add Success Values method		
		
	}
		
	
//END OF METHODS
}