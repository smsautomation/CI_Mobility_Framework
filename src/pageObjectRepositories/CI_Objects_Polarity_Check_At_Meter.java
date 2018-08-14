package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Polarity_Check_At_Meter
* Purpose: This class contains all of the elements in the C&I Polarity Check at the Meter section
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

public class CI_Objects_Polarity_Check_At_Meter {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Polarity_Check_At_Meter";

      
    public static WebElement btn_polarity_check_at_meter_pass(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiopolarityCheckAtMeterTrue"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_polarity_check_at_meter_pass not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_polarity_check_at_meter_fail(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiopolarityCheckAtMeterTrue"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_polarity_check_at_meter_fail not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_polarity_check_at_meter_fail(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("ranotes"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_polarity_check_at_meter_fail not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    // *!*!*!*!*!*!* the 2 fields below aren't stipulated in the workflow doc - but i don't suppose they're harming *!*!*!*!*!*!*
    
    public static WebElement btn_corrected_polarity_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiocorrectPolarityTrue"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_corrected_polarity_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_corrected_polarity_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiocorrectPolarityFalse"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_corrected_polarity_n not found | Exception desc : "+e.getMessage());
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
    
    

			
//END OF METHODS	    
}
