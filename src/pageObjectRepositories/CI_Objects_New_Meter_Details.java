package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_New_Meter_Details
* Purpose: This class contains all of the elements in the C&I New Meter Details section
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

public class CI_Objects_New_Meter_Details {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_New_Meter_Details";

     
    public static WebElement btn_add_addnl_asset(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btnNextCommNMCI")); 
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_add_addnl_asset not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_delete_new_meter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.className("content-row-right10"));	// no id for these yet (if ever there would be one)
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_delete_new_meter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_serial_num(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterSerialNMCI-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_serial_num not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_manufacturer_letter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("selectmeterMan1NMCI-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_manufacturer_letter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement cbx_meter_type(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("selectmeterType1NMCI-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_meter_type not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement cbx_class(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterClassNMCI-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_class not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement txt_edmi_serial_num(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterEdmiNMCI-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_edmi_serial_num not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_feeder_num(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterFeederNumNMCI-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_feeder_num not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_outstation_num(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterOutstationNumNMCI-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_outstation_num not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 
    
    public static WebElement cbx_ssc_code(WebDriver driver) {  // need to run through workflow with WC meter to have this field visible
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_ssc_code not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_meter_loc_code(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterLocNMCI-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_meter_loc_code not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_num_of_registers(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterRegNoNMCI-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_num_of_registers not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_cert_year_month(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterCertNMCI-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_cert_year_month not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_num_of_dials(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterDialsNumNMCI-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_ct_ratio_primary not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_ct_ratio_primary(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterCTRatioNMCI-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_ct_ratio_primary not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_ct_ratio_secondary(WebDriver driver) {	// currently the workflow has one textbox for CT Ratio
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_ct_ratio_secondary not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
   
    
    public static WebElement cbx_vt_ratio_primary(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterVTRatioNMCI-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_vt_ratio_details not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_vt_ratio_secondary(WebDriver driver) {	// currently the workflow has one textbox for VT Ratio
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_vt_ratio_details not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_baud_rate(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("meterBaudRateNMCI-0"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_baud_rate not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_next_section(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("btnNextCommNMCI"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_next_section not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
   
    
	
			
//END OF METHODS	    
}
