package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 06/07/2018
* Function: CI_Objects_Found_Asset_Details
* Purpose: This class contains all of the elements in the C&I Found Asset Details section
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

public class CI_Objects_Found_Asset_Details {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Found_Asset_Details";

      
    public static WebElement btn_meter_serial_no(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_meter_serial_no not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    // Conditional Fields sub-section
    
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
    
    public static WebElement cbx_ssc_code(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_ssc_code not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_no_of_registers(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_no_of_registers not found | Exception desc : "+e.getMessage());
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
    
    public static WebElement cbx_old_meter_read_known_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_old_meter_read_known_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_old_meter_read_known_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_old_meter_read_known_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_unable_to_read_old_meter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_unable_to_read_old_meter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_no_removed_meter_reading(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_no_removed_meter_reading not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    // Removed Meter Reading(s) from Old Meter sub-section
    
  public static class REMOVED_METER_READS_OLD_METER{  
 
    public static WebElement cbx_dial_end(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_dial_end not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement cbx_units(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_units not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_total_kwh_imp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kw_imp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_total_kwh_exp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kw_exp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_quad1_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad1_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_quad2_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad2_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_quad3_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad3_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_quad4_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad4_kvarh not found | Exception desc : "+e.getMessage());
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
 
    public static WebElement txt_total_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_rate1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_rate2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate2 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_rate3(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate3 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_rate4(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate4 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_rate5(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate5 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_rate6(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate6 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_kwh_max_demand(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_kwh_max_demand not found | Exception desc : "+e.getMessage());
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
 
    public static WebElement txt_date_old_meter_removed(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_date_old_meter_removed not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
  }
  // END OF CLASS REMOVED_METER_READS_OLD_METER
  
 
    // Found Meter Readings sub-section
 
    public static WebElement btn_unable_to_read_found_meter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_unable_to_read_found_meter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_no_found__meter_reading(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_no_found_meter_reading not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    // Installed Meter Reading(s) from Found Meter
    
  public static class INSTALLED_METER_READS_FOUND_METER{  
 
    public static WebElement cbx_dial_end(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_dial_end not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement cbx_units(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_units not found | Exception desc : "+e.getMessage());
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
 
    public static WebElement txt_total_kwh_exp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kwh_exp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_quad1_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad1_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_quad2_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad2_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_quad3_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad3_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_quad4_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_quad4_kvarh not found | Exception desc : "+e.getMessage());
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
 
    public static WebElement txt_total_kvarh(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kvarh not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_rate1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_rate2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate2 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_rate3(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate3 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_rate4(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate4 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_rate5(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate5 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement txt_rate6(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rate6 not found | Exception desc : "+e.getMessage());
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
 
    // Complete Section sub-section
 
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
 
    public static WebElement btn_continue_with_job_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_continue_with_job_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement btn_photo_evidence(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_evidence not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
    public static WebElement btn_abort(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_abort not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
 
 
  }
  // END OF CLASS INSTALLED_METER_READS_FOUND_METER
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    
 
 
 
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  			
//END OF METHODS	    
}
