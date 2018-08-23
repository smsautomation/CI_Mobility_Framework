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

    
    public static WebElement btn_below_meter_details_correct_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldTrue"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_below_meter_details_correct_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_below_meter_details_correct_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldFalse"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_below_meter_details_correct_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    	}
    
    public static WebElement cbx_manufacturer_letter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_manufacturer_letter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_meter_type(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_meter_type not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_ct_ratio(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_ct_ratio not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_vt_ratio(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_vt_ratio not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_baud_rate(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_baud_rate not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_fuse_size(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_fuse_size not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_ssc_code(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_ssc_code not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_meter_loc_code(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_meter_loc_code not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_comms_num(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_comms_num not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_ip_num(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_ip_num not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_cop_type(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_cop_type not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_max_site_capacity(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_cop_type not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_num_of_registers(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_num_of_registers not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_are_meter_details_corrected_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldTrue"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_are_meter_details_corrected not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_are_meter_details_corrected_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldFalse"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_are_meter_details_corrected not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_able_to_read_meter_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radioUnableToReadFalse"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_read_meter_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }   
   
    public static WebElement btn_able_to_read_meter_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radioUnableToReadTrue"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_read_meter_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 
    
    public static WebElement txt_no_installed_meter_reading(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("ranotes")); 
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_no_installed_meter_reading not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kwh_imp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kwh_imp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
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
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_add_found_asset not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_continue_with_job_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_continue_with_job_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_continue_with_job_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_continue_with_job_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    
    // not going to continue on with this at the moment, as it's not yet clear if there are more changes to make in this section 
    
    
    

    
    
    
	
			
//END OF METHODS	    
}
