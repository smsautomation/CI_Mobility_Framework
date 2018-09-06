package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Accuracy_Test_Cop4;
import utility.Log;

public class CI_Methods_Accuracy_Test_Cop4{
	
	
	
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
	* Function: addSuccessValuesCustLoadNonWc
	* Author: Charlotte Jones
	* Date: 08/08/2018
	* Purpose: This method adds the required responses in the Accuracy Test (COP4) section for a happy
	* 	path scenario - choosing type of test as TYPE B
	* Metering Supply Types:			sdf
	* 									df
	* Arguments:	sSerialNum
	* 				sStartTime
	* 				sErrorCalib
	* 				sType
	* 				sTestPoint
	* 				iTestError
	* 				iTestErrorPlus
	* 				iTestErrorMinus
	* 				iTestSetError
	* 				iTestSetErrorPlus
	* 				iTestSetErrorMinus
	* 				iCtError
	* 				iCtErrorPlus
	* 				iCtErrorMinus
	* 				iVtError
	* 				iVtErrorPlus
	* 				iVtErrorMinus
	* 				sOkFail
	* 				sInstSerialNum
	* 				sCalibDate
	* 				sTestDate
	* 				sFinishTime
	* 				sComments
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	
	// **** 	need to look at meter types applicable for the classes in this method
	//deliberately not commented out the above task to ensure it generates an error for me to come back to
	
	public static void addSuccessValuesCustLoadNonWc(WebDriver driver, String sTestCaseName) throws Exception{
	
		// *!*!*!*!*!*!* Will need to provide values for the below variables *!*!*!*!*!*!* 
		
		String	sSerialNum =  "";
		String	sStartTime = "";
		String	sErrorCalib = "65.23";
		String	sType = "A";
		String	sTestPoint = "C";
		Integer	iTestError = 12;
		Integer	iTestErrorPlus = 5;
		Integer	iTestErrorMinus = 3;
		Integer	iTestSetError = 33;
		Integer	iTestSetErrorPlus = 1;
		Integer	iTestSetErrorMinus = 2;
		Integer	iCtError = 12;
		Integer	iCtErrorPlus = 6;
		Integer	iCtErrorMinus = 5;
		Integer	iVtError = 15;
		Integer	iVtErrorPlus = 1;
		Integer	iVtErrorMinus = 3;
	//	String	sOkFail = "o";
		String	sInstSerialNum = "";
		String	sCalibDate = "";
		String	sTestDate = "";
		String	sFinishTime= "";
		String	sComments = "comments";
		
		
		CI_Objects_Accuracy_Test_Cop4.btn_test_on_cust_load_y(driver).click();
	    {
			Log.info(sTestCaseName + " | Is test carried out using customer's load? - Yes radio button selected");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.btn_test_type_b(driver).click();
	    {
			Log.info(sTestCaseName + " | Type of Test - TYPE B radio button selected");
		}
	    
	    // General information
	    
	    CI_Objects_Accuracy_Test_Cop4.cbx_serial_num(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.cbx_serial_num(driver).sendKeys(sSerialNum);
	    CI_Objects_Accuracy_Test_Cop4.cbx_serial_num(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Serial Number selected from dropdown menu");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_start_time(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_start_time(driver).sendKeys(sStartTime);
	    CI_Objects_Accuracy_Test_Cop4.txt_start_time(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Start Time field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_error_calibration(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_error_calibration(driver).sendKeys(sErrorCalib);
	    CI_Objects_Accuracy_Test_Cop4.txt_error_calibration(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Error Calibration field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.cbx_test_type_undertaken(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.cbx_test_type_undertaken(driver).sendKeys(sType);
	    CI_Objects_Accuracy_Test_Cop4.cbx_test_type_undertaken(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Type Undertaken - option selected from dropdown");
		}
	    
	    // Test sub-section
	    
	    CI_Objects_Accuracy_Test_Cop4.cbx_test_point(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.cbx_test_point(driver).sendKeys(sTestPoint);
	    CI_Objects_Accuracy_Test_Cop4.cbx_test_point(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Point field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error(driver).sendKeys(Integer.toString(iTestError));
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Error % field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error_plus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error_plus(driver).sendKeys(Integer.toString(iTestErrorPlus));
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error_plus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Error % - plus tolerance field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error_minus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error_minus(driver).sendKeys(Integer.toString(iTestErrorMinus));
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error_minus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Error %  - minus tolerance field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error(driver).sendKeys(Integer.toString(iTestSetError));
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Set Error % field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_plus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_plus(driver).sendKeys(Integer.toString(iTestSetErrorPlus));
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_plus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Set Error % - plus tolerance field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_minus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_minus(driver).sendKeys(Integer.toString(iTestSetErrorMinus));
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_minus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Set Error % - minus tolerance field completed");
		}
	    
	    // *!*!*!*!*!*!* Need to include method to check the Meter Error %
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error(driver).sendKeys(Integer.toString(iCtError));
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | CT Error % field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error_plus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error_plus(driver).sendKeys(Integer.toString(iCtErrorPlus));
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error_plus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | CT Error % field - plus tolerance completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error_minus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error_minus(driver).sendKeys(Integer.toString(iCtErrorMinus));
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error_minus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | CT Error %  - minus tolerance field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error(driver).sendKeys(Integer.toString(iVtError));
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | VT Error % field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error_plus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error_plus(driver).sendKeys(Integer.toString(iVtErrorPlus));
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error_plus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | VT Error % - plus tolerance field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error_minus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error_minus(driver).sendKeys(Integer.toString(iVtErrorMinus));
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error_minus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | VT Error % - minus tolerance field completed");
		}
	    
	    /*    not sure if we should use the below method   *!*!*!*!*!*!*!*!*
	     *    - or if I could perform a check that the field has been correctly pre-populated as per business rules
	     *                                                 *!*!*!*!*!*!*!*!*
	    
	    CI_Objects_Accuracy_Test_COP4.cbx_ok_fail(driver).click();
	    CI_Objects_Accuracy_Test_COP4.cbx_ok_fail(driver).sendKeys(sOkFail);
	    CI_Objects_Accuracy_Test_COP4.txt_vt_error_minus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | VT Error % field completed");
		}
	    
	    */
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_instrument_serial_num(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_instrument_serial_num(driver).sendKeys(sInstSerialNum);
	    {
			Log.info(sTestCaseName + " | Instrument Serial Number field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.btn_test_outcome_pass(driver).click();
	    {
			Log.info(sTestCaseName + " | Test Outcome = Pass radio button selected");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_last_calibration_date(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_last_calibration_date(driver).sendKeys(sCalibDate);
	    {
			Log.info(sTestCaseName + " | Last Calibration Date field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_date_of_test(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_date_of_test(driver).sendKeys(sTestDate);
	    {
			Log.info(sTestCaseName + " | Date of Test field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_finish_time(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_finish_time(driver).sendKeys(sFinishTime);
	    {
			Log.info(sTestCaseName + " | Finish Time field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_signature(driver).click();
	    {
			Log.info(sTestCaseName + " | Signature field clicked");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_comments(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_finish_time(driver).sendKeys(sComments);
	    {
			Log.info(sTestCaseName + " | Finish Time field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.btn_save(driver).click();
	    {
			Log.info(sTestCaseName + " | Save button clicked");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.btn_completed(driver).click();
	    {
			Log.info(sTestCaseName + " | Completed button clicked");
		}
	    
	// END OF ADD SUCCESS VALUES CUST LOAD NON WC METHOD    
	}	
			
	
	
	/* **************************************************************************************************
	 * Function: addSuccessValuesCustLoadWc3ph
	* Author: Charlotte Jones
	* Date: 15/08/2018
	* Purpose: This method adds the required responses in the Accuracy Test (COP4) section for a happy
	* path scenario - choosing type of test as TYPE B
	* Arguments:	sSerialNum
	* 				sStartTime
	* 				sErrorCalib
	* 				sType
	* 				sTestPoint
	* 				iTestError
	* 				iTestErrorPlus
	* 				iTestErrorMinus
	* 				iTestSetError
	* 				iTestSetErrorPlus
	* 				iTestSetErrorMinus
	* 				iCtError
	* 				iCtErrorPlus
	* 				iCtErrorMinus
	* 				iVtError
	* 				iVtErrorPlus
	* 				iVtErrorMinus
	* 				sOkFail
	* 				sInstSerialNum
	* 				sCalibDate
	* 				sTestDate
	* 				sFinishTime
	* 				sComments
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 		
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	


	public static void addSuccessValuesCustLoadWc3ph(WebDriver driver, String sTestCaseName) throws Exception{

	// *!*!*!*!*!*!* Will need to provide values for the below variables *!*!*!*!*!*!* 
	
		String	sSerialNum =  "";
		String	sStartTime = "";
		String	sErrorCalib = "65.23";
		String	sType = "A";
		String	sTestPoint = "C";
		Integer	iTestError = 12;
		Integer	iTestErrorPlus = 5;
		Integer	iTestErrorMinus = 3;
		Integer	iTestSetError = 33;
		Integer	iTestSetErrorPlus = 1;
		Integer	iTestSetErrorMinus = 2;
		Integer	iCtError = 12;
		Integer	iCtErrorPlus = 6;
		Integer	iCtErrorMinus = 5;
		Integer	iVtError = 15;
		Integer	iVtErrorPlus = 1;
		Integer	iVtErrorMinus = 3;
	//	String	sOkFail = "o";
		String	sInstSerialNum = "";
		String	sCalibDate = "";
		String	sTestDate = "";
		String	sFinishTime= "";
		String	sComments = "comments";
	

    
    	// General information
    
    	CI_Objects_Accuracy_Test_Cop4.cbx_serial_num(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.cbx_serial_num(driver).sendKeys(sSerialNum);
    	CI_Objects_Accuracy_Test_Cop4.cbx_serial_num(driver).sendKeys(Keys.ENTER);
    	{
			Log.info(sTestCaseName + " | Serial Number selected from dropdown menu");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_start_time(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_start_time(driver).sendKeys(sStartTime);
    	CI_Objects_Accuracy_Test_Cop4.txt_start_time(driver).sendKeys(Keys.ENTER);
    	{
			Log.info(sTestCaseName + " | Start Time field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_error_calibration(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_error_calibration(driver).sendKeys(sErrorCalib);
    	CI_Objects_Accuracy_Test_Cop4.txt_error_calibration(driver).sendKeys(Keys.ENTER);
    	{
			Log.info(sTestCaseName + " | Error Calibration field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.cbx_test_type_undertaken(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.cbx_test_type_undertaken(driver).sendKeys(sType);
    	CI_Objects_Accuracy_Test_Cop4.cbx_test_type_undertaken(driver).sendKeys(Keys.ENTER);
    	{
    	Log.info(sTestCaseName + " | Test Type Undertaken - option selected from dropdown");
		}
    
    	// Test sub-section
    
    	CI_Objects_Accuracy_Test_Cop4.cbx_test_point(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.cbx_test_point(driver).sendKeys(sTestPoint);
    	CI_Objects_Accuracy_Test_Cop4.cbx_test_point(driver).sendKeys(Keys.ENTER);
    	{	
			Log.info(sTestCaseName + " | Test Point field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_test_error(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_test_error(driver).sendKeys(Integer.toString(iTestError));
    	CI_Objects_Accuracy_Test_Cop4.txt_test_error(driver).sendKeys(Keys.ENTER);
    	{
			Log.info(sTestCaseName + " | Test Error % field completed");
    	}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_test_error_plus(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_test_error_plus(driver).sendKeys(Integer.toString(iTestErrorPlus));
    	CI_Objects_Accuracy_Test_Cop4.txt_test_error_plus(driver).sendKeys(Keys.ENTER);
    	{
			Log.info(sTestCaseName + " | Test Error % - plus tolerance field completed");
    	}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_test_error_minus(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_test_error_minus(driver).sendKeys(Integer.toString(iTestErrorMinus));
    	CI_Objects_Accuracy_Test_Cop4.txt_test_error_minus(driver).sendKeys(Keys.ENTER);
    	{
    	Log.info(sTestCaseName + " | Test Error %  - minus tolerance field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_test_set_error(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_test_set_error(driver).sendKeys(Integer.toString(iTestSetError));
    	CI_Objects_Accuracy_Test_Cop4.txt_test_set_error(driver).sendKeys(Keys.ENTER);
    	{
    	Log.info(sTestCaseName + " | Test Set Error % field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_plus(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_plus(driver).sendKeys(Integer.toString(iTestSetErrorPlus));
    	CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_plus(driver).sendKeys(Keys.ENTER);
    	{
    	Log.info(sTestCaseName + " | Test Set Error % - plus tolerance field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_minus(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_minus(driver).sendKeys(Integer.toString(iTestSetErrorMinus));
    	CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_minus(driver).sendKeys(Keys.ENTER);
    	{
    	Log.info(sTestCaseName + " | Test Set Error % - minus tolerance field completed");
		}
    
    	// *!*!*!*!*!*!* Need to include method to check the Meter Error %
    
    	CI_Objects_Accuracy_Test_Cop4.txt_ct_error(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_ct_error(driver).sendKeys(Integer.toString(iCtError));
    	CI_Objects_Accuracy_Test_Cop4.txt_ct_error(driver).sendKeys(Keys.ENTER);
    	{
    	Log.info(sTestCaseName + " | CT Error % field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_ct_error_plus(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_ct_error_plus(driver).sendKeys(Integer.toString(iCtErrorPlus));
    	CI_Objects_Accuracy_Test_Cop4.txt_ct_error_plus(driver).sendKeys(Keys.ENTER);
    	{
			Log.info(sTestCaseName + " | CT Error % field - plus tolerance completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_ct_error_minus(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_ct_error_minus(driver).sendKeys(Integer.toString(iCtErrorMinus));
    	CI_Objects_Accuracy_Test_Cop4.txt_ct_error_minus(driver).sendKeys(Keys.ENTER);
    	{
    	Log.info(sTestCaseName + " | CT Error %  - minus tolerance field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_vt_error(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_vt_error(driver).sendKeys(Integer.toString(iVtError));
    	CI_Objects_Accuracy_Test_Cop4.txt_vt_error(driver).sendKeys(Keys.ENTER);
    	{
    	Log.info(sTestCaseName + " | VT Error % field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_vt_error_plus(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_vt_error_plus(driver).sendKeys(Integer.toString(iVtErrorPlus));
    	CI_Objects_Accuracy_Test_Cop4.txt_vt_error_plus(driver).sendKeys(Keys.ENTER);
    	{
			Log.info(sTestCaseName + " | VT Error % - plus tolerance field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_vt_error_minus(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_vt_error_minus(driver).sendKeys(Integer.toString(iVtErrorMinus));
    	CI_Objects_Accuracy_Test_Cop4.txt_vt_error_minus(driver).sendKeys(Keys.ENTER);
    	{
			Log.info(sTestCaseName + " | VT Error % - minus tolerance field completed");
		}
    
    	/*    not sure if we should use the below method   *!*!*!*!*!*!*!*!*
     	*    - or if I could perform a check that the field has been correctly pre-populated as per business rules
     	*                                                 *!*!*!*!*!*!*!*!*
    
    	CI_Objects_Accuracy_Test_COP4.cbx_ok_fail(driver).click();
    	CI_Objects_Accuracy_Test_COP4.cbx_ok_fail(driver).sendKeys(sOkFail);
    	CI_Objects_Accuracy_Test_COP4.txt_vt_error_minus(driver).sendKeys(Keys.ENTER);
    	{
			Log.info(sTestCaseName + " | VT Error % field completed");
		}
    
     	*/
    
    	CI_Objects_Accuracy_Test_Cop4.txt_instrument_serial_num(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_instrument_serial_num(driver).sendKeys(sInstSerialNum);
    	{
			Log.info(sTestCaseName + " | Instrument Serial Number field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.btn_test_outcome_pass(driver).click();
    	{
    	Log.info(sTestCaseName + " | Test Outcome = Pass radio button selected");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_last_calibration_date(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_last_calibration_date(driver).sendKeys(sCalibDate);
    	{
    	Log.info(sTestCaseName + " | Last Calibration Date field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_date_of_test(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_date_of_test(driver).sendKeys(sTestDate);
    	{
			Log.info(sTestCaseName + " | Date of Test field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_finish_time(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_finish_time(driver).sendKeys(sFinishTime);
    	{
			Log.info(sTestCaseName + " | Finish Time field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_signature(driver).click();
    	{
			Log.info(sTestCaseName + " | Signature field clicked");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.txt_comments(driver).click();
    	CI_Objects_Accuracy_Test_Cop4.txt_finish_time(driver).sendKeys(sComments);
    	{
    	Log.info(sTestCaseName + " | Finish Time field completed");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.btn_save(driver).click();
    	{
    	Log.info(sTestCaseName + " | Save button clicked");
		}
    
    	CI_Objects_Accuracy_Test_Cop4.btn_completed(driver).click();
    	{
			Log.info(sTestCaseName + " | Completed button clicked");
		}
    
    // END OF ADD SUCCESS VALUES CUST LOAD WC 3PH METHOD    
	}	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesNotCustLoadLvHvPart1
	* Author: Charlotte Jones
	* Date: 15/08/2018
	* Purpose: This method adds the required responses in the Accuracy Test (COP4) section for a happy
	* 	path scenario where the test is NOT carried out using the customer's load - this means that there
	* 	is a call out to the Detailed Meter Readings task (type of test chosen as TYPE C)
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
	
	
	public static void addSuccessValuesNotCustLoadLvHvPart1(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		CI_Objects_Accuracy_Test_Cop4.btn_test_on_cust_load_n(driver).click();
	    {
			Log.info(sTestCaseName + " | Is test carried out using customer's load? - No radio button selected");
		}
	 
	// END OF ADD SUCCESS VALUE NOT CUST LOAD LV HV PART 1 METHOD     
	}    
	    
	
	/* **************************************************************************************************
	* Function: addSuccessValuesNotCustLoadLvHvPart2
	* Author: Charlotte Jones
	* Date: 15/08/2018
	* Purpose: This method adds the required responses in the Accuracy Test (COP4) section for a happy
	* 	path scenario where the test is NOT carried out using the customer's load - this means that there
	* 	is a call out to the Detailed Meter Readings task (type of test chosen as TYPE C)
	* Arguments:	sSerialNum
	* 				sStartTime
	* 				sErrorCalib
	* 				sType
	* 				sTestPoint
	* 				iTestError
	* 				iTestErrorPlus
	* 				iTestErrorMinus
	* 				iTestSetError
	* 				iTestSetErrorPlus
	* 				iTestSetErrorMinus
	* 				iCtError
	* 				iCtErrorPlus
	* 				iCtErrorMinus
	* 				iVtError
	* 				iVtErrorPlus
	* 				iVtErrorMinus
	* 				sOkFail
	* 				sInstSerialNum
	* 				sCalibDate
	* 				sTestDate
	* 				sFinishTime
	* 				sComments
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/		    
	    
	public static void addSuccessValuesNotCustLoadLvHvPart2(WebDriver driver, String sTestCaseName) throws Exception{
		
		// *!*!*!*!*!*!* Will need to provide values for the below variables *!*!*!*!*!*!* 
		
		String	sSerialNum =  "";
		String	sStartTime = "";
		String	sErrorCalib = "65.23";
		String	sType = "A";
		String	sTestPoint = "C";
		Integer	iTestError = 12;
		Integer	iTestErrorPlus = 5;
		Integer	iTestErrorMinus = 3;
		Integer	iTestSetError = 33;
		Integer	iTestSetErrorPlus = 1;
		Integer	iTestSetErrorMinus = 2;
		Integer	iCtError = 12;
		Integer	iCtErrorPlus = 6;
		Integer	iCtErrorMinus = 5;
		Integer	iVtError = 15;
		Integer	iVtErrorPlus = 1;
		Integer	iVtErrorMinus = 3;
	//	String	sOkFail = "o";
		String	sInstSerialNum = "";
		String	sCalibDate = "";
		String	sTestDate = "";
		String	sFinishTime= "";
		String	sComments = "comments";
		

	
	    CI_Objects_Accuracy_Test_Cop4.btn_test_type_c(driver).click();
	    {
			Log.info(sTestCaseName + " | Type of Test - TYPE C radio button selected");
		}
	    
	    // General information
	    
	    CI_Objects_Accuracy_Test_Cop4.cbx_serial_num(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.cbx_serial_num(driver).sendKeys(sSerialNum);
	    CI_Objects_Accuracy_Test_Cop4.cbx_serial_num(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Serial Number selected from dropdown menu");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_start_time(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_start_time(driver).sendKeys(sStartTime);
	    CI_Objects_Accuracy_Test_Cop4.txt_start_time(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Start Time field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_error_calibration(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_error_calibration(driver).sendKeys(sErrorCalib);
	    CI_Objects_Accuracy_Test_Cop4.txt_error_calibration(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Error Calibration field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.cbx_test_type_undertaken(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.cbx_test_type_undertaken(driver).sendKeys(sType);
	    CI_Objects_Accuracy_Test_Cop4.cbx_test_type_undertaken(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Type Undertaken - option selected from dropdown");
		}
	    
	    // Test sub-section
	    
	    CI_Objects_Accuracy_Test_Cop4.cbx_test_point(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.cbx_test_point(driver).sendKeys(sTestPoint);
	    CI_Objects_Accuracy_Test_Cop4.cbx_test_point(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Point field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error(driver).sendKeys(Integer.toString(iTestError));
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Error % field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error_plus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error_plus(driver).sendKeys(Integer.toString(iTestErrorPlus));
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error_plus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Error % - plus tolerance field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error_minus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error_minus(driver).sendKeys(Integer.toString(iTestErrorMinus));
	    CI_Objects_Accuracy_Test_Cop4.txt_test_error_minus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Error %  - minus tolerance field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error(driver).sendKeys(Integer.toString(iTestSetError));
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Set Error % field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_plus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_plus(driver).sendKeys(Integer.toString(iTestSetErrorPlus));
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_plus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Set Error % - plus tolerance field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_minus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_minus(driver).sendKeys(Integer.toString(iTestSetErrorMinus));
	    CI_Objects_Accuracy_Test_Cop4.txt_test_set_error_minus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | Test Set Error % - minus tolerance field completed");
		}
	    
	    // *!*!*!*!*!*!* Need to include method to check the Meter Error %
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error(driver).sendKeys(Integer.toString(iCtError));
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | CT Error % field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error_plus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error_plus(driver).sendKeys(Integer.toString(iCtErrorPlus));
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error_plus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | CT Error % field - plus tolerance completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error_minus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error_minus(driver).sendKeys(Integer.toString(iCtErrorMinus));
	    CI_Objects_Accuracy_Test_Cop4.txt_ct_error_minus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | CT Error %  - minus tolerance field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error(driver).sendKeys(Integer.toString(iVtError));
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | VT Error % field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error_plus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error_plus(driver).sendKeys(Integer.toString(iVtErrorPlus));
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error_plus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | VT Error % - plus tolerance field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error_minus(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error_minus(driver).sendKeys(Integer.toString(iVtErrorMinus));
	    CI_Objects_Accuracy_Test_Cop4.txt_vt_error_minus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | VT Error % - minus tolerance field completed");
		}
	    
	    /*    not sure if we should use the below method   *!*!*!*!*!*!*!*!*
	     *    - or if I could perform a check that the field has been correctly pre-populated as per business rules
	     *                                                 *!*!*!*!*!*!*!*!*
	    
	    CI_Objects_Accuracy_Test_COP4.cbx_ok_fail(driver).click();
	    CI_Objects_Accuracy_Test_COP4.cbx_ok_fail(driver).sendKeys(sOkFail);
	    CI_Objects_Accuracy_Test_COP4.txt_vt_error_minus(driver).sendKeys(Keys.ENTER);
	    {
			Log.info(sTestCaseName + " | VT Error % field completed");
		}
	    
	    */
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_instrument_serial_num(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_instrument_serial_num(driver).sendKeys(sInstSerialNum);
	    {
			Log.info(sTestCaseName + " | Instrument Serial Number field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.btn_test_outcome_pass(driver).click();
	    {
			Log.info(sTestCaseName + " | Test Outcome = Pass radio button selected");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_last_calibration_date(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_last_calibration_date(driver).sendKeys(sCalibDate);
	    {
			Log.info(sTestCaseName + " | Last Calibration Date field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_date_of_test(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_date_of_test(driver).sendKeys(sTestDate);
	    {
			Log.info(sTestCaseName + " | Date of Test field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_finish_time(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_finish_time(driver).sendKeys(sFinishTime);
	    {
			Log.info(sTestCaseName + " | Finish Time field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_signature(driver).click();
	    {
			Log.info(sTestCaseName + " | Signature field clicked");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.txt_comments(driver).click();
	    CI_Objects_Accuracy_Test_Cop4.txt_finish_time(driver).sendKeys(sComments);
	    {
			Log.info(sTestCaseName + " | Finish Time field completed");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.btn_save(driver).click();
	    {
			Log.info(sTestCaseName + " | Save button clicked");
		}
	    
	    CI_Objects_Accuracy_Test_Cop4.btn_completed(driver).click();
	    {
			Log.info(sTestCaseName + " | Completed button clicked");
		}
	    
	// END OF ADD SUCCESS VALUES NOT CUST LOAD LV HV PART 2 METHOD    
	}		
	
	
	

	
	
	
//END OF METHODS
}