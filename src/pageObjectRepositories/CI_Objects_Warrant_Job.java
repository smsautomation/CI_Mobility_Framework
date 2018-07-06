package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 06/07/2018
* Function: CI_Objects_Warrant_Job
* Purpose: This class contains all of the elements in the C&I Warrant Job section
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

public class CI_Objects_Warrant_Job {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Warrant_Job";

      
    public static WebElement btn_de_energise_supply_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_de_energise_supply_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_de_energise_supply_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_de_energise_supply_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_reason_not_de_energising(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_reason_not_de_energising_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_meter_exch_requested_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_meter_exch_requested_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_meter_exch_requested_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_meter_exch_requested_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_can_meter_be_exchanged_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_can_meter_be_exchanged_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_can_meter_be_exchanged_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_can_meter_be_exchanged_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_reason_no_meter_exch(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_reason_no_meter_exch not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
   
			
//END OF METHODS	    
}
