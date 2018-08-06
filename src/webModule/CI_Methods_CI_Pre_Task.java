package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_CI_Pre_Task;
import utility.Log;

public class CI_Methods_CI_Pre_Task{
	
	
	
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
	public static void addSuccessValuesSub100WC1PH(WebDriver driver, String sTestCaseName) throws Exception{
				
		CI_Objects_CI_Pre_Task.cbx_sub100_meter_supply(driver).click();
		CI_Objects_CI_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys("WC 1");
		CI_Objects_CI_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Sub100 WC 1PH metering supply selected");
		}

	// END OF Sub100 WC 1PH Add Success Values method		
	}	
		
	public static void addSuccessValuesSub100WC3PH(WebDriver driver, String sTestCaseName) throws Exception{
		
		CI_Objects_CI_Pre_Task.cbx_sub100_meter_supply(driver).click();
		CI_Objects_CI_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys("WC 3");
		CI_Objects_CI_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Sub100 WC 3PH metering supply selected");
		}

	// END OF Sub100 WC 3PH Add Success Values method		
		
	}
		
	public static void addSuccessValuesSub100LVCT(WebDriver driver, String sTestCaseName) throws Exception{
		
		CI_Objects_CI_Pre_Task.cbx_sub100_meter_supply(driver).click();
		CI_Objects_CI_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys("L");
		CI_Objects_CI_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Sub100 LV CT metering supply selected");
		}

	// END OF Sub100 LV CT Add Success Values method		
		
	}
			
	public static void addSuccessValuesSub100HVCT(WebDriver driver, String sTestCaseName) throws Exception{
		
		CI_Objects_CI_Pre_Task.cbx_sub100_meter_supply(driver).click();
		CI_Objects_CI_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys("H");
		CI_Objects_CI_Pre_Task.cbx_sub100_meter_supply(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Sub100 HV CT metering supply selected");
		}

	// END OF Sub100 HV CT Add Success Values method		
		
	}
		
	
//END OF METHODS
}