package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Meter_Upgrade_Downgrade;
import utility.Log;

public class CI_Methods_Meter_Upgrade_Downgrade{
	
	
	
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
	* Function: addSuccessValuesReprogramme
	* Author: Charlotte Jones
	* Date: 10/08/2018
	* Purpose: This method adds the required responses in the Meter Upgrade or Downgrade section for 
	* 	the scenario where the meter requires reprogramming
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
	public static void addSuccessValuesRepgramme(WebDriver driver, String sTestCaseName) throws Exception{
	
	
				
		CI_Objects_Meter_Upgrade_Downgrade.btn_work_required_reprogramme(driver).click();
		{
			Log.info(sTestCaseName + " | Work Required? Re-programme Meter radio button clicked");
		}
		
				
	// END OF ADD SUCCESS VALUES REPROGRAMME METHOD
	}

	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesExchange
	* Author: Charlotte Jones
	* Date: 10/08/2018
	* Purpose: This method adds the required responses in the Meter Upgrade or Downgrade section for 
	* 	the scenario where the meter requires exchanging
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
	public static void addSuccessValuesExchange(WebDriver driver, String sTestCaseName) throws Exception{
	
	
				
		CI_Objects_Meter_Upgrade_Downgrade.btn_work_required_exchange(driver).click();
		{
			Log.info(sTestCaseName + " | Work Required? Exchange Meter radio button clicked");
		}
		
				
	// END OF ADD SUCCESS VALUES EXCHANGE METHOD
	}

		
	
//END OF METHODS
}