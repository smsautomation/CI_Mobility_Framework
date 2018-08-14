package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 13/08/2018
* Function: CI_Objects_Metering_Tasks
* Purpose: This class contains all of the elements in the C&I
* 	Display Meter Details section - this is written directly from the
* 	workflow and not the doc - changes were made in this area
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

public class CI_Objects_Current_Meter_Details {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Metering_Tasks";

      
    public static WebElement btn_below_meter_details_correct_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldTrue"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_below_meter_details_correct_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_below_meter_details_correct_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiotargetfieldFalse");
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_below_meter_details_correct_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    	}
    
    public static WebElement btn_able_to_read_meter_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(radioAbleToReadTrue)); //left this without quotes as, in the code, the ids need switching round
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_read_meter_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }   
   
    public static WebElement btn_able_to_read_meter_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(radioAbleToReadFalse)); //left this without quotes as, in the code, the ids need switching round
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_able_to_read_meter_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 
    
    public static WebElement txt_no_installed_meter_reading(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("ranotes")); 
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_no_installed_meter_reading not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_total_kwh_imp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(radioAbleToReadFalse)); 
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kwh_imp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 
    
    public static WebElement txt_total_kwh_imp(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(radioAbleToReadFalse)); 
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_total_kwh_imp not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    } 
    
    // not going to continue on with this at the moment, as it's not yet clear if there are more changes to make in this section 
    
    
    
    
    }
    
    
    
	
			
//END OF METHODS	    
}
