package webModule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjectRepositories.CI_Objects_Vt_Ct_Info_Dno_Bno;
import utility.Log;

public class CI_Methods_Vt_Ct_Info_Dno_Bno{
	
	
	
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
	* Function: addSuccessValuesAllNonCop2Hv
	* Author: Charlotte Jones
	* Date: 06/08/2018
	* Purpose: This method adds the required responses in the VT/CT Information for DNO/BNO and
	* Additional Equipment section for a happy path scenario
	* Arguments: 	sCtVtSerialNo
	* 				sCtRatio
	* 				sCtSerialNo1
	* 				sCtSerialNo2
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValuesAllNonCop2Hv(WebDriver driver, String sTestCaseName) throws Exception{
	
	
		// *!*!*!*!*!*!*
		
		String 	sCtRatio = "";
		String	sCtSerialNum1 = "";
		String 	sCtSerialNum2 = "";
		String 	sCtSerialNum3 = "";
		String 	sCtClass = "Class B";
		String 	sCtBurden = "2";
		Integer iVtRatio = 6;
		String 	sVtSerialNum1 = "";
		String 	sVtSerialNum2 = "";
		String 	sVtSerialNum3 = "";
		String 	sVtClass = "";
		Integer	iVtBurden = 2;
		
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.btn_ct_info_available(driver).click();
		{
			Log.info(sTestCaseName + " | CT/VT Information Accesible? CT Available clicked");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_ratio(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_ratio(driver).sendKeys(sCtRatio);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_ratio(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Ratio completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_1(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_1(driver).sendKeys(sCtSerialNum1);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_1(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Serial Num (1) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_2(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_2(driver).sendKeys(sCtSerialNum2);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_2(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Serial Num (2) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_3(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_3(driver).sendKeys(sCtSerialNum3);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_3(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Serial Num (3) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_class(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_class(driver).sendKeys(sCtClass);
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_class(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Class completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_burden_in_va(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_burden_in_va(driver).sendKeys(sCtBurden);
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_burden_in_va(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Burden in VA completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.btn_vt_info_available(driver).click();
		{
			Log.info(sTestCaseName + " | CT/VT Information Accesible? VT Available clicked");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_vt_ratio(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_vt_ratio(driver).sendKeys(Integer.toString(iVtRatio));
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_vt_ratio(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | VT Ratio completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_1(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_1(driver).sendKeys(sVtSerialNum1);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_1(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | VT Serial Num (1) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_2(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_2(driver).sendKeys(sVtSerialNum2);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_2(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | VT Serial Num (2) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_3(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_3(driver).sendKeys(sVtSerialNum3);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_3(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | VT Serial Num (3) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_vt_class(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_vt_class(driver).sendKeys(sVtClass);
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_vt_class(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | VT Class completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_burden_in_va(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_burden_in_va(driver).sendKeys(Integer.toString(iVtBurden));
		{
			Log.info(sTestCaseName + " | VT Burden in VA completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button clicked");
		}
				
	// END OF ADD SUCCESS VALUES ALL NON COP2 HV METHOD
	}

	/* **************************************************************************************************
	* Function: addSuccessValuesAllLv
	* Author: Charlotte Jones
	* Date: 06/08/2018
	* Purpose: This method adds the required responses in the VT/CT Information for DNO/BNO and
	* Additional Equipment section for a happy path scenario
	* Arguments: 	sCtVtSerialNo
	* 				sCtRatio
	* 				sCtSerialNo1
	* 				sCtSerialNo2
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValuesAllLv(WebDriver driver, String sTestCaseName) throws Exception{
	
	
		// *!*!*!*!*!*!*
		
		String 	sCtRatio = "";
		String	sCtSerialNum1 = "";
		String 	sCtSerialNum2 = "";
		String 	sCtSerialNum3 = "";
		String 	sCtClass = "Class B";
		String 	sCtBurden = "2";

		
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.btn_ct_info_available(driver).click();
		{
			Log.info(sTestCaseName + " | CT/VT Information Accesible? CT Available clicked");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_ratio(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_ratio(driver).sendKeys(sCtRatio);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_ratio(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Ratio completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_1(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_1(driver).sendKeys(sCtSerialNum1);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_1(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Serial Num (1) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_2(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_2(driver).sendKeys(sCtSerialNum2);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_2(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Serial Num (2) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_3(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_3(driver).sendKeys(sCtSerialNum3);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_3(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Serial Num (3) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_class(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_class(driver).sendKeys(sCtClass);
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_class(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Class completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_burden_in_va(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_burden_in_va(driver).sendKeys(sCtBurden);
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_burden_in_va(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Burden in VA completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button clicked");
		}
				
	// END OF ADD SUCCESS VALUES ALL LV METHOD
	}
	

	/* **************************************************************************************************
	* Function: addSuccessValuesCop2Hv
	* Author: Charlotte Jones
	* Date: 22/08/2018
	* Purpose: This method adds the required responses in the VT/CT Information for DNO/BNO and
	* Additional Equipment section for a happy path scenario
	* Arguments: 	sCtVtSerialNo
	* 				sCtRatio
	* 				sCtSerialNo1
	* 				sCtSerialNo2
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValuesCop2Hv(WebDriver driver, String sTestCaseName) throws Exception{
	
	
		// *!*!*!*!*!*!*
		
		String 	sCtRatio = "";
		String	sCtSerialNum1 = "";
		String 	sCtSerialNum2 = "";
		String 	sCtSerialNum3 = "";
		String 	sCtClass = "Class B";
		String 	sCtBurden = "2";
		Integer iVtRatio = 6;
		String 	sVtSerialNum1 = "";
		String 	sVtSerialNum2 = "";
		String 	sVtSerialNum3 = "";
		String 	sVtClass = "";
		Integer	iVtBurden = 2;
		
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_serial_num_to_enter(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_serial_num_to_enter(driver).sendKeys(sCtSerialNum1);
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_serial_num_to_enter(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT/VT Information Accesible? CT Available clicked");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.btn_ct_info_available(driver).click();
		{
			Log.info(sTestCaseName + " | CT/VT Information Accesible? CT Available clicked");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_ratio(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_ratio(driver).sendKeys(sCtRatio);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_ratio(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Ratio completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_1(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_1(driver).sendKeys(sCtSerialNum1);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_1(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Serial Num (1) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_2(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_2(driver).sendKeys(sCtSerialNum2);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_2(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Serial Num (2) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_3(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_3(driver).sendKeys(sCtSerialNum3);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_ct_serial_num_3(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Serial Num (3) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_class(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_class(driver).sendKeys(sCtClass);
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_class(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Class completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_burden_in_va(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_burden_in_va(driver).sendKeys(sCtBurden);
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_ct_burden_in_va(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | CT Burden in VA completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.btn_vt_info_available(driver).click();
		{
			Log.info(sTestCaseName + " | CT/VT Information Accesible? VT Available clicked");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_vt_ratio(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_vt_ratio(driver).sendKeys(Integer.toString(iVtRatio));
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_vt_ratio(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | VT Ratio completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_1(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_1(driver).sendKeys(sVtSerialNum1);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_1(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | VT Serial Num (1) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_2(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_2(driver).sendKeys(sVtSerialNum2);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_2(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | VT Serial Num (2) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_3(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_3(driver).sendKeys(sVtSerialNum3);
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_serial_num_3(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | VT Serial Num (3) completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_vt_class(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_vt_class(driver).sendKeys(sVtClass);
		CI_Objects_Vt_Ct_Info_Dno_Bno.cbx_vt_class(driver).sendKeys(Keys.ENTER);
		{
			Log.info(sTestCaseName + " | VT Class completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_burden_in_va(driver).click();
		CI_Objects_Vt_Ct_Info_Dno_Bno.txt_vt_burden_in_va(driver).sendKeys(Integer.toString(iVtBurden));
		{
			Log.info(sTestCaseName + " | VT Burden in VA completed");
		}
		
		CI_Objects_Vt_Ct_Info_Dno_Bno.btn_next_section(driver).click();
		{
			Log.info(sTestCaseName + " | Next Section button clicked");
		}
				
	// END OF ADD SUCCESS VALUES COP2 HV METHOD
	}
	

	
		
	
	
//END OF METHODS
}