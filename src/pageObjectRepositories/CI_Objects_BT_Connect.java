package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 05/07/2018
* Function: CI_Objects_BT_Connect
* Purpose: This class contains all of the elements in the C&I BT Connect - BT Socket to Modem and Test Dial section
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

public class CI_Objects_BT_Connect {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_BT_Connect";

      
    public static WebElement btn_socket_live_y(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_socket_live_y not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_socket_live_n(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_socket_live_n not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    // Conditional Fields sub-section
    
    public static WebElement btn_bt_test_dial_completed(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_bt_test_dial_completed not found | Exception desc : "+e.getMessage());
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
