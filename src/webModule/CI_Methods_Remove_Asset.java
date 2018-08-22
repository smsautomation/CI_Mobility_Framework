package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Remove_Asset;
import utility.Log;

public class CI_Methods_Remove_Asset{
	
	
	
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
	* Function: addSuccessValuesSub100All
	* Author: Charlotte Jones
	* Date: 06/08/2018
	* Purpose: This method adds the required responses in the Remove Asset section for a happy path scenario
	* Arguments: 	sMeterToRemove
	* 				sRemovedAssetStatus
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
	
		//Variables
		
		String sMeterToRemove = "";
		String sRemovedAssetStatus = "of";
		
		CI_Objects_Remove_Asset.cbx_meter_to_remove(driver).click();
		CI_Objects_Remove_Asset.cbx_meter_to_remove(driver).sendKeys(sMeterToRemove);
		CI_Objects_Remove_Asset.cbx_meter_to_remove(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Select a meter to remove completed");
		}
		
		CI_Objects_Remove_Asset.cbx_removed_asset_status(driver).click();
		CI_Objects_Remove_Asset.cbx_removed_asset_status(driver).sendKeys(sRemovedAssetStatus);
		CI_Objects_Remove_Asset.cbx_removed_asset_status(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Removed Asset Status completed");
		}
		
		CI_Objects_Remove_Asset.btn_confirm_asset_removed_y(driver).click();
		{
			Log.info(sTestCaseName + " | Confirm Asset Removed? completed");
		}

		/*
		CI_Objects_Remove_Asset.btn_ok(driver).click();
		{
			Log.info(sTestCaseName + " | Removed List Successfull Updated pop up dismissed");
		}
		*/
		
		CI_Objects_Remove_Asset.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button clicked");
		}
		
		
	// END OF ADD SUCCESS VALUES ALL METHOD
	}

		
		
	
//END OF METHODS
}