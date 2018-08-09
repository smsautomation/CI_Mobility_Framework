package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Non_Serialised_Asset_Info;
import utility.Log;

public class CI_Methods_Non_Serialised_Asset_Info{
	
	
	
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
	* Function: addSuccessValuesAerial
	* Author: Charlotte Jones
	* Date: 07/08/2018
	* Purpose: This method adds the required responses in the Non Serialised Assets section for a happy
	* path scenario where the non-serialised asset is either an aerial kit or a high gain aerial
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
	public static void addSuccessValuesAerial(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		// *!*!*!*!*!*!*!*!* Need to complete the below with valid values *!*!*!*!*!*!*!*!*
		
		String 	sNonSerialisedAsset = "a";
		String 	sAerialLoc = "";
		Integer iAssetQuantity = 3;
		
		
		CI_Objects_Non_Serialised_Asset_Info.cbx_non_serialised_assets(driver).click();
		CI_Objects_Non_Serialised_Asset_Info.cbx_non_serialised_assets(driver).sendKeys(sNonSerialisedAsset);
		CI_Objects_Non_Serialised_Asset_Info.cbx_non_serialised_assets(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Non Serialised Assets field completed");
		}
		
		CI_Objects_Non_Serialised_Asset_Info.txt_asset_quantity(driver).click();
		CI_Objects_Non_Serialised_Asset_Info.txt_asset_quantity(driver).sendKeys(Integer.toString(iAssetQuantity));
		{
			Log.info(sTestCaseName + " | Non-serialised asset quantity box completed");
		}
		
		CI_Objects_Non_Serialised_Asset_Info.cbx_aerial_location(driver).click();
		CI_Objects_Non_Serialised_Asset_Info.cbx_aerial_location(driver).sendKeys(sAerialLoc);
		CI_Objects_Non_Serialised_Asset_Info.cbx_aerial_location(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Aerial Location field completed");
		}
		
		CI_Objects_Non_Serialised_Asset_Info.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button clicked");
		}
		
		
		
	}

	// END OF ADD SUCCESS VALUES AERIAL METHOD
	
	

	/* **************************************************************************************************
	* Function: addSuccessValuesContactor
	* Author: Charlotte Jones
	* Date: 07/08/2018
	* Purpose: This method adds the required responses in the Non Serialised Assets section for a happy
	* path scenario where the non-serialised asset is a contactor
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
	public static void addSuccessValuesContactor(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		// *!*!*!*!*!*!*!*!* Need to complete the below with valid values *!*!*!*!*!*!*!*!*	
		
		
		String 	sNonSerialisedAsset = "cont";
		Integer	iAssetQuantity = 2;
		
		
		CI_Objects_Non_Serialised_Asset_Info.cbx_non_serialised_assets(driver).click();
		CI_Objects_Non_Serialised_Asset_Info.cbx_non_serialised_assets(driver).sendKeys(sNonSerialisedAsset);
		CI_Objects_Non_Serialised_Asset_Info.cbx_non_serialised_assets(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Non Serialised Assets field completed");
		}
		
		CI_Objects_Non_Serialised_Asset_Info.txt_asset_quantity(driver).click();
		CI_Objects_Non_Serialised_Asset_Info.txt_asset_quantity(driver).sendKeys(Integer.toString(iAssetQuantity));
		{
			Log.info(sTestCaseName + " | Non-serialised asset quantity box completed");
		}
		
		CI_Objects_Non_Serialised_Asset_Info.btn_operation_confirmed(driver).click();
		{
			Log.info(sTestCaseName + " | Operation Confirmed field completed");
		}
		
		CI_Objects_Non_Serialised_Asset_Info.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button clicked");
		}
		
	}
	
	// END OF ADD SUCCESS VALUES CONTACTOR METHOD
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesPulseBox
	* Author: Charlotte Jones
	* Date: 07/08/2018
	* Purpose: This method adds the required responses in the Non Serialised Assets section for a happy
	* path scenario where the non-serialised asset is a pulse box
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
	public static void addSuccessValuePulseBox(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		// *!*!*!*!*!*!*!*!* Need to complete the below with valid values *!*!*!*!*!*!*!*!*	
		
		
		String 	sNonSerialisedAsset = "p";
		String	sUpiValue = "0.01";
		Integer	iAssetQuantity = 2;
		
		
		CI_Objects_Non_Serialised_Asset_Info.cbx_non_serialised_assets(driver).click();
		CI_Objects_Non_Serialised_Asset_Info.cbx_non_serialised_assets(driver).sendKeys(sNonSerialisedAsset);
		CI_Objects_Non_Serialised_Asset_Info.cbx_non_serialised_assets(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Non Serialised Assets field completed");
		}
		
		CI_Objects_Non_Serialised_Asset_Info.txt_asset_quantity(driver).click();
		CI_Objects_Non_Serialised_Asset_Info.txt_asset_quantity(driver).sendKeys(Integer.toString(iAssetQuantity));
		{
			Log.info(sTestCaseName + " | Non-serialised asset quantity box completed");
		}
				
		CI_Objects_Non_Serialised_Asset_Info.txt_upi_value(driver).click();
		CI_Objects_Non_Serialised_Asset_Info.txt_elec_install_details(driver).sendKeys(sUpiValue);
		{
			Log.info(sTestCaseName + " | Operation Confirmed field completed");
		}
		
		CI_Objects_Non_Serialised_Asset_Info.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button clicked");
		}
		
	}
	
	// END OF ADD SUCCESS VALUES PULSE BOX METHOD
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesElecInstall
	* Author: Charlotte Jones
	* Date: 07/08/2018
	* Purpose: This method adds the required responses in the Non Serialised Assets section for a happy
	* path scenario where the non-serialised asset is an electrical installation
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
	public static void addSuccessValueElecInstall(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		// *!*!*!*!*!*!*!*!* Need to complete the below with valid values *!*!*!*!*!*!*!*!*	
		
		
		String 	sNonSerialisedAsset = "e";
		String  sElecInstall = "";
		Integer	iAssetQuantity = 1;
		
		
		CI_Objects_Non_Serialised_Asset_Info.cbx_non_serialised_assets(driver).click();
		CI_Objects_Non_Serialised_Asset_Info.cbx_non_serialised_assets(driver).sendKeys(sNonSerialisedAsset);
		CI_Objects_Non_Serialised_Asset_Info.cbx_non_serialised_assets(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Non Serialised Assets field completed");
		}
		
		CI_Objects_Non_Serialised_Asset_Info.txt_asset_quantity(driver).click();
		CI_Objects_Non_Serialised_Asset_Info.txt_asset_quantity(driver).sendKeys(Integer.toString(iAssetQuantity));
		{
			Log.info(sTestCaseName + " | Non-serialised asset quantity box completed");
		}
		
		CI_Objects_Non_Serialised_Asset_Info.txt_elec_install_details(driver).click();
		CI_Objects_Non_Serialised_Asset_Info.txt_elec_install_details(driver).sendKeys(sElecInstall);
		{
			Log.info(sTestCaseName + " | Non Serialised Assets field completed");
		}

		
		CI_Objects_Non_Serialised_Asset_Info.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button clicked");
		}
		
	}
	
	// END OF ADD SUCCESS VALUES ELEC INSTALL METHOD
	
	
	
	
//END OF METHODS
}