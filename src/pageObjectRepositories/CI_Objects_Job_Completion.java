package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 06/07/2018
* Function: CI_Objects_Job_Completion
* Purpose: This class contains all of the elements in the C&I Job Completion section
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

public class CI_Objects_Job_Completion {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Job_Completion";

      
    public static WebElement btn_cust_agree_to_info(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_cust_agree_to_info not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_signature(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_signature not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_cust_rep_signed(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_cust_rep_signed not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_rep_name(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_rep_name not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_cust_refused_to_sign(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_cust_refused_to_sign not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_cust_signature_capture(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_cust_signature_capture not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_job_completed(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_job_completed not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement cbx_visit_outcome(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |cbx_visit_outcome not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement txt_comments(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |txt_comments not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_exit_card_left(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_exit_card_left not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_job_complete_submit(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_job_complete_submit not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    

 		
//END OF METHODS	    
}
