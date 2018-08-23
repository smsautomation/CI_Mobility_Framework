package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Energisation_Of_Supply;
import utility.Log;

public class CI_Methods_Energisation_Of_Supply{
	
	
	
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
	* Function: addSuccessValuesAllBeforeMeterReadings
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the Energisation of Supply section for a
	* 	happy path scenario - this covers this part of the section before it leaves and goes to call
	* 	Detailed Meter Readings
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
	
	
	public static void addSuccessValuesAllBeforeMeterReadings(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		CI_Objects_Energisation_Of_Supply.btn_supply_live_y(driver).click();
	    {
			Log.info(sTestCaseName + " | Is Supply Live At Cut Out? Yes radio button selected");
		}
	    
	    CI_Objects_Energisation_Of_Supply.btn_polarity_check_pass(driver).click();
	    {
			Log.info(sTestCaseName + " | Polarity Check - Pass radio button selected");
	    }
	    
	    CI_Objects_Energisation_Of_Supply.btn_phase_rotation_checked(driver).click();
	    {
			Log.info(sTestCaseName + " | Phase Rotation Checked At Service Cut Out checkbox ticked");
	    }
	    
	    CI_Objects_Energisation_Of_Supply.btn_cust_install_complete_y(driver).click();
	    {
			Log.info(sTestCaseName + " | Is Customer's Installation Complete? - Yes radio button selected");
	    }
	    
	    CI_Objects_Energisation_Of_Supply.btn_supply_re_energised(driver).click();
	    {
			Log.info(sTestCaseName + " | Supply Re-energised and Safety Notices Fitted checkbox ticked");
	    }
	    
	    
	}	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesAllAfterMeterReadings
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the Energisation of Supply section for a
	* 	happy path scenario - this covers this part of the section once it comes back after calling
	* 	Detailed Meter Readings
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
	
	
	public static void addSuccessValuesAllAfterMeterReadings(WebDriver driver, String sTestCaseName) throws Exception{		
	
		// variables
		String sSupplyEnergised = "comments about the energisation of supply";
		
		
		CI_Objects_Energisation_Of_Supply.txt_supply_energised_comments(driver).click();
		CI_Objects_Energisation_Of_Supply.txt_supply_energised_comments(driver).sendKeys(sSupplyEnergised);
	    {
			Log.info(sTestCaseName + " | Supply Energised - Comments field completed");
		}
		
	}
	
	
//END OF METHODS
}