package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 06/07/2018
* Function: CI_Objects_No_Access_To_Site_Cust_On_Site
* Purpose: This class contains all of the elements in the C&I No Access to Site: Customer On Site section
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

public class CI_Objects_No_Access_To_Site_Cust_On_Site {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_No_Access_To_Site_Cust_On_Site";

      
    public static WebElement btn_photo_no_access_cust(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_no_access_cust not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_suspend_job_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_suspend_job_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_suspend_job_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_suspend_job_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_suspend_job_notes(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_suspend_job_notes not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_reschedule_required_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_reschedule_required_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_reschedule_required_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_reschedule_required_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    
  
  			
//END OF METHODS	    
}
