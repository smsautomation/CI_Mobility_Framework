package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 05/07/2018
* Function: CI_Objects_Post_Install_Checks
* Purpose: This class contains all of the elements in the C&I Post Installation Checks (for Whole Current 1PH/3PH Metering) and (for LV/HV CT Metering) sections
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

public class CI_Objects_Post_Install_Checks_WC {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Post_Install_Checks_WC";

      
    public static WebElement btn_polarity_check_correct(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_polarity_check_correct not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_phase_rotation_correct(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_phase_rotation_correct not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    public static WebElement btn_approved_cable_markers(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_approved_cable_markers not found | Exception desc : "+e.getMessage());
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

    public static WebElement btn_all_seals_intact(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_all_seals_intact not found | Exception desc : "+e.getMessage());
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

    
    public static WebElement btn_visual_inspection_completed(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_visual_inspection_completed not found | Exception desc : "+e.getMessage());
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

    public static WebElement txt_maintenance_work(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_maintenance_work not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }

    
    // Additional Maintenance Work Carried Out sub-section
    
    public static WebElement btn_replacement_meter_board(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_replacement_meter_board not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_meter_tails_changed(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_meter_tails_changed not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_replaced_main_fuse(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_replaced_main_fuse not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_emergency_job(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_emergency_job not found | Exception desc : "+e.getMessage());    	}
    	return element;
    }
    
    // Final Photographic Evidence sub-section
    
    // *!*!*!*!*!*!* Not sure if this will be the same button and therefore the elements need changing *!*!*!*!*!*!*
    
    public static WebElement btn_photo_martindale_test_1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_martindale_test_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_photo_martindale_test_2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_martindale_test_2 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_photo_martindale_test_3(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_martindale_test_3 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
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
    
    public static WebElement btn_photo_close_up_sticker_1(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_close_up_sticker_1 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_photo_close_up_sticker_2(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_close_up_sticker_2 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_photo_close_up_sticker_3(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_close_up_sticker_3 not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
	
			
//END OF METHODS	    
}
