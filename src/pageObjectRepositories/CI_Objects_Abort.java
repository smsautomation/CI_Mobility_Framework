package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 06/07/2018
* Function: CI_Objects_Abort
* Purpose: This class contains all of the elements in the C&I Abort sections
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

public class CI_Objects_Abort {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_Abort";

      public static class CANCELLATION_ABORT_REASON{
      
    	// ******* need to work out how to do this section *******  
    	  
    	public static WebElement btn_cancel_abort_reason(WebDriver driver) {
    	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_cancel_abort_reason not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    
      }
   
  		public static WebElement txt_addnl_notes(WebDriver driver) {
    	
  			try {
  				element = driver.findElement(By.id(INSERTID));
  			}catch(Exception e) {
  				Log.error(sRepositoryName + " |txt_addnl_notes not found | Exception desc : "+e.getMessage());
  			}
  			return element;
  		}
			
    	public static WebElement btn_photo_abort(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_photo_abort not found | Exception desc : "+e.getMessage());
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
    	
    	public static WebElement btn_cancel(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_cancel not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	// Aborting: Re-scan Assets Dialog
    	
    	public static WebElement btn_ok(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_ok not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
    	// ******** don't know if this is the same cancel button as above - will need to check! *********
    	public static WebElement btn_cancel_2(WebDriver driver) {
        	
    		try {
    			element = driver.findElement(By.id(INSERTID));
    		}catch(Exception e) {
    			Log.error(sRepositoryName + " |btn_cancel_2 not found | Exception desc : "+e.getMessage());
    		}
    		return element;
    	}
    	
  		
//END OF METHODS	    
}
