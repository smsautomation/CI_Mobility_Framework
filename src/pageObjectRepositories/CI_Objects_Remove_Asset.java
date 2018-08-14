package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Remove_Asset
* Purpose: This class contains all of the elements in the C&I Remove Asset section
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

public class CI_Objects_Remove_Asset {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Remove_Asset";

    
    public static WebElement cbx_meter_to_remove(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_meter_to_remove not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_delete_removed_asset(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_delete_removed_asset not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
        
    public static WebElement cbx_removed_asset_status(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_removed_asset_status not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_confirm_asset_removed_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldTrue"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_confirm_asset_removed_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_confirm_asset_removed_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldFalse"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_confirm_asset_removed_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    /*
    public static WebElement btn_ok(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_ok for Removed List Successfully Updated not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    */
    
    public static WebElement btn_next_section(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(btnNextComm)); // left this id without quotes as the id is a duplicate of the one above
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_next_section not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_add_removed_meter(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(btnNextComm));  // left this id without quotes as the id is a duplicate of the one above
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_add_removed_meter not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
			
//END OF METHODS	    
}
