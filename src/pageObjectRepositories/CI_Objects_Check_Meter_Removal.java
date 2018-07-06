package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 05/07/2018
* Function: CI_Objects_Check_Meter_Removal
* Purpose: This class contains all of the elements in the C&I Check Meter Removal section
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

public class CI_Objects_Check_Meter_Removal {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Check_Meter_Removal";

    // Remove Check Meter
    
    public static WebElement btn_isolated_supply_to_both(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_isolated_supply_to_both not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_check_meter_removed(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_check_meter_removed not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_reinstated_supply(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_reinstated_supply not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    
  		
//END OF METHODS	    
}
