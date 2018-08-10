package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Site_Survey;
import utility.Log;

public class CI_Methods_Site_Survey{
	
	
	
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
	* Function: addSuccessValuesMeterExchVisitPart1
	* Author: Charlotte Jones
	* Date: 10/08/2018
	* Purpose: This method adds the required responses in the Site Survey section for a Meter Exchange
	* 	scenario - where the meter can be exchange during the visit 
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
	public static void addSuccessValuesMeterExchVisitPart1(WebDriver driver, String sTestCaseName) throws Exception{
	
	
				
		CI_Objects_Site_Survey.btn_meter_exch_required_y(driver).click();
		{
			Log.info(sTestCaseName + " | Is a Meter Exchange Required? - Yes radio button selected");
		}
		
		CI_Objects_Site_Survey.btn_exch_during_visit_y(driver).click();
		{
			Log.info(sTestCaseName + " | Can the Meter Be Exchanged During This Visit? - Yes radio button selected");
		}
		
		// the workflow then needs to leave this section and call several other tasks - does return to this
		//	section, - covered in Meter Exch Part 2
				
	// END OF ADD SUCCESS VALUES METHOD
	}

		
	/* **************************************************************************************************
	* Function: addSuccessValuesMeterExchVisitPart2
	* Author: Charlotte Jones
	* Date: 10/08/2018
	* Purpose: This method adds the required responses in the Site Survey section for a Meter Exchange
	* 	scenario - where the meter can be exchange during the visit 
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
	public static void addSuccessValuesMeterExchVisitPart2(WebDriver driver, String sTestCaseName) throws Exception{
	
		// *!*!*!*!*!*!*!*!*!* Need values for below variables *!*!*!*!*!*!*!*!*!* 
		
		String	sSiteVisitOutcome = "";
		
		// Job Resolution sub-section
				
		CI_Objects_Site_Survey.txt_outcome_site_visit(driver).click();
		CI_Objects_Site_Survey.txt_outcome_site_visit(driver).sendKeys(sSiteVisitOutcome);
		CI_Objects_Site_Survey.txt_outcome_site_visit(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Outcome of Site Visit field completed");
		}
		
		CI_Objects_Site_Survey.btn_photo_site_1(driver).click();
		{
			Log.info(sTestCaseName + " | Photographic Evidence - photo taken");
		}
		
		
				
	// END OF ADD SUCCESS VALUES METER EXCH VISIT PART 2 METHOD
	}
	
	
	
	
	
//END OF METHODS
}