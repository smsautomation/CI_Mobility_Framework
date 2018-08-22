package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Fault;
import utility.Log;

public class CI_Methods_Fault{
	
	
	
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
	* Function: addSuccessValuesAllNoFault
	* Author: Charlotte Jones
	* Date: 10/08/2018
	* Purpose: This method adds the required responses in the Fault section for a happy path scenario,
	* 	where no fault has been found - this is the same across all metering types
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
	
	
	public static void addSuccessValuesAllNoFault(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		// *!*!*!*!*!*!* Need values for below variables *!*!*!*!*!*!*
		
		String sTestDial = "FH TEST engineer";
		
		
		
		CI_Objects_Fault.btn_no_fault_found(driver).click();
	    {
			Log.info(sTestCaseName + " | No Fault Found checkbox ticked");
		}
	    
	    CI_Objects_Fault.txt_test_dial_completed_by(driver).click();
	    CI_Objects_Fault.txt_test_dial_completed_by(driver).sendKeys(sTestDial);
	    {
			Log.info(sTestCaseName + " | Test Dial Completed By (Name)? field completed");
		}
	  	
	   
	    
	// END OF ADD SUCCESS VALUES ALL NO FAULT METHOD    
	}	
			
		
	/* **************************************************************************************************
	* Function: addSuccessValuesAllFaultsPart1
	* Author: Charlotte Jones
	* Date: 10/08/2018
	* Purpose: This method adds the required responses in the Fault section in the scenario that all of
	* 	the workflow questions for this section are completed
	* 	This is part 1 - before a call is made out to Capture Non-Serialised Asset Information
	* 	(CI_Methods_Non_Serialised_Asset_Info)
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
	
	
	public static void addSuccessValuesAllFaultPart1(WebDriver driver, String sTestCaseName) throws Exception{
	
		
		// *!*!*!*!*!*!* Need values for below variables *!*!*!*!*!*!*
	
		String	sRemModSerialNumGsm = "";
		String	sNewModSerialNumGsm = "";
		String	sRemModSerialNumPstn = "";
		String	sNewModSerialNumPstn = "";
		Integer	iCommsNum = 1;
		String	sCustName = "Cust Name";
		Integer	iCustDetails = 123;
		String	sRemModSerialNumOther = "";
		String	sNewModSerialNumOther = "";
		String	sCommsNumOther = "";
		String	sSimSerialNum = "";
		String	sNetworkProv = "v";
		Integer	iCommsNumSim = 45612;
		Integer	iIpAddress = 123;			// this might need converting to a different type - depends if need to enter the full stops
		
		
		// *!*!*!*!*!*!* intro a method to verify that the meter serial numbers displayed here are as should be *!*!*!*!*!*!*
		
		CI_Objects_Fault.btn_fault_type_comms(driver).click();
	    {
			Log.info(sTestCaseName + " | Comms Fault Type checkbox ticked");
		}
	    
		CI_Objects_Fault.btn_fault_type_meter(driver).click();
	    {
			Log.info(sTestCaseName + " | Meter Fault Type checkbox ticked");
		}
	  	
		CI_Objects_Fault.btn_fault_type_dno_equip(driver).click();
	    {
			Log.info(sTestCaseName + " | DNO Equipment Fault Type checkbox ticked");
		}
	    
		CI_Objects_Fault.btn_fault_type_other(driver).click();
	    {
			Log.info(sTestCaseName + " | Other Fault Type checkbox ticked");
		}
	    
	    // Comms sub-section
	    // Replaced Assets sub-section
	    
		CI_Objects_Fault.btn_replaced_any_assets_y(driver).click();
	    {
			Log.info(sTestCaseName + " | Have you replaced any assets? - Yes radio button selected");
		}
	    
		CI_Objects_Fault.btn_asset_type_gsm(driver).click();
	    {
			Log.info(sTestCaseName + " | Type of Asset - GSM/GPRS Modem radio button selected");
		}
	    
		CI_Objects_Fault.btn_asset_type_pstn(driver).click();
	    {
			Log.info(sTestCaseName + " | Type of Asset - PSTN Modem radio button selected");
		}
	    
		CI_Objects_Fault.btn_asset_type_other_modem(driver).click();
	    {
			Log.info(sTestCaseName + " | Type of Asset - Other Modem radio button selected");
		}
	    
		CI_Objects_Fault.btn_asset_type_sim(driver).click();
	    {
			Log.info(sTestCaseName + " | Type of Asset - SIM radio button selected");
		}
	    
		CI_Objects_Fault.btn_asset_type_non_serialised(driver).click();
	    {
			Log.info(sTestCaseName + " | Type of Asset - Non Serialised Assets radio button selected");
		}
	    
	    // GSM/GPRS Modem
	    
		CI_Objects_Fault.MODEM_GSM_GPRS.txt_removed_modem_serial_num(driver).click();
		CI_Objects_Fault.MODEM_GSM_GPRS.txt_removed_modem_serial_num(driver).sendKeys(sRemModSerialNumGsm);
	    {
			Log.info(sTestCaseName + " | Removed Modem Serial Number field completed");
		}
	    
		CI_Objects_Fault.MODEM_GSM_GPRS.txt_new_modem_serial_num(driver).click();
		CI_Objects_Fault.MODEM_GSM_GPRS.txt_new_modem_serial_num(driver).sendKeys(sNewModSerialNumGsm);
	    {
			Log.info(sTestCaseName + " | New Modem Serial Number field completed");
		}
	    
	    // *!*!*!*!*!*!* add in method to check the baud rate drop down matches the required defaults *!*!*!*!*!*!*
	    
	    // PSTN
	    
		CI_Objects_Fault.MODEM_PSTN.txt_removed_modem_serial_num(driver).click();
		CI_Objects_Fault.MODEM_PSTN.txt_removed_modem_serial_num(driver).sendKeys(sRemModSerialNumPstn);
	    {
			Log.info(sTestCaseName + " | Removed Modem Serial Number field completed");
		}
	    
		CI_Objects_Fault.MODEM_PSTN.txt_new_modem_serial_num(driver).click();
		CI_Objects_Fault.MODEM_PSTN.txt_new_modem_serial_num(driver).sendKeys(sNewModSerialNumPstn);
	    {
			Log.info(sTestCaseName + " | New Modem Serial Number field completed");
		}
	    
		CI_Objects_Fault.MODEM_PSTN.btn_prev_modem_not_pstn(driver).click();
		{
			Log.info(sTestCaseName + " | Previous Modem NOT PSTN check box ticked");
		}
	    
		CI_Objects_Fault.MODEM_PSTN.btn_bt_line_available(driver).click();
		{
			Log.info(sTestCaseName + " | BT Line Available? check box ticked");
		}
		
		// *!*!*!*!*!*!* Add in methods to verify that the checkboxes Remember BT Sticker and Customer Advised BT
		//		Will Be Attending To Fit A Line are displayed *!*!*!*!*!*!*
		
		CI_Objects_Fault.MODEM_PSTN.btn_comms_available(driver).click();
		{
			Log.info(sTestCaseName + " | BT Line Available? check box ticked");
		}
		
		// *!*!*!*!*!*!* Would be good if could write a method to check the above mentioned fields are now not displayed *!*!*!*!*!*!*
	    
		CI_Objects_Fault.MODEM_PSTN.txt_comms_num(driver).click();
		CI_Objects_Fault.MODEM_PSTN.txt_comms_num(driver).sendKeys(Integer.toString(iCommsNum));
		{
			Log.info(sTestCaseName + " | Comms Number field completed");
		}
		
		CI_Objects_Fault.MODEM_PSTN.txt_cust_name(driver).click();
		CI_Objects_Fault.MODEM_PSTN.txt_cust_name(driver).sendKeys(sCustName);
		{
			Log.info(sTestCaseName + " | Customer Name field completed");
		}
		
		CI_Objects_Fault.MODEM_PSTN.txt_cust_contact_details(driver).click();
		CI_Objects_Fault.MODEM_PSTN.txt_cust_contact_details(driver).sendKeys(Integer.toString(iCustDetails));
		{
			Log.info(sTestCaseName + " | Customer Contact Details field completed");
		}
		
		// Other Modem sub-section
		
		CI_Objects_Fault.MODEM_OTHER.txt_removed_modem_serial_num(driver).click();
		CI_Objects_Fault.MODEM_OTHER.txt_removed_modem_serial_num(driver).sendKeys(sRemModSerialNumOther);
	    {
			Log.info(sTestCaseName + " | Removed Modem Serial Number field completed");
		}
	    
		CI_Objects_Fault.MODEM_OTHER.txt_new_modem_serial_num(driver).click();
		CI_Objects_Fault.MODEM_OTHER.txt_new_modem_serial_num(driver).sendKeys(sNewModSerialNumOther);
	    {
			Log.info(sTestCaseName + " | New Modem Serial Number field completed");
		}
		
		CI_Objects_Fault.MODEM_OTHER.txt_comms_num(driver).click();
		CI_Objects_Fault.MODEM_OTHER.txt_comms_num(driver).sendKeys(sCommsNumOther);
		{
			Log.info(sTestCaseName + " | Comms Number field completed");
		}
		
		// SIM sub-section
		
		CI_Objects_Fault.SIM.txt_sim_serial_num(driver).click();
		CI_Objects_Fault.SIM.txt_sim_serial_num(driver).sendKeys(sSimSerialNum);
		{
			Log.info(sTestCaseName + " | SIM Serial Number field completed");
		}
		
		CI_Objects_Fault.SIM.cbx_network_provider(driver).click();
		CI_Objects_Fault.SIM.cbx_network_provider(driver).sendKeys(sNetworkProv);
		CI_Objects_Fault.SIM.cbx_network_provider(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Selection made from Network Provider dropdown");
		}
		
		CI_Objects_Fault.SIM.txt_comms_num(driver).click();
		CI_Objects_Fault.SIM.txt_comms_num(driver).sendKeys(Integer.toString(iCommsNumSim));
		{
			Log.info(sTestCaseName + " | Comms Number field completed");
		}
		
		CI_Objects_Fault.SIM.txt_ip_address(driver).click();
		CI_Objects_Fault.SIM.txt_ip_address(driver).sendKeys(Integer.toString(iIpAddress));
		{
			Log.info(sTestCaseName + " | Comms Number field completed");
		}
		
	// END OF ADD SUCCESS VALUES ALL FAULTS PART 1 METHOD    
	}
	
	// The Capture Non_Serialised Asset Information task is called now, then come back into the below method
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesAllFaultsPart2MeterExch
	* Author: Charlotte Jones
	* Date: 10/08/2018
	* Purpose: This method adds the required responses in the Fault section in the scenario that all of
	* 	the workflow questions for this section are completed
	* 	This is part 2 - continuing on after the call is made out to Capture Non-Serialised Asset Information
	* 	(CI_Methods_Non_Serialised_Asset_Info)
	* 	It is selected that a meter exchange can be performed - this results in further tasks being called
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
		
	public static void addSuccessValuesAllFaultPart2MeterExch(WebDriver driver, String sTestCaseName) throws Exception{
		
		// Meter sub-section
		
		CI_Objects_Fault.btn_can_meter_exch_y(driver).click();
	    {
			Log.info(sTestCaseName + " | Can the Meter Exchange be Completed Now? - Yes radio button selected");
		}	
	
	    
	// END OF ADD SUCCESS VALUES ALL FAULTS PART 2 METER EXCH METHOD    
	}
		
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesAllFaultsPart2NoMeterExch
	* Author: Charlotte Jones
	* Date: 10/08/2018
	* Purpose: This method adds the required responses in the Fault section in the scenario that all of
	* 	the workflow questions for this section are completed
	* 	This is part 2 - continuing on after the call is made out to Capture Non-Serialised Asset Information
	* 	(CI_Methods_Non_Serialised_Asset_Info)
	* 	It is selected that no meter exchange can be performed - we then need to carry on into Part 3
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
		
	public static void addSuccessValuesAllFaultPart2NoMeterExch(WebDriver driver, String sTestCaseName) throws Exception{	
		
		// Meter sub-section
		
		CI_Objects_Fault.btn_can_meter_exch_n(driver).click();
	    {
			Log.info(sTestCaseName + " | Can the Meter Exchange be Completed Now? - No radio button selected");
		}	
	
	    
	// END OF ADD SUCCESS VALUES ALL FAULTS PART 2 NO METER EXCH METHOD    
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesAllFaultsPart3
	* Author: Charlotte Jones
	* Date: 10/08/2018
	* Purpose: This method adds the required responses in the Fault section in the scenario that all of
	* 	the workflow questions for this section are completed
	* 	This is part 3 - continuing on after the meter exchange question (whether or not the meter
	* 	exchange was carried out)
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
		
	public static void addSuccessValuesAllFaultPart3(WebDriver driver, String sTestCaseName) throws Exception{	
		
		 // *!*!*!*!*!*!* need values for below variables *!*!*!*!*!*!*
		
		String	sDnoFaultWork = "";
		String	sOtherFaultNotes = "";
		
		// DNO Equipment sub-section
		
		CI_Objects_Fault.txt_dno_fault_work(driver).click();
		CI_Objects_Fault.txt_dno_fault_work(driver).sendKeys(sDnoFaultWork);
	    {
			Log.info(sTestCaseName + " | DNO Fault Work Carried Out field completed");
		}	
	
	    
	    // Other Fault sub-section
	    
		CI_Objects_Fault.txt_other_fault(driver).click();
		CI_Objects_Fault.txt_other_fault(driver).sendKeys(sOtherFaultNotes);
	    {
			Log.info(sTestCaseName + " | Other Fault Notes field completed");
		}
	    
	    
	    // Fault Resolution
	    
		CI_Objects_Fault.btn_is_fault_fixed_y(driver).click();
	    {
			Log.info(sTestCaseName + " | Is the Fault Fixed? - Yes radio button selected");
		}
	    
	    
	// END OF ADD SUCCESS VALUES ALL FAULTS PART 3 METHOD    
	}	
	
//END OF METHODS
}