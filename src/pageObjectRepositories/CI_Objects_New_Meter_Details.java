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

      
    public static WebElement txt_serial_no(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_serial_no not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_manufacturer_letter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_manufacturer_letter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement txt_meter_type(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_meter_type not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement txt_class(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_class not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement txt_edmi_serial_no(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_edmi_serial_no not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_feeder_no(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_feeder_no not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_outstation_no(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_outstation_no not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_outstation_no(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_outstation_no not found | Exception desc : "+e.getMessage());
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
    
    public static WebElement txt_cert_year_month(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_cert_year_month not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_ct_ratio_details(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_ct_ratio_details not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_vt_ratio_details(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_vt_ratio_details not found | Exception desc : "+e.getMessage());
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
    
    
   
    
	
			
//END OF METHODS	    
}
