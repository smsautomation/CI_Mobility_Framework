package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Charlotte Jones
* Date: 06/07/2018
* Function: CI_Objects_No_Access_To_Site_No_Cust
* Purpose: This class contains all of the elements in the C&I No Access to Site: No Customer On Site section
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

public class CI_Objects_No_Access_To_Site_No_Cust {
   
    private static WebElement element = null;
    private static String sRepositoryName = "CI_Objects_No_AccesS_To_Site_No_Cust";

      
    public static WebElement btn_photo_no_access(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_photo_no_access not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    public static WebElement btn_abort_no_access(WebDriver driver) {
    	
    	try {
    		element = driver.findElement(By.id(INSERTID));
    	}catch(Exception e) {
    		Log.error(sRepositoryName + " |btn_abort_no_access not found | Exception desc : "+e.getMessage());
    	}
    	return element;
    }
    
    
  			
//END OF METHODS	    
}
