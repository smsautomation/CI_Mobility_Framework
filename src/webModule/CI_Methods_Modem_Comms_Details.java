package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Modem_Comms_Details;
import utility.Log;

public class CI_Methods_Modem_Comms_Details{
	
	
	
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
	* Function: addSuccessValuesGsmModem
	* Author: Charlotte Jones
	* Date: 07/08/2018
	* Purpose: This method adds the required responses in the Modem/Comms Details section for a happy
	* path scenario - following the conditional fields through the scenario where a GSM/GPRS modem is used
	* Arguments:		sRemModemSerialNo
	* 					sModemTypeG
	* 					sModemSerialNo
	* 					sSimSerialNo
	* 					sCommsNo
	* 					iIpAddress
	* 					iModemBaudRate
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	
	
	public static void addSuccessValuesGsmModem(WebDriver driver, String sTestCaseName) throws Exception{
	
		// *!*!*!*!*!*!*!* Need to add values to the below variables *!*!*!*!*!*!*!*
		
		String 	sRemModemSerialNum = "";
		String	sModemType = "G";
		String  sModemSerialNum = "";
		String	sSimSerialNum = "";
		String 	sCommsNum = "";
		String	sIpAddress = "1.161.11.241";
		Integer iModemBaudRate = 1;
		
		//Removed Modem/Comms Details sub-section
		
		CI_Objects_Modem_Comms_Details.btn_old_modem_removed_y(driver).click();
		{
			Log.info(sTestCaseName + " | Has the old modem been removed? - Yes radio button selected");
		}
	            
		CI_Objects_Modem_Comms_Details.txt_removed_modem_serial_num(driver).click();
		CI_Objects_Modem_Comms_Details.txt_removed_modem_serial_num(driver).sendKeys(sRemModemSerialNum);
		{
			Log.info(sTestCaseName + " | Removed Modem Serial Number field completed");
		}
		
	   // Installed Modem/Comms Details sub-section
		
		CI_Objects_Modem_Comms_Details.cbx_type_of_modem(driver).click();
		CI_Objects_Modem_Comms_Details.cbx_type_of_modem(driver).sendKeys(sModemType);
		CI_Objects_Modem_Comms_Details.cbx_type_of_modem(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Type of Modem field completed");
		}
		
		// GSM/GPRS sub-section
	    
		CI_Objects_Modem_Comms_Details.GSM_GPRS.txt_modem_serial_num(driver).click();
		CI_Objects_Modem_Comms_Details.GSM_GPRS.txt_modem_serial_num(driver).sendKeys(sModemSerialNum);
		{
			Log.info(sTestCaseName + " | GSM/GPRS Modem Serial Number field completed");
		}
		
		CI_Objects_Modem_Comms_Details.GSM_GPRS.txt_sim_serial_num(driver).click();
		CI_Objects_Modem_Comms_Details.GSM_GPRS.txt_sim_serial_num(driver).sendKeys(sSimSerialNum);
		{
			Log.info(sTestCaseName + " | GSM/GPRS SIM Serial Number field completed");
		}
		
		CI_Objects_Modem_Comms_Details.GSM_GPRS.txt_comms_num(driver).click();
		CI_Objects_Modem_Comms_Details.GSM_GPRS.txt_comms_num(driver).sendKeys(sCommsNum);
		{
			Log.info(sTestCaseName + " | GSM/GPRS SIM Serial Number field completed");
		}
		
		CI_Objects_Modem_Comms_Details.GSM_GPRS.txt_ip_address(driver).click();
		CI_Objects_Modem_Comms_Details.GSM_GPRS.txt_ip_address(driver).sendKeys(sIpAddress);
		{
			Log.info(sTestCaseName + " | GSM/GPRS SIM Serial Number field completed");
		}
		
		CI_Objects_Modem_Comms_Details.GSM_GPRS.cbx_modem_baud_rate(driver).click();
		CI_Objects_Modem_Comms_Details.GSM_GPRS.cbx_modem_baud_rate(driver).sendKeys(Integer.toString(iModemBaudRate));
		{
			Log.info(sTestCaseName + " | GSM/GPRS SIM Serial Number field completed");
		}
		
		CI_Objects_Modem_Comms_Details.GSM_GPRS.cbx_modem_baud_rate(driver).click();
		CI_Objects_Modem_Comms_Details.GSM_GPRS.cbx_modem_baud_rate(driver).sendKeys(Integer.toString(iModemBaudRate));
		{
			Log.info(sTestCaseName + " | GSM/GPRS SIM Serial Number field completed");
		}
		
		
	}	
	
	// END OF ADD SUCCESS VALUES GSM
			
	/* **************************************************************************************************
	* Function: addSuccessValuesPstnModem
	* Author: Charlotte Jones
	* Date: 07/08/2018
	* Purpose: This method adds the required responses in the Modem/Comms Details section for a happy
	* path scenario - following the conditional fields through the scenario where a PSTN modem is used
	* Arguments:		sRemModemSerialNum
	* 					sModemType
	* 					sModemSerialNum
	* 					sCommsNum
	* 					sCustName
	* 					sCustDetails
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
	
	
	
	public static void addSuccessValuesPstnModem(WebDriver driver, String sTestCaseName) throws Exception{
		
		// *!*!*!*!*!*!*!* Need to add values to the below variables *!*!*!*!*!*!*!*
		
		String 	sRemModemSerialNum = "";
		String	sModemType = "PS";
		String  sModemSerialNum = "";
		String 	sCommsNum = "";
		String 	sCustName = "Customer Name";
		String 	sCustDetails = "";
		
		
		//Removed Modem/Comms Details sub-section
		
		CI_Objects_Modem_Comms_Details.btn_old_modem_removed_y(driver).click();
		{
			Log.info(sTestCaseName + " | Has the old modem been removed? - Yes radio button selected");
		}
	            
		CI_Objects_Modem_Comms_Details.txt_removed_modem_serial_num(driver).click();
		CI_Objects_Modem_Comms_Details.txt_removed_modem_serial_num(driver).sendKeys(sRemModemSerialNum);
		{
			Log.info(sTestCaseName + " | Removed Modem Serial Number field completed");
		}
		
	   // Installed Modem/Comms Details sub-section
		
		CI_Objects_Modem_Comms_Details.cbx_type_of_modem(driver).click();
		CI_Objects_Modem_Comms_Details.cbx_type_of_modem(driver).sendKeys(sModemType);
		CI_Objects_Modem_Comms_Details.cbx_type_of_modem(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Type of Modem field completed");
		}
		
		// PSTN sub-section
	    
		CI_Objects_Modem_Comms_Details.PSTN.txt_modem_serial_num(driver).click();
		CI_Objects_Modem_Comms_Details.PSTN.txt_modem_serial_num(driver).sendKeys(sModemSerialNum);
		{
			Log.info(sTestCaseName + " | PSTN - Modem Serial Number field completed");
		}
		
		CI_Objects_Modem_Comms_Details.PSTN.btn_bt_line_available(driver).click();
		{
			Log.info(sTestCaseName + " | PSTN - BT Line Avaiable? field completed");
		}
		
		CI_Objects_Modem_Comms_Details.PSTN.btn_comms_available(driver).click();
		{
			Log.info(sTestCaseName + " | PSTN - Comms Avaiable? field completed");
		}
		
		CI_Objects_Modem_Comms_Details.PSTN.txt_comms_num(driver).click();
		CI_Objects_Modem_Comms_Details.PSTN.txt_comms_num(driver).sendKeys(sCommsNum);
		CI_Objects_Modem_Comms_Details.PSTN.txt_comms_num(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | PSTN - Comms Number field completed");
		}
		
		// Remember BT Sticker Alert - don't think this will require any clicking...
		
		CI_Objects_Modem_Comms_Details.PSTN.btn_cust_advised_bt_line(driver).click();
		{
			Log.info(sTestCaseName + " | PSTN - Customer advised BT will be attending to fit a line? checkbox ticked");
		}
		
		CI_Objects_Modem_Comms_Details.PSTN.txt_cust_name(driver).click();
		CI_Objects_Modem_Comms_Details.PSTN.txt_cust_name(driver).sendKeys(sCustName);
		{
			Log.info(sTestCaseName + " | PSTN - Customer Name field completed");
		}
		
		CI_Objects_Modem_Comms_Details.PSTN.txt_cust_contact_details(driver).click();
		CI_Objects_Modem_Comms_Details.PSTN.txt_cust_contact_details(driver).sendKeys(sCustDetails);
		{
			Log.info(sTestCaseName + " | PSTN - Customer Name field completed");
		}
		
		
	}	
		
	// END OF ADD SUCCESS VALUES PSTN
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesPaknetModem
	* Author: Charlotte Jones
	* Date: 07/08/2018
	* Purpose: This method adds the required responses in the Modem/Comms Details section for a happy
	* path scenario - following the conditional fields through the scenario where a Paknet modem is used
	* Arguments:		sRemModemSerialNo
	* 					sModemTypeG
	* 					sModemSerialNo
	* 					sSimSerialNo
	* 					sCommsNo
	* 					iIpAddress
	* 					iModemBaudRate
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/
	
	public static void addSuccessValuesPaknetModem(WebDriver driver, String sTestCaseName) throws Exception{
		
		// *!*!*!*!*!*!*!* Need to add values to the below variables *!*!*!*!*!*!*!*
		
		String 	sRemModemSerialNum = "";
		String	sModemType = "PS";
		String	sPadSerialNum = "";
		String 	sCommsNum = "";
		
		
		//Removed Modem/Comms Details sub-section
		
		CI_Objects_Modem_Comms_Details.btn_old_modem_removed_y(driver).click();
		{
			Log.info(sTestCaseName + " | Has the old modem been removed? - Yes radio button selected");
		}
	            
		CI_Objects_Modem_Comms_Details.txt_removed_modem_serial_num(driver).click();
		CI_Objects_Modem_Comms_Details.txt_removed_modem_serial_num(driver).sendKeys(sRemModemSerialNum);
		{
			Log.info(sTestCaseName + " | Removed Modem Serial Number field completed");
		}
		
	   // Installed Modem/Comms Details sub-section
		
		CI_Objects_Modem_Comms_Details.cbx_type_of_modem(driver).click();
		CI_Objects_Modem_Comms_Details.cbx_type_of_modem(driver).sendKeys(sModemType);
		CI_Objects_Modem_Comms_Details.cbx_type_of_modem(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Type of Modem field completed");
		}
		
		// Paknet sub-section		
		
		CI_Objects_Modem_Comms_Details.PAKNET.txt_pad_serial_num(driver).click();
		CI_Objects_Modem_Comms_Details.PAKNET.txt_pad_serial_num(driver).sendKeys(sPadSerialNum);
		{
			Log.info(sTestCaseName + " | Paknet - PAD Serial Number field completed");
		}
		
		CI_Objects_Modem_Comms_Details.PAKNET.txt_comms_num(driver).click();
		CI_Objects_Modem_Comms_Details.PAKNET.txt_comms_num(driver).sendKeys(sCommsNum);
		{
			Log.info(sTestCaseName + " | Paknet - Comms Number field completed");
		}
		
		
		
	}
	
	
	// END OF ADD SUCCESS VALUES PAKNET
	
	
	
	/* **************************************************************************************************
	* Function: addSuccessValuesOtherModem
	* Author: Charlotte Jones
	* Date: 07/08/2018
	* Purpose: This method adds the required responses in the Modem/Comms Details section for a happy path
	* scenario - following the conditional fields through the scenario where an Other modem type is used
	* Arguments:		sRemModemSerialNum
	* 					sModemType
	* 					sModemSerialNum
	* 					sCommsNum					
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
	
	public static void addSuccessValuesOtherModem(WebDriver driver, String sTestCaseName) throws Exception{
		
		
		// *!*!*!*!*!*!*!* Need to add values to the below variables *!*!*!*!*!*!*!*
		
		String 	sRemModemSerialNum = "";
		String	sModemType = "PS";
		String 	sModemSerialNum = "";
		String 	sCommsNum = "";
		
		
		//Removed Modem/Comms Details sub-section
		
		CI_Objects_Modem_Comms_Details.btn_old_modem_removed_y(driver).click();
		{
			Log.info(sTestCaseName + " | Has the old modem been removed? - Yes radio button selected");
		}
	            
		CI_Objects_Modem_Comms_Details.txt_removed_modem_serial_num(driver).click();
		CI_Objects_Modem_Comms_Details.txt_removed_modem_serial_num(driver).sendKeys(sRemModemSerialNum);
		{
			Log.info(sTestCaseName + " | Removed Modem Serial Number field completed");
		}
		
	   // Installed Modem/Comms Details sub-section
		
		CI_Objects_Modem_Comms_Details.cbx_type_of_modem(driver).click();
		CI_Objects_Modem_Comms_Details.cbx_type_of_modem(driver).sendKeys(sModemType);
		CI_Objects_Modem_Comms_Details.cbx_type_of_modem(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | Type of Modem field completed");
		}
						
		// Other sub-section
		
		CI_Objects_Modem_Comms_Details.OTHER.txt_modem_serial_num(driver).click();
		CI_Objects_Modem_Comms_Details.OTHER.txt_modem_serial_num(driver).sendKeys(sModemSerialNum);
		{
			Log.info(sTestCaseName + " | Other - Modem Serial Number field completed");
		}
		
		CI_Objects_Modem_Comms_Details.OTHER.txt_comms_num(driver).click();
		CI_Objects_Modem_Comms_Details.OTHER.txt_comms_num(driver).sendKeys(sCommsNum);
		{
			Log.info(sTestCaseName + " | Other - Comms Number(s) field completed");
		}
		
			
		
	}
	
	// END OF ADD SUCCESS VALUES OTHER
	
	
//END OF METHODS
}