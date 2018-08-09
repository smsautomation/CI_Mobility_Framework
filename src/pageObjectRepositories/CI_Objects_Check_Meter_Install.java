package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 05/07/2018
* Function: CI_Objects_Check_Meter_Install
* Purpose: This class contains all of the elements in the C&I Check Meter Install section
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

public class CI_Objects_Check_Meter_Install {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Check_Meter_Install";

    // Install Check Meter  
    
    public static WebElement btn_isolated_supply(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_isolated_supply not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_serial_num(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_serial_num not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    // Check Meter Reading
    
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
