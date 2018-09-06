package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Network_Signal_Strength_Test;
import utility.Log;

public class CI_Methods_Network_Signal_Strength_Test{
	
	
	
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
	* Function: addSuccessValuesAll
	* Author: Charlotte Jones
	* Date: 06/08/2018
	* Purpose: This method adds the required responses in the Call Forward section for a happy path scenario 
	* Arguments:	iSignalVod
	* 				iSignalO2
	* 				iSignalEe			
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
	
		Integer iSignalVod = 37;
	    Integer iSignalO2 = 15;
	    Integer iSignalEe = 66;
	    
	    

		CI_Objects_Network_Signal_Strength_Test.btn_signal_strength_required_y(driver).click();
		
		// Vodaphone signal strength
		CI_Objects_Network_Signal_Strength_Test.txt_sig_strength_vod(driver).click();
		CI_Objects_Network_Signal_Strength_Test.txt_sig_strength_vod(driver).sendKeys(Integer.toString(iSignalVod));
		CI_Objects_Network_Signal_Strength_Test.txt_sig_strength_vod(driver).sendKeys(Keys.ENTER);
		
		// O2 signal strength
		CI_Objects_Network_Signal_Strength_Test.txt_sig_strength_o2(driver).click();
		CI_Objects_Network_Signal_Strength_Test.txt_sig_strength_o2(driver).sendKeys(Integer.toString(iSignalO2));
		CI_Objects_Network_Signal_Strength_Test.txt_sig_strength_o2(driver).sendKeys(Keys.ENTER);
		
		// EE signal strength
		CI_Objects_Network_Signal_Strength_Test.txt_sig_strength_ee(driver).click();
		CI_Objects_Network_Signal_Strength_Test.txt_sig_strength_ee(driver).sendKeys(Integer.toString(iSignalEe));
		CI_Objects_Network_Signal_Strength_Test.txt_sig_strength_ee(driver).sendKeys(Keys.ENTER);
		
		CI_Objects_Network_Signal_Strength_Test.btn_enough_signal_y(driver).click();
		{
			Log.info(sTestCaseName + " | Network Signal Strength Test completed and passed");
		}
		
		
	}	
			
		
	
//END OF METHODS
}