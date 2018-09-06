package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 23/08/2018
* Function: CI_Objects_Metering_Tasks
* Purpose: This class contains all of the elements in the C&I
* 	Display Meter Details section - this is written directly from the
* 	workflow and not the doc - changes were made in this area
* Arguments: 
* 			
* Returns: 
**********************************************************************
* Change Log:
* 
* Date:
* Author: 
* Details:
*
*********************************************************************/

public class CI_Objects_Current_Meter_Details {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Metering_Tasks";

public static class First_Meter_Details{    
    
    public static WebElement btn_below_meter_details_correct_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldTrue1DMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_below_meter_details_correct_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_below_meter_details_correct_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldFalse1DMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_below_meter_details_correct_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    	}
    
    public static WebElement txt_meter_serial_number(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterSerialNoDMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_meter_serial_number not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }    
    
    public static WebElement cbx_manufacturer_letter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterManDMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_manufacturer_letter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_meter_type(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterTypeDMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_meter_type not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_ct_ratio(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterCTTypeDMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_ct_ratio not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_vt_ratio(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterVTRatioDMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_vt_ratio not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_baud_rate(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterBaudRateDMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_baud_rate not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_fuse_size(WebDriver driver) {	// went through workflow as HV CT - this field is not applicable then - need to be LV CT or WC
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_fuse_size not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_ssc_code(WebDriver driver) {	// went through workflow as HV CT - this field is not applicable then - need to be WC
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_ssc_code not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_meter_loc_code(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterLocationSelectDMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_meter_loc_code not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_comms_num(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterCommsNumDMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_comms_num not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_ip_num(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterIPDMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_ip_num not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_cop_type(WebDriver driver) {	//  not mentioned in workflow doc
    	
    	try {
    		element = driver.findElement(By.id("meterCopTypeDMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_cop_type not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_max_site_capacity(WebDriver driver) {	//  not mentioned in workflow doc
    	
    	try {
    		element = driver.findElement(By.id("meterMSCDMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_cop_type not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_num_of_registers(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterNoRegistersDMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_num_of_registers not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_are_meter_details_corrected_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldTrue2DMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_are_meter_details_corrected not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_are_meter_details_corrected_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldFalse2DMD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_are_meter_details_corrected not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_able_to_read_meter_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-radioUnableToReadFalseMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_read_meter_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }   
   
    public static WebElement btn_able_to_read_meter_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-radioUnableToReadTrueMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_read_meter_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 
    
    public static WebElement txt_no_installed_meter_reading(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails0-ranotesMRD-0")); 
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_no_installed_meter_reading not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
//	END OF FIRST METER DETAILS CLASS
}   
    


public static class Second_Meter_Details {    
    
    public static WebElement btn_below_meter_details_correct_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldTrue1DMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_below_meter_details_correct_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_below_meter_details_correct_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldFalse1DMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_below_meter_details_correct_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    	}
    
    public static WebElement txt_meter_serial_number(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterSerialNoDMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_meter_serial_number not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }    
    
    public static WebElement cbx_manufacturer_letter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterManDMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_manufacturer_letter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_meter_type(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterTypeDMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_meter_type not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_ct_ratio(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterCTTypeDMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_ct_ratio not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_vt_ratio(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterVTRatioDMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_vt_ratio not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_baud_rate(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterBaudRateDMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_baud_rate not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_fuse_size(WebDriver driver) {	// went through workflow as HV CT - this field is not applicable then - need to be LV CT or WC
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_fuse_size not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_ssc_code(WebDriver driver) {	// went through workflow as HV CT - this field is not applicable then - need to be WC
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_ssc_code not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_meter_loc_code(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterLocationSelectDMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_meter_loc_code not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_comms_num(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterCommsNumDMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_comms_num not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_ip_num(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterIPDMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_ip_num not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_cop_type(WebDriver driver) {	//  not mentioned in workflow doc
    	
    	try {
    		element = driver.findElement(By.id("meterCopTypeDMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_cop_type not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_max_site_capacity(WebDriver driver) {	//  not mentioned in workflow doc
    	
    	try {
    		element = driver.findElement(By.id("meterMSCDMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_cop_type not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_num_of_registers(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterNoRegistersDMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_num_of_registers not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_are_meter_details_corrected_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldTrue2DMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_are_meter_details_corrected not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_are_meter_details_corrected_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldFalse2DMD-1"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_are_meter_details_corrected not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_able_to_read_meter_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-radioUnableToReadFalseMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_read_meter_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }   
   
    public static WebElement btn_able_to_read_meter_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-radioUnableToReadTrueMRD-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_read_meter_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 
    
    public static WebElement txt_no_installed_meter_reading(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("displaymeterdetails1-ranotesMRD-0")); 
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_no_installed_meter_reading not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
//	END OF SECOND METER DETAILS CLASS
}   




    /*
    public static WebElement txt_total_kwh_imp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kwh_imp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    */
    
    // from Final Meter Reading section of the workflow
    
    public static WebElement txt_total_kwh_exp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kwh_exp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_1_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_1_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_2_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_2_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_quad_3_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_3_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
	
    public static WebElement txt_quad_4_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad_4_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvarh_imp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvarh_imp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvarh_exp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvarh_exp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kvah(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvah not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_2 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_3(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_3 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_4(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_4 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_5(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_5 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rate_6(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate_6 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_kw_max_demand(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_kw_max_demand not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_kva_max_demand(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_kva_max_demand not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_add_other_reg(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btnAddNewOtherRegisterMRD"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_add_other_reg not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_other_reg_read(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_other_reg_read not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_other_reg_name(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_other_reg_name not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_add_found_asset(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btnNextCommDMD"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_add_found_asset not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_continue_with_job_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldTrue3DMD"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_continue_with_job_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_continue_with_job_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldFalse3DMD"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_continue_with_job_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
 

			
//END OF METHODS	    
}
