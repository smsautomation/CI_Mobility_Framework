/* *******************************************************************
* Test Case Name: Chrome_Sub100_Meter_Fault_Wc_1ph
* Author: Charlotte Jones
* Date: 15/08/2018
* Purpose: This test carries out the C&I Mobility workflow in the
* 	Chrome browser for a Sub100 meter fault job where the metering
* 	supply type is WC 1PH
*
**********************************************************************
* Change Log:
* 
* Date:
* Author: 
* Details:
*
*********************************************************************/

package automationTestCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//Add for Grid session
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utility.*;
import webModule.*;
import pageObjectRepositories.Objects_Login_Page;



public class Chrome_Sub100_Meter_Fault_Wc_1ph_Exch {

	//Declare our test variables
	public WebDriver driver;
	//Add for Grid session
	//public RemoteWebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	
	//Get data and open the browser
	@BeforeMethod
	public void beforeMethod() throws Exception {
	
		DOMConfigurator.configure("log4j.xml");
	
	    sTestCaseName = this.toString();
	
	    sTestCaseName = Utils.getTestCaseName(this.toString());
	
	    Log.startTestCase(sTestCaseName);
	
	    ExcelUtils.setExcelFile(Constant.Path_TestData + "CI_Mobility_Automation_Test_Data" + ".xlsm","Data");
		
	    iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_Test_Case_Name);
	
	    driver = Utils.openBrowser(iTestCaseRow);
	    //Add for Grid session
	    //driver = (RemoteWebDriver) Utils.openGridBrowser(iTestCaseRow);
	    
	    //Verify that we are on the correct page
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    Objects_Login_Page.btn_Login(driver).isDisplayed();
	    Log.info("Login button displayed");
		
	}
	
	//Run the test
	@Test
	public void main() throws Exception {
			
		//	*!*!*!*!*!*!*!* Need to look into this section *!*!*!*!*!*!*!*
		// ************************************************************************
		
		CI_Methods_Login.viewPage(driver, sTestCaseName);
		System.out.println("login page reached");
		
		CI_Methods_Login.addSuccessValues(driver, sTestCaseName);
		System.out.println("logged in");
		
		// Methods_Appointments_List.viewPage(driver, sTestCaseName);
		
		//Select the correct appointment
		driver.findElement(By.xpath(".//*[@id='app']/div/div/workorderlistitem{7]/div/div[1]/div/div[1]/span[3]/span")).click();
		//driver.findElement(By.xpath("//*[contains(text(), ' Charlotte116')]")).click();
		System.out.println("selected job");
		
		//Verify that we are on the Appointment Details page
		//Objects_Appointment_Details_Page.btn_Call_Forward(driver).isDisplayed();
		//Log.info("Appointment Details page displayed as expected");	
		
		//Methods_Appointment_Details.viewPage(driver, sTestCaseName);
		
		//Verify correct Customer Details displayed
		//Objects_Appointment_Details_Page.lnk_Customer_Details(driver).click();
		//Methods_Appointment_Details.viewCustomerDetails(driver, sTestCaseName, 6);
				
		//Verify correct Job Details displayed
		//Objects_Appointment_Details_Page.lnk_Job_Details(driver).click();
		//Methods_Appointment_Details.viewJobDetails(driver, sTestCaseName, 6);
				
		//Verify correct Meter Details displayed
		//Objects_Appointment_Details_Page.lnk_Meter_Details(driver).click();
		//Methods_Appointment_Details.viewMeterDetails(driver, sTestCaseName, 6);
		
		// *****************************************************************************
		
				
		// Invoke method to complete Call Forward and Doorstep Protocol sections
		CI_Methods_Call_Forward.addSuccessValues(driver, sTestCaseName);
		System.out.println("call forward complete");
		CI_Methods_Doorstep_Protocol.addSuccessValues(driver, sTestCaseName);
		System.out.println("doorstep protocol complete");
						
		// Invoke method to complete a successful initial risk assessment (check for smell of gas)
		CI_Methods_Init_Risk_Assess.addSuccessValues(driver, sTestCaseName);
						
		// Invoke method to complete C&I Pre Task section
		CI_Methods_Ci_Pre_Task.addSuccessValuesSub100Wc1ph(driver, sTestCaseName);
		
		// Invoke method to complete the Carry Out Network Signal Strength section
		CI_Methods_Network_Signal_Strength_Test.addSuccessValuesAll(driver, sTestCaseName);
		
		// Invoke method to complete Carry Out Electricity Risk Assessment section
		CI_Methods_Elec_Risk_Assessment.addSuccessValuesAll(driver, sTestCaseName);
		
		// Invoke method to complete Pre Task - Determine if Customer Needs To Isolate Sensitive Equipment section
		CI_Methods_Pre_Task_Isolate_Sensitive_Equipment.addSuccessValuesAllNa(driver, sTestCaseName);
		
		// Invoke method to complete Initial Polarity Check - Martindale Test section
		CI_Methods_Initial_Polarity_Check_Martindale.addSuccessValuesAll(driver, sTestCaseName);
	
		
		// Invoke method to complete the Initial Polarity Check section 
		
		
		// Invoke method to complete Display Meter Details section
		
		
		// Invoke method to complete Detailed Meter Readings section
		
		
		// Invoke method to complete the Fault section
		CI_Methods_Fault.addSuccessValuesAllFaultPart1(driver, sTestCaseName);
		Log.info("Fault part 1 section completed");
		
		// Invoke method to complete the Non-Serialised Asset Information section
		
		
		// Invoke method to complete the Fault section
		CI_Methods_Fault.addSuccessValuesAllFaultPart2MeterExch(driver, sTestCaseName);
		Log.info("Fault (part 2 - meter exch) section completed");
		
		// Invoke method to complete the Remove Meter Final Reading section
		
		
		// Invoke method to complete Remove Asset section
		CI_Methods_Remove_Asset.addSuccessValuesAll(driver, sTestCaseName);
		Log.info("Remove Asset section completed");
		
		// Invoke method to complete New Meter section
		CI_Methods_New_Meter_Details.addSuccessValuesSub100Sm(driver, sTestCaseName);
		Log.info("New Meter section completed");
		
		// Invoke method to complete Polarity Check At the Meter section
		CI_Methods_Polarity_Check_At_Meter.addSuccessValuesAll(driver, sTestCaseName);
		Log.info("Polarity Check At Meter section completed");
		
		// Invoke method to complete Polarity Check Martindale section
		CI_Methods_Polarity_Check_Martindale.addSuccessValuesAll(driver, sTestCaseName);
		Log.info("Polarity Check - Martindale section completed");
		
		// Invoke method to complete Detailed Meter Readings section
		
		
		// Invoke method to complete Modem Comms section
		CI_Methods_Modem_Comms_Details.addSuccessValuesAllGsmModem(driver, sTestCaseName);
		Log.info("Modem Comms Details section completed");
		
		//Invoke method to complete Non-Serialised Asset Information section
		CI_Methods_Non_Serialised_Asset_Info.addSuccessValuesAllAerial(driver, sTestCaseName);
		Log.info("Non-Serialised Asset Info section completed");
		
		// Invoke method to complete Post Installation Checks (For Whole Current 1PH/3PH Metering)
		CI_Methods_Post_Install_Checks_Wc.addSuccessValues1ph(driver, sTestCaseName);
		Log.info("Post Installation Checks (WC) section completed");
		
		// Invoke method to complete the Fault section
		CI_Methods_Fault.addSuccessValuesAllFaultPart3(driver, sTestCaseName);
		Log.info("Fault (part 3) section completed");
		
		// Invoke method to complete the final section: Complete Job
		CI_Methods_Complete_Job.addSuccessValuesAll(driver, sTestCaseName);
		Log.info("Job Completion section completed");
		
		
	}

		
																												
		
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

