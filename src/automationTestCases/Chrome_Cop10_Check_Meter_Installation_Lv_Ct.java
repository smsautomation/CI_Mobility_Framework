/* *******************************************************************
* Test Case Name: Chrome_Cop10_Check_Meter_Installation_Lv_Ct
* Author: Charlotte Jones
* Date: 15/08/2018
* Purpose: This test carries out the C&I Mobility workflow in the
* 	Chrome browser for a COP10 check meter installation job where the
* 	metering supply type is LV CT
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



public class Chrome_Cop10_Check_Meter_Installation_Lv_Ct {

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
		CI_Methods_Ci_Pre_Task.addSuccessValuesCop10LvCt(driver, sTestCaseName);
		
		// Invoke method to complete Carry Out Electricity Risk Assessment section
		CI_Methods_Elec_Risk_Assessment.addSuccessValuesAll(driver, sTestCaseName);

		// Invoke method to complete Initial Phase Rotation Test section
		CI_Methods_Initial_Phase_Rotation_Test.addSuccessValuesNonDnoBno(driver, sTestCaseName);
		
		// Invoke method to complete the Terminal Test Block Tests section 
		CI_Methods_Test_Block_Tests.addSuccessValuesNonDnoBno(driver, sTestCaseName);
		
		// Invoke method to complete Display Meter Details section
		
		
		// Invoke method to complete the Detailed Meter Readings section
		
		
		// Invoke method to complete the Check Meter Installation section
		CI_Methods_Check_Meter_Install.addSuccessValuesAllPart1(driver, sTestCaseName);
		
		// Invoke method to complete the Detailed Meter Readings section
		
		
		// Invoke method to complete the Phase Rotation section
		CI_Methods_Phase_Rotation_Test.addSuccessValuesAll(driver, sTestCaseName);
		
		// Invoke method to complete the Check Meter Installation section
		CI_Methods_Check_Meter_Install.addSuccessValuesAllPart2(driver, sTestCaseName);
	
		// Invoke method to complete the final section: Complete Job
		CI_Methods_Complete_Job.addSuccessValuesAll(driver, sTestCaseName);
		
		
	}

		
																												
		
	
	//Log out
	@AfterMethod
	public void afterMethod() {
	
	    driver.quit();
	    
	    Log.endTestCase(sTestCaseName);        
	
	}
}

