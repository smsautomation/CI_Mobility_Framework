package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_De_Energisation_Of_Supply;
import utility.Log;

public class CI_Methods_De_Energisation_Of_Supply{
	
	
	
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
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the De-energisation of Supply section for a
	* happy path scenario
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
	
	
	public static void addSuccessValuesAll(WebDriver driver, String sTestCaseName) throws Exception{
	
		
				
		CI_Objects_De_Energisation_Of_Supply.btn_supply_de_energised_y(driver).click();
	    {
			Log.info(sTestCaseName + " | Supply De-energised? - Yes radio button selected");
		}
	    
	    CI_Objects_De_Energisation_Of_Supply.btn_safety_label_fitted(driver).click();
	    {
			Log.info(sTestCaseName + " | Safety Label Fitted checkbox ticked");
		}
	    
	    CI_Objects_De_Energisation_Of_Supply.btn_all_seals_intact(driver).click();
	    {
			Log.info(sTestCaseName + " | All Seals Intact - Including Blocks and Isolators checkbox ticked");
		}
	    
	    CI_Objects_De_Energisation_Of_Supply.btn_visual_inspection_completed(driver).click();
	    {
			Log.info(sTestCaseName + " | Visual Inspection Completed checkbox ticked");
		}
	    
	    
	    
	}	
			
		
	
//END OF METHODS
}