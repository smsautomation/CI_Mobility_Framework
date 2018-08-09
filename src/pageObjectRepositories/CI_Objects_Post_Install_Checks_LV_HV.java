package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 05/07/2018
* Function: CI_Objects_Post_Install_Checks
* Purpose: This class contains all of the elements in the C&I Post Installation Checks (for LV/HV Metering) section
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

public class CI_Objects_Post_Install_Checks_LV_HV {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Post_Install_Checks_LV_HV";

         
    public static WebElement btn_phase_rotation_correct(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_rotation_correct not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement btn_terminal_screw_tightness(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_terminal_screw_tightness not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement btn_ct_run_position(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_ct_run_position not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement cbx_earth_type(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_earth_type not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement btn_addnl_maintenance_work(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_addnl_maintenance_work not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement txt_notes_maintenance_work(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_notes_maintenance_work not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    
 
    // Final Photographic Evidence sub-section
    
    // *!*!*!*!*!*!* Not sure if this will be the same button and therefore the elements need changing *!*!*!*!*!*!*
    
 
    public static WebElement btn_photo_final_meter_install_1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_final_meter_install_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_photo_final_meter_install_2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_final_meter_install_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_photo_final_meter_install_3(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_final_meter_install_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_photo_close_up_1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_close_up_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_photo_close_up_2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_close_up_2 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_photo_close_up_3(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_close_up_3 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
	
			
//END OF METHODS	    
}
