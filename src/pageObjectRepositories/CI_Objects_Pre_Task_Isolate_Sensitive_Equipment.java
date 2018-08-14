package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 04/07/2018
* Function: CI_Objects_Pre_Task_Isolate_Sensitive_Equipment
* Purpose: This class contains all of the elements in the C&I Pre-Task - Determine if Customer Needs to Isolate Sensitive Equipment section
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

public class CI_Objects_Pre_Task_Isolate_Sensitive_Equipment {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Pre_Task_Isolate_Sensitive_Equipment";

      
    public static WebElement btn_cust_isolated_equipment_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiohasCustomerIsolatedTrue"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_cust_isolated_equipment_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_cust_isolated_equipment_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiohasCustomerIsolatedFalse"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_cust_isolated_equipment_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }    
    
    public static WebElement btn_cust_isolated_equipment_na(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("radiohasCustomerIsolatedNull"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_cust_isolated_equipment_na not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }     
    
	public static WebElement txt_cust_isolated_equipment(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.id("senstiveEquipTextArea"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Sig_Strength_Vod not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}        
    
    public static WebElement btn_photo_current_install(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id("photopretasknaCustomerIsolated"));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_current_install not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }     

	
			
//END OF METHODS	    
}
