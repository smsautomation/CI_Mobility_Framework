package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Metering_Tasks
* Purpose: This class contains all of the elements in the C&I Current Meter Details section
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

public class CI_Objects_Display_Meter_Details {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Metering_Tasks";

      
    public static WebElement txt_no_of_registers(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_no_of_registers not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_existing_serial_no_correct_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_existing_serial_no_correct_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_existing_serial_no_correct_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_existing_serial_no_correct_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_new_meter_found_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_new_meter_found_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    /* not sure we'll be needing this from looking at the workflow
    public static WebElement btn_new_meter_found_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_new_meter_found_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    */
    
    public static WebElement btn_continue_with_job_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldTrue"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_continue_with_job_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_continue_with_job_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldFalse"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_continue_with_job_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    
	
			
//END OF METHODS	    
}
