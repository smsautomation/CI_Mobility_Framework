package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Dno_Bno_Work;
import utility.Log;

public class CI_Methods_Dno_Bno_Work{
	
	
	
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
	* Function: addSuccessValuesAll
	* Author: Charlotte Jones
	* Date: 09/08/2018
	* Purpose: This method adds the required responses in the DNO/BNO Work section for a happy path
	* 	scenario - this Methods script covers the Job Summary Details sub-section from the workflow doc
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
	
	
		// *!*!*!*!*!* Need values for below variables *!*!*!*!*!*
		String	sSurveyReport = "survey report words";
		String	sCabinetSerialNum = "";	// up to 30 characters in length
		String	sSubStationName = "";	// up to 30 characters 
		String	sWorkSummary = "";
		
				
		CI_Objects_Dno_Bno_Work.txt_survey_report(driver).click();
		CI_Objects_Dno_Bno_Work.txt_survey_report(driver).sendKeys(sSurveyReport);
		CI_Objects_Dno_Bno_Work.txt_survey_report(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Survey Report field completed");
		}
		
		CI_Objects_Dno_Bno_Work.btn_photo_survey_1(driver).click();
		CI_Objects_Dno_Bno_Work.btn_photo_survey_2(driver).click();
		CI_Objects_Dno_Bno_Work.btn_photo_survey_3(driver).click();
		CI_Objects_Dno_Bno_Work.btn_photo_survey_4(driver).click();
		CI_Objects_Dno_Bno_Work.btn_photo_survey_5(driver).click();
		{
			Log.info(sTestCaseName + " | 5 Survey Photos taken");
		}
		
		CI_Objects_Dno_Bno_Work.btn_p283_completed(driver).click();
		{
			Log.info(sTestCaseName + " | P283 Completed? tickbox checked");
		}
		
		CI_Objects_Dno_Bno_Work.btn_photo_p283_1(driver).click();
		CI_Objects_Dno_Bno_Work.btn_photo_p283_2(driver).click();
		{
			Log.info(sTestCaseName + " | 2 P283 Photos taken");
		}
		
		CI_Objects_Dno_Bno_Work.txt_cabinet_serial_num(driver).click();
		CI_Objects_Dno_Bno_Work.txt_cabinet_serial_num(driver).sendKeys(sCabinetSerialNum);
		{
			Log.info(sTestCaseName + " | Meter Cabinet Serial Number field completed");
		}
		
		CI_Objects_Dno_Bno_Work.txt_sub_station_name_num(driver).click();
		CI_Objects_Dno_Bno_Work.txt_sub_station_name_num(driver).sendKeys(sSubStationName);
		{
			Log.info(sTestCaseName + " | Sub Station Name/Number field completed");
		}
		
		CI_Objects_Dno_Bno_Work.txt_work_summary(driver).click();
		CI_Objects_Dno_Bno_Work.txt_work_summary(driver).sendKeys(sWorkSummary);
		{
			Log.info(sTestCaseName + " | Sub Station Name/Number field completed");
		}
		
				
	// END OF ADD SUCCESS VALUES ALL METHOD
	}

		
		
	
//END OF METHODS
}